package com.ty.dto2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass2 {

	public static void main(String[] args) {
		BeanFactory beanFactory=new ClassPathXmlApplicationContext("emp.xml");
		Employee e=beanFactory.getBean("emp",Employee.class);
		System.out.println("name : "+e.getName());
		System.out.println("id : "+e.getId());
		System.out.println("address : "+e.getAddress());
		System.out.println("Phone : "+e.getPhone());
		
	}
}
