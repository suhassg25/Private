package com.ty.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDto {

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Id
	private String id;
	private String name;
	private String address;
	private String company;
	private double salary;
	
	
	
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
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
