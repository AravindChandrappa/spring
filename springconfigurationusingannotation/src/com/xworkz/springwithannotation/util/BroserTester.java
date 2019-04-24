package com.xworkz.springwithannotation.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.springwithannotation.component.Browser;

public class BroserTester {
	public static void main(String[] args) {
		
		ApplicationContext container=new ClassPathXmlApplicationContext("resources/spring.xml");
		
		Browser browser=container.getBean(Browser.class);
		System.out.println(browser);
	}

}
