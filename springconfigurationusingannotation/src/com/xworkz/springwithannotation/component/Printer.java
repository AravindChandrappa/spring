package com.xworkz.springwithannotation.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Printer {

	private String name;
	// this property way of intializing value using annotation in spring
	@Value("G31098")
	private String model;
	private int price;

	// this constructor way of intializing value using annotation in spring
	@Autowired
	public Printer(@Value("canon") String name) {
		System.out.println("Created\t" + this.getClass().getSimpleName());
		this.name=name;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	// this setter way of intializing value using annotation in spring
	@Value("1200")
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Printer [name=" + name + ", model=" + model + ", price=" + price + "]";
	}

}
