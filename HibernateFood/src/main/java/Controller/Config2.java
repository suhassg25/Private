package Controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import dto.FoodOrder;
@Configuration
@ComponentScan(basePackages = "dao")
public class Config2 {
	
	@Bean( value = "emf")
	public EntityManagerFactory emf()
	{
		return Persistence.createEntityManagerFactory("HM");
	}
	@Bean( value = "em")
	public EntityManager em()
	{
		return emf().createEntityManager();
	}
	@Bean( value = "et")
	public EntityTransaction et()
	{
		return em().getTransaction();
	}
	
}
