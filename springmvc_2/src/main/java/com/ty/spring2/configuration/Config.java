package com.ty.spring2.configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.ty.spring2"})
public class Config {
	
	
	@Bean(name = "em")
	@Scope(value = "prototype")
	public EntityManager entityManager ()
	{
		return Persistence.createEntityManagerFactory("spring").createEntityManager();
	}
}
