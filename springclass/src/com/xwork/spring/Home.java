package com.xwork.spring;

public class Home {

	private int doorNo;
	private String name;
	
	public Home() {

		System.out.println("Created\t"+this.getClass().getName());
	}
	public Home(int doorNo,String name)
	
	{
		System.out.println("Created parameterized constructor\t"+this.getClass().getName());
		this.doorNo=doorNo;
		this.name=name;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
