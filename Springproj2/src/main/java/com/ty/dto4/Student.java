package com.ty.dto4;

public class Student {

	private String name;
	private String school;
	private Teacher teacher;

	public String getName() {
		return name;
	}

	public String getSchool() {
		return school;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public Student(String name, String school, Teacher teacher) {
		super();
		this.name = name;
		this.school = school;
		this.teacher = teacher;
	}

}
