package com.xworkz.springwithannotation.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Internate {

	@Value("dan dana dan")
	private String planName;
	@Value("499")
	private int planCost;
	
	public Internate() {
		System.out.println("Created\t"+this.getClass().getSimpleName());
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public int getPlanCost() {
		return planCost;
	}

	public void setPlanCost(int planCost) {
		this.planCost = planCost;
	}

	@Override
	public String toString() {
		return "Internate [planName=" + planName + ", planCost=" + planCost + "]";
	}
	
}
