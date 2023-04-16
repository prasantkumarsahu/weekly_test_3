package com.prasant.WeeklyTest3.SendMailJava;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MailAuthenticator extends Authenticator {

	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		
		return new PasswordAuthentication(MailConstants.SENDER, "emiocszwhoatuzwp");
	}
	
	
}
