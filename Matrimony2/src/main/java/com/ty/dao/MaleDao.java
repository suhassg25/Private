package com.ty.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.MaleDto;

public class MaleDao {

	public MaleDto saveMale(MaleDto dto)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("suhas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();
		return dto;
	}
	
	public MaleDto getByName(String name)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("suhas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.createQuery("Select s from MaleDto s where s.name=?1",MaleDto.class).setParameter(1, name).getSingleResult();
	}
	
	public List<MaleDto> getAll()
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("suhas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.createQuery("Select s from MaleDto s",MaleDto.class).getResultList();
	}
	
	public void deleteById(int id)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("suhas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		MaleDto d =entityManager.find(MaleDto.class, id);
		if(d!=null) {
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(d);
			entityTransaction.commit();
		}
	}
	
}
