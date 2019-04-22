package com.xworkz.spring.component;

public class Application1 {

	private int version;
	private String name;
	private String type;
	private boolean active;
	
	public Application1() {
		System.out.println("Created\t"+this.getClass().getSimpleName());
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Application1 [version=" + version + ", name=" + name + ", type=" + type + ", active=" + active + "]";
	}
	
}
