package com.xworkz.hotel.util;

import java.util.Arrays;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.hotel.app.Hotel;

public class SpringTester {

	public static void main(String[] args) {
		
		System.out.println("main method statred");
		System.out.println("-------------------------------------");

		String pathOfXml="resources/context.xml";
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(pathOfXml);
		BeanFactory beanFactory=new ClassPathXmlApplicationContext(pathOfXml);
		
		int noOfObject=applicationContext.getBeanDefinitionCount();
		System.out.println("Names bean objects is created.....");
		
		 System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
		
		System.out.println("-------------------------------------");
		
		System.out.println("noOfObject created\t"+noOfObject);
		
		System.out.println("-------------------------------------");
		Hotel refOfHotel=applicationContext.getBean("hotel1",Hotel.class);
		int total1=refOfHotel.orderItem("dosa", 3);
		System.out.println("Total price of order: "+total1);

		System.out.println("-------------------------------------");
		Hotel refOfHotel1=applicationContext.getBean("hotel2",Hotel.class);
		
		int total=refOfHotel1.orderItem("Idlyvada", 3);
		
		System.out.println("Total price of order: "+total);
	  
	}
}
