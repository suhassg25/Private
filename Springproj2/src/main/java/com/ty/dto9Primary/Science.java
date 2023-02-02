package com.ty.dto9Primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Science implements Subject {

	public void info() {
		System.out.println("reading Science");

	}

}
