package com.ty.dto9Primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Kannada implements Subject {
	
	public void info() {
		System.out.println("Reading kannada");
	}

}
