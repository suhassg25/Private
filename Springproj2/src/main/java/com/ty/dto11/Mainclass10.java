package com.ty.dto11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass10 {
public static void main(String[] args) {
	
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myemp.xml");
	Employee employee=applicationContext.getBean("employee",Employee.class);
	
	
	
	System.out.println(employee.getId());
	System.out.println(employee.getName());
	System.out.println(employee.getAddress());
}
	
}
