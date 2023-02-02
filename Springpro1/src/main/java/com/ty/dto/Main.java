package com.ty.dto;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		BeanFactory beanFactory=new ClassPathXmlApplicationContext("mySpring.xml");
		Person p=(Person)beanFactory.getBean("person");
		p.talk();
	}
}
