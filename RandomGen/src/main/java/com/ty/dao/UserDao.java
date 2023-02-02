package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.UserDto;

public class UserDao {

	public UserDto saveUser(UserDto dto)
	{
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("randomidgen");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();	
		return dto;
	}
	
	public UserDto findUser(String id)
	{
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("randomidgen");
		EntityManager entityManager=entityManagerFactory.createEntityManager();		
		UserDto u =entityManager.find(UserDto.class, id);
		
		return u;
	}
	
	public List<UserDto> findall()
	{
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("randomidgen");
		EntityManager entityManager=entityManagerFactory.createEntityManager();		
		return entityManager.createQuery("Select a from UserDto a",UserDto.class).getResultList();
	}
	
	public UserDto update(UserDto dto)
	{
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("randomidgen");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(dto);
		entityTransaction.commit();	
		return dto;
	}
	
	public void delete(int id)
	{
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("randomidgen");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		UserDto u =entityManager.find(UserDto.class, id);
		
		entityTransaction.begin();
		entityManager.remove(u);
		entityTransaction.commit();	
	}
}
