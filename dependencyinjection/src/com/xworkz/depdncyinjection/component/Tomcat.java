package com.xworkz.depdncyinjection.component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component("Tomcat")
public class Tomcat implements Iserver {

	@Override
	public boolean deploy() {
		System.out.println("Tomcat server is deployed for application");
		return true;
	}

}
