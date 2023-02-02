package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dto.Hospital;

public class HospitalDao {

	public Hospital saveHospital(Hospital hospital){
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("hospital");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();
		return hospital;
	}
	
	public List<Hospital> getAll()
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("hospital");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("Select h from Hospital h");
		return query.getResultList();
	}
	
	
}

