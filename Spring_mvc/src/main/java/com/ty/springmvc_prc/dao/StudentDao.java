package com.ty.springmvc_prc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.springmvc_prc.dto.Student;

@Repository
public class StudentDao {

		@Autowired
	private EntityManagerFactory entityManagerFactory;
		
		public Student saveStudent(Student student)
		{
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(student);
			entityTransaction.commit();
			return student;
			
		}
		
		public Student updateStudent(Student student)
		{
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			return student;
			
		}
		
		public Student deleteStudent(int id)
		{
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			Student student=entityManager.find(Student.class, id);
			
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(student);
			entityTransaction.commit();
			return student;
			
		}
		public Student findStudent(int id)
		{
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			Student student=entityManager.find(Student.class, id);
						
			return student;
			
		} 
		public List<Student> getAll()
		{
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			Query query=entityManager.createQuery("Select a from Student a");
			
			return query.getResultList();		
			}
		
		public Student findStudentByEmail(String email)
		{
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			Query query=entityManager.createQuery("Select s from Student s where s.email=?1",Student.class);
			return (Student) query.setParameter(1, email).getSingleResult();		
			
			
		} 
}
