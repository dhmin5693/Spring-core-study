package com.example.demo;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

public class UserConverter {

    // 상태 정보가 없기 때문에(stateless) bean으로 등록 가능!

//    @Component
    public static class StringToUserConverter implements Converter<String, User> {
        @Override
        public User convert(String s) {
            return new User(Integer.parseInt(s));
        }
    }

    public static class UserToStringConverter implements Converter<User, String> {
        @Override
        public String convert(User event) {
            return String.valueOf(event.getId());
        }
    }
}
