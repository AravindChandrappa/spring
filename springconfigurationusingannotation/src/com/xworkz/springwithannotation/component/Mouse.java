package com.xworkz.springwithannotation.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//if you @Component above class it will create bean object without bean tag in xml by using component-scan tag
@Component
public class Mouse {

	private String color;
	
	public Mouse() {
		System.out.println("Created\t "+this.getClass().getSimpleName());
		
	}
	//This setter way of property intialization in annotation
	@Value("Creamy white")
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
}
