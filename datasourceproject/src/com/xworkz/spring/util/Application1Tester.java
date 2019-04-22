package com.xworkz.spring.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.Application1;

public class Application1Tester {

	public static void main(String[] args) {
		
		ApplicationContext container=new ClassPathXmlApplicationContext("resources/context.xml");
		
		Application1 application1=container.getBean(Application1.class);
		System.out.println(application1);
	}
}
