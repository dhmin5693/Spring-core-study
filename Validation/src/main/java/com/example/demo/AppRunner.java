package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    Validator validator;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User user = new User();
//        UserValidator userValidator = new UserValidator();
        Errors errors = new BeanPropertyBindingResult(user, "user");

//        userValidator.validate(user, errors);
        validator.validate(user, errors);
        System.out.println(errors);

        for (ObjectError error : errors.getAllErrors()) {
            System.out.println("==== ERROR CODE ====");

            if (error.getCodes() == null) {
                continue;
            }

            for (String errorCode : error.getCodes()) {
                System.out.println(errorCode);
            }
            System.out.println(error.getDefaultMessage());
        }
    }
}