package com.xworkz.depdncyinjection.component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component("Jboss")
public class Jboss implements Iserver {

	@Override
	public boolean deploy() {
		System.out.println("Your application server is\t" + this.getClass().getSimpleName());
		return true;
	}

}
