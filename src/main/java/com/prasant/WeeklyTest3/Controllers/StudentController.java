package com.prasant.WeeklyTest3.Controllers;

import com.prasant.WeeklyTest3.MyClasses.Student;
import com.prasant.WeeklyTest3.SendMailJava.HandleMail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    Student s1;

    @GetMapping("/student")
    public Student getStudent() throws Exception{

        HandleMail mail = new HandleMail();
        mail.sendMail(s1);
        return s1;
    }
}
