package com.ty.dto9Primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass9 {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("primary.xml");
		Student student=applicationContext.getBean("sub",Student.class);
		student.use();
		
	}
}
