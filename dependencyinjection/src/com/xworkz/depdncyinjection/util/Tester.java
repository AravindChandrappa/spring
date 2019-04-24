package com.xworkz.depdncyinjection.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.depdncyinjection.component.Application;

public class Tester {

	public static void main(String[] args) {
		
		ApplicationContext container= new ClassPathXmlApplicationContext("resources/spring.xml");
		
		Application refOfapplication=container.getBean(Application.class);
		
		refOfapplication.serverForApplication();
		
	}
}
