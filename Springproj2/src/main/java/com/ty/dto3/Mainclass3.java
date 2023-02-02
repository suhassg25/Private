package com.ty.dto3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass3 {

	public static void main(String[] args) {
		
		BeanFactory beanFactory=new ClassPathXmlApplicationContext("student.xml");
		Student s=beanFactory.getBean("std",Student.class);
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getPno());
	}

}
