package com.prasant.WeeklyTest3.SendMailJava;

import com.prasant.WeeklyTest3.MyClasses.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@ComponentScan(basePackages = "")
public class HandleMail {

	public void sendMail(Student s1) throws Exception {
		
		// host : gmail is smtp
		String host = "smtp.gmail.com";
		
		Properties props = System.getProperties();
		
		System.out.println(props);
		
		// set propersties
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.auth", "true");
		
		// session
		Session mailSession = Session.getInstance(props, new MailAuthenticator());
		
		// create the message object
		MimeMessage mimeMessage = new MimeMessage(mailSession);
		
		// set sender
		mimeMessage.setFrom(MailConstants.SENDER);
		
		// set receiver
		mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(MailConstants.RECEIVER));
		
		// set subject
		mimeMessage.setSubject(MailConstants.SUBJECT);
		
		// set message
		mimeMessage.setText(s1.toString());
		
		Transport.send(mimeMessage);
	}
}
