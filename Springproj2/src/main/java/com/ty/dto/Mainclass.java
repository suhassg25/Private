package com.ty.dto;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Mainclass {

	public static void main(String[] args) {
	Resource resource = new ClassPathResource("animal.xml");
	BeanFactory beanFactory= new XmlBeanFactory(resource);
				//BeanFactory beanFactory= new ClassPathXmlApplicationContext("animal.xml"); 
		Animal animal=beanFactory.getBean("cow",Cow.class);
		animal.eats();
	}
}
