package com.xworkz.springwithannotation.util;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.springwithannotation.component.Printer;

public class PrinterTester {

	public static void main(String[] args) {
		
		ApplicationContext container=new ClassPathXmlApplicationContext("resources/spring.xml");
		
		Printer printer=container.getBean(Printer.class);
		System.out.println("----------------------");
		System.out.println(container.getBeanDefinitionCount());
		System.out.println("----------------------");
		String[] beanNames=container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));
		System.out.println("----------------------");
		System.out.println(printer);
	}
}
