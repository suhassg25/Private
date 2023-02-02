package com.ty.dto8autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bike")
@Primary //if we forget to mention qualifer it will invoke bike object
public class Bike implements Items {
	
	public void used() {
		System.out.println("Used to ride");
		

	}

}
