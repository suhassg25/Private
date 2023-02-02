package com.ty.jt.Config;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.ty.jt")
public class Config {

	@Bean
	@Scope(value = "prototype")
	public EntityManager em()
	{
		return Persistence.createEntityManagerFactory("javatask").createEntityManager();
	}
}
