package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dto.Student;

public class Logindao {
	

	public Student getStudent(String email)
	{

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("suhas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("SELECT a FROM Student a WHERE a.email=?1",Student.class);
		Student student2=(Student)query.setParameter(1,email).getSingleResult();
		return student2;
		
	
	}


}
