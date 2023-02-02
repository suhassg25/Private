package com.ty.one;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype") // it's used to provide a new object rather than giving same old object present inside container
public class Food {

	void eat()
	{
		System.out.println("Food is ready");
	}
}
