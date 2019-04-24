package com.xworkz.depdncyinjection.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Application {
	
	@Value("www.xworkz.in")
	private String name;
	@Autowired
	@Qualifier("Jboss")
	private Iserver iserver;
	
	@Override
	public String toString() {
		return "Application [name=" + name + ", iserver=" + iserver.getClass().getSimpleName() + "]";
	}

	public Application() {
		System.out.println("Created\t"+this.getClass().getSimpleName());
	}
	public void serverForApplication()
	{
		System.out.println("invoked serverForApplication");
		System.out.println(this.iserver.deploy());
		
	}

}
