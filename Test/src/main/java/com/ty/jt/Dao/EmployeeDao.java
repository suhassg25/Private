package com.ty.jt.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.jt.Dto.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	EntityManager entityManager;
	
	public Employee saveEmployee(Employee emp)
	{
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(emp);
		entityTransaction.commit();
		return emp;
	}
	
	public Employee updateemp(int id,Employee emp)
	{
		Employee e1=entityManager.find(Employee.class, id);
		EntityTransaction entityTransaction=entityManager.getTransaction();
		emp.setId(e1.getId());
		entityTransaction.begin();
		entityManager.merge(emp);
		entityTransaction.commit();
		return emp;
	}
	
	public void delete(int id)
	{
		Employee emp=entityManager.find(Employee.class, id);
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(emp);
		entityTransaction.commit();
	}
	
	public Employee findById(int id)
	{
		return entityManager.find(Employee.class, id);
	}
	
	public List<Employee> getAll()
	{
		return entityManager.createQuery("Select s from Employee s", Employee.class).getResultList();
	}
	
	public Employee getByName(String name)
	{
		return entityManager.createQuery("Select s from Employee s where s.email=?1", Employee.class).setParameter(1, name).getSingleResult();
	}
}
