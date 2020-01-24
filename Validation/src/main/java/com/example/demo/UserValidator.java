package com.example.demo;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "notEmpty", "id cannot be empty.");

        if (((User) o).getId() == null) {
            errors.reject("Oh my god!");
        }
    }
}