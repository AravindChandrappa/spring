package com.xwork.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HomeTester {

	public static void main(String[] args) {

		String str="resources/context.xml";
		ApplicationContext container= new ClassPathXmlApplicationContext(str);
		Home refOfhome=container.getBean("home",Home.class);
		Home home1=container.getBean("home1",Home.class);
		System.out.println(refOfhome.hashCode());
		System.out.println(home1.getDoorNo());
		System.out.println(home1.getName());
	}
}
