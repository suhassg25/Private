package com.ty.two;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.ty.one"})
public class Config {
	@Bean(name = "food")
	
	public Food fo()
	{
		return new Food();
	}
	@PostConstruct
	public void start()
	{
		System.out.println("started");
	}
	@PreDestroy
	public void end()
	{
		System.out.println("ended");
	}
}
