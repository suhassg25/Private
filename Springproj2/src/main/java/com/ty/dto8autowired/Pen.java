package com.ty.dto8autowired;

import org.springframework.stereotype.Component;

@Component()
public class Pen implements Items {
	
	public void used()
	{
		System.out.println("Used to write");
	}

}
