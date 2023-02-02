package com.ty.dto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dao.Student;

public class StudentDao {

	public Student saveStudent(Student student) {
		
				EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ONE");
				EntityManager entityManager=entityManagerFactory.createEntityManager();
				EntityTransaction entityTransaction=entityManager.getTransaction();
				entityTransaction.begin();
				entityManager.persist(student);
				entityTransaction.commit();
				return student;
	}
	public Student findStudentByEmail(String email)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ONE");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("SELECT a from Student a WHERE a.email=?1");
		return (Student) query.setParameter(1, email).getSingleResult();
	
		
	}
	public List<Student> getAll()
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ONE");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("SELECT a from Student a");
		return query.getResultList();
	
		
	}
	public Student getByID(int id)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ONE");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		 return entityManager.find(Student.class, id);
				
	}
	public Student delete(int id)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("ONE");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	Student student=entityManager.find(Student.class, id);
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.remove(student);
	entityTransaction.commit();
	return student;
	}
}
