package com.ty.dto9Primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("sub")
public class Student {
	
	@Autowired
	@Qualifier("english")
	Subject subject;
	
	public void use()
	{
		subject.info();
	}

}
