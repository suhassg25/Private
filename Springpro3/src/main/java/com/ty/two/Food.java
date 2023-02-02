package com.ty.two;


import org.springframework.context.annotation.Scope;



@Scope(value = "prototype") // it's used to provide a new object rather than giving same old object present inside container
public class Food {

	void eat()
	{
		System.out.println("Food is ready");
	}
}
