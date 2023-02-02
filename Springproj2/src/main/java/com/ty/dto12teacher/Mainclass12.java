package com.ty.dto12teacher;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass12 {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("teac.xml");
		Employee e=applicationContext.getBean("employee", Employee.class);
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getAddress());
		System.out.println(e.getTeacher().getName());
		System.out.println(e.getTeacher().getSchool());
	
	}
}
