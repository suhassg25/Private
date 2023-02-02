package com.ty.two;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mainclass2 {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
		Food food= applicationContext.getBean("food",Food.class);
		Food food1= applicationContext.getBean("food",Food.class);
		System.out.println(food);
		System.out.println(food1);
		food.eat();
		((AnnotationConfigApplicationContext)applicationContext).close();
	
	}
	
}
