package com.xworkz.springwithannotation.util;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.springwithannotation.component.Mouse;

public class MouseTester {

	public static void main(String[] args) {
		
		//To load xml two xml files into conainer either you can write two xml files in CPAC separated by , or you can use import tag in xml
		
		ApplicationContext container=new ClassPathXmlApplicationContext("resources/spring.xml","resources/hibernate.xml");
		
		Mouse refOfmouse=container.getBean(Mouse.class);
		int beanCount=container.getBeanDefinitionCount();
		System.out.println("------------------");
		System.out.println(beanCount);
		System.out.println("------------------");
		String[] beanNames=container.getBeanDefinitionNames();
		
		System.out.println(Arrays.toString(beanNames));
		System.out.println("------------------");
		
		System.out.println(refOfmouse.getColor());
	}
}
