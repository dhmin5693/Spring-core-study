package com.example.demo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 실행 시간 측정
 */
@Target(ElementType.METHOD)
public @interface Clock {
}