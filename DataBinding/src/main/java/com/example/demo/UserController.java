package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

//    @InitBinder
//    public void init(WebDataBinder binder) {
//        binder.registerCustomEditor(User.class, new UserPropertyEditor());
//    }

    @Autowired
    ConversionService conversionService;

    @GetMapping("/id/{user}")
    public String getUser(@PathVariable User user) {
        System.out.println(user);
        return String.valueOf(user.getId());
    }
}