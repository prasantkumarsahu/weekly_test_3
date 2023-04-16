package com.prasant.WeeklyTest3.CofigurationClass;

import com.prasant.WeeklyTest3.MyClasses.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfiguration {

    @Bean
    public Student getStudent(){
        return new Student("Prasant", "Sahu");
    }
}
