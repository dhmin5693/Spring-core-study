package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * Spring boot의 기능을 활용하지 않기 위해 @SpringBootApplication 주석처리
 */
//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// @SpringBootApplication과 마찬가지로 주석처리.
		// SpringApplication.run(DemoApplication.class, args);

		/**
		 * Bean 생성 방법 1 (Annotation)
		 * 직접 Context를 생성하는 경우 DemoConfiguration.class를 등록하여 생성해야 한다.
		 * DemoConfiguraiton의 @Bean 두 개의 주석을 반드시 풀고 실행
		 * @see DemoConfiguration#demoRepository()
		 * @see DemoConfiguration#demoService(DemoRepository)
		 */
		ApplicationContext context = new AnnotationConfigApplicationContext(DemoConfiguration.class);
		String[] beanNames = context.getBeanDefinitionNames();

		for (String name : beanNames) {
			System.out.println(name);
		}

		DemoService demoService = (DemoService) context.getBean("demoService");

		/**
		 * Bean 생성 방법 2 (Application Context에 등록)
		 * 실행 전 DemoConfiguration에 @Bean 두 가지 주석처리하기 (아래 see 참조)
		 * @see DemoConfiguration#demoRepository()
		 * @see DemoConfiguration#demoService(DemoRepository)
		 */
//		SpringApplication app = new SpringApplication(DemoApplication.class);
//		app.addInitializers((ApplicationContextInitializer<GenericApplicationContext>) ctx -> {
//			ctx.registerBean(DemoRepository.class);
//			ctx.registerBean(DemoService.class);
//		});
//		app.run(args);
	}
}
