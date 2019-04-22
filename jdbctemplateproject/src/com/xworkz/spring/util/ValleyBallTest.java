package com.xworkz.spring.util;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.JdbcTemplateDemo;
import com.xworkz.spring.component.ValleyBallSports;

public class ValleyBallTest {

	public static void main(String[] args) {
		
		ApplicationContext container=new ClassPathXmlApplicationContext("resources/context.xml");
		
		System.out.println(container.getBeanDefinitionCount());
		
		String[] beanNames=container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));
		
		ValleyBallSports ballSports=new ValleyBallSports("groovy", 11, "india", "aravind");
		
		JdbcTemplateDemo ball=new JdbcTemplateDemo();
		ball.save(ballSports);
	}
}
