package com.ty.dto7context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("mycontext.xml");
		Person person = applicationContext.getBean("person",Person.class);
		person.talk();
	}

}
