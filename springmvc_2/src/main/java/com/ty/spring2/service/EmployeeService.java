package com.ty.spring2.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.spring2.dao.EmployeeDao;
import com.ty.spring2.dto.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao dao;
	
	public void save(Employee emp)
	{
		dao.saveEmp(emp);
		
	}
	
	public Employee login(Employee emp)
	{
		Employee employee=dao.findbyEmail(emp.getEmail());
	 if(employee.getPassword().equals(emp.getPassword()))
	 {
		 return employee;
	 }
	 else
	 {
		 return null;
	 }
	}

	public List<Employee> getAll(Employee emp) {
		 return dao.getAll();
	}
	
	public void Delete(int id)
	{
		dao.deletebyid(id);
	}
	public Employee findbyId(int id)
	{
		return dao.findbyId(id);
	}
	public Employee update(Employee employee)
	{
		return dao.updateEmployee(employee);
	}
}
