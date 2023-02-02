package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.FemaleDto;


public class FemaleDao {

	public FemaleDto saveFeale(FemaleDto dto)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("suhas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();
		return dto;
	}
	
	public FemaleDto getByName(String name)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("suhas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.createQuery("Select s from FemaleDto s where s.name=1?",FemaleDto.class).setParameter(1, name).getSingleResult();
	}
	
	public List<FemaleDto> getAll()
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("suhas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.createQuery("Select s from FemaleDto s",FemaleDto.class).getResultList();
	}
	
	public void deleteById(int id)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("suhas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		FemaleDto d =entityManager.find(FemaleDto.class, id);
		if(d!=null) {
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(d);
			entityTransaction.commit();
		}
	}
}
