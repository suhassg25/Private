package com.ty.spring2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.spring2.dto.Employee;
@Repository
public class EmployeeDao {
	@Autowired
	EntityManager entityManager;

	public Employee saveEmp(Employee emp)
	{
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(emp);
		entityTransaction.commit();
		return emp;
	}
	
	public Employee updateEmployee(Employee emp) {
EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.merge(emp);
		entityTransaction.commit();
		return emp;
	}
	
	public Employee findbyId(int id)
	{
		return entityManager.find(Employee.class, id);
	}
	
	public Employee findbyEmail(String email)
	{
		Query query=entityManager.createQuery("Select s from Employee s where s.email=?1", Employee.class); 
		return (Employee) query.setParameter(1, email).getSingleResult();
	}
	
	public Employee deletebyid(int id)
	{
		Employee emp=entityManager.find(Employee.class, id);
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(emp);
		entityTransaction.commit();
		return emp;
	}
	public List<Employee> getAll()
	{
		return entityManager.createQuery("Select s from Employee s").getResultList();
	}
	
}
