package com.ty.dto6;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass6 {

	public static void main(String[] args) {
		
		BeanFactory beanFactory=new ClassPathXmlApplicationContext("hotel.xml");
		FoodOrder fo=beanFactory.getBean("fo",FoodOrder.class);
		Customer c=fo.getCustomer();
		System.out.println(fo.getId());
		System.out.println(fo.getName());
		System.out.println(fo.getTotalcost());
		System.out.println(fo.getHotel());
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getAddress());
		System.out.println(c.getPhone());
		System.out.println(c.getEmail());
		System.out.println(c.getPassword());
		
	}
}
