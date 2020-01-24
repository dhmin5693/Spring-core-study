package com.example.demo;

import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class AppRunner implements ApplicationRunner {

//    @Resource(name = "myProfile")
//    String myProfile;
//
//    @Value("${property1}")
//    String property1;
//
//    @Value("${property2}")
//    String property2;

    @Autowired
    MessageSource messageSource;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        System.out.println(myProfile);
//        System.out.println(property1);
//        System.out.println(property2);

        System.out.println(messageSource.getMessage("hello", null, Locale.getDefault()));
        System.out.println(messageSource.getMessage("hello", null, Locale.KOREAN));
        System.out.println(messageSource.getMessage("hello", null, Locale.ENGLISH));
    }
}