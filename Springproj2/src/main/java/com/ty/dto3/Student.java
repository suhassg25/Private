package com.ty.dto3;

public class Student {

	private int id;
	private String name;
	private long pno;
	
	Student(int id, String name, long pno)
	{
		this.id=id;
		this.name=name;
		this.pno=pno;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public long getPno() {
		return pno;
	}
	
}
