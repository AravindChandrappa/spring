package com.xworkz.springwithannotation.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Browser {

	private String name;
	private String version;
	@Value("true")
	private boolean openSource;
	
	@Autowired
	public Browser(@Value("12.67")String version) {
		System.out.println("Created\t"+this.getClass().getSimpleName());
		this.version=version;
	}

	public String getName() {
		return name;
	}

	@Value("yahoooo")
	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public boolean isOpenSource() {
		return openSource;
	}

	public void setOpenSource(boolean openSource) {
		this.openSource = openSource;
	}

	@Override
	public String toString() {
		return "Browser [name=" + name + ", version=" + version + ", openSource=" + openSource + "]";
	}
	
}
