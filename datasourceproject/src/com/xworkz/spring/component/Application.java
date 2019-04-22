package com.xworkz.spring.component;

public class Application {

	private String appName;
	
	public Application() {
		System.out.println("Created\t"+this.getClass().getSimpleName());	
		}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppName() {
		return appName;
	}
}
