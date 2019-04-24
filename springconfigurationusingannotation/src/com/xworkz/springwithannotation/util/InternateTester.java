package com.xworkz.springwithannotation.util;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.springwithannotation.component.Browser;
import com.xworkz.springwithannotation.component.Internate;

public class InternateTester {

	public static void main(String[] args) {
		
		ApplicationContext container=new ClassPathXmlApplicationContext("resources/spring.xml");
		
		Internate internate=container.getBean(Internate.class);
		
		System.out.println("---------------------------------");
		System.out.println(container.getBeanDefinitionCount());
		
		System.out.println("---------------------------------");
		String[] beanNames= container.getBeanDefinitionNames();
		
		System.out.println(Arrays.toString(beanNames));
		
		
		
	}
}
