package com.ty.dto11;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("5")
	private int id;
	@Value("think pad")
	private String name;
	@Value("Lenova")
	private String address;

	public int getId() {
		return id;
	}
	@Value("10")
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
