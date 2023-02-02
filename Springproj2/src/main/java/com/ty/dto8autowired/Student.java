package com.ty.dto8autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("std")
public class Student {
	@Autowired // used to create object of has a relation ship object
	//@Qualifier("bike") //bike or pen Qualifier used to inject object of class without getting error
	
	Items item;
	
	public void use()
	{
		item.used();
	}

}
