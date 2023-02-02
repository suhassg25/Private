package com.ty.dto4;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass4 {

	public static void main(String[] args) {

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("teacher.xml");
		Student student = beanFactory.getBean("std", Student.class);
		Teacher t = student.getTeacher();

		System.out.println(t.getName());
		System.out.println(t.getPhone());
		System.out.println(student.getName());
		System.out.println(student.getSchool());

	}
}
