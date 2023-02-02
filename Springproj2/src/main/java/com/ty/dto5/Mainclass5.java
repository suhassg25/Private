package com.ty.dto5;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass5 {

	public static void main(String[] args) {
		BeanFactory beanFactory=new ClassPathXmlApplicationContext("mobile.xml");
		Mobile mobile=beanFactory.getBean("sam",Samsung.class);
		Mobile mobile1=beanFactory.getBean("ip",Iphone.class);
		mobile.os();
		mobile1.os();
	}
	
}
