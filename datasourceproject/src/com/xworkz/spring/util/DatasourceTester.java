package com.xworkz.spring.util;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.Application;

public class DatasourceTester {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("resources/context.xml");
		
		System.out.println(container.getBeanDefinitionCount());
		
		String[] beanNames=container.getBeanDefinitionNames();
		
		System.out.println(Arrays.toString(beanNames));
		
		Application application=container.getBean(Application.class);
		System.out.println("Appliction appName by property:"+application.getAppName());
		
		
	}
}
