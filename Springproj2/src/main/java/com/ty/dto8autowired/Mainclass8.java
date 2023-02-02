package com.ty.dto8autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass8 {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("wire.xml");
		Student s=applicationContext.getBean("std",Student.class);
		s.use();
	}

}
