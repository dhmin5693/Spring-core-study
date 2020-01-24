package com.example.demo;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class UserFormatter implements Formatter<User> {

    @Override
    public User parse(String s, Locale locale) throws ParseException {
        return new User(Integer.parseInt(s));
    }

    @Override
    public String print(User user, Locale locale) {
        return String.valueOf(user.getId());
    }
}