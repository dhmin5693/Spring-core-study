package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Value("#{1 + 1}")
    private int val1;

    @Value("#{1 * 2}")
    private int val2;

    @Value("#{1 eq 1}")
    private boolean val3;

    @Value("${hello:default hello}")
    private String hello;

    @Value("#{'${hello} world'}")
    private String helloWorld;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("5 * 5");
        int expVal = exp.getValue(Integer.class);
        System.out.println(expVal);

        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(hello);
        System.out.println(helloWorld);
    }
}