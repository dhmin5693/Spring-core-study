package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ResourceLoader resourceLoader;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Resource resource = resourceLoader.getResource("classpath:/application.properties");
        System.out.println(resource.exists());

        ApplicationContext ctx = new ClassPathXmlApplicationContext("resource.xml");
        ApplicationContext ctx2 = new FileSystemXmlApplicationContext("resource.xml");

        Resource resource1 = new ClassPathResource("");
        Resource resource2 = new FileSystemResource("");
    }
}

//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        Resource resource1 = resourceLoader.getResource("classpath:/test.txt");
//        Resource resource2 = resourceLoader.getResource("classpath:/application.properties");
//        System.out.println(resource1.exists());
//        System.out.println(resource2.exists());
//
//        ApplicationContext ctx  = new ClassPathXmlApplicationContext("resource.xml");
//        ApplicationContext ctx2 = new FileSystemXmlApplicationContext("resource.xml");
//    }