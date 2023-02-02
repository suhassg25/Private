package com.ty.jt.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.ty.jt.Dao.EmployeeDao;
import com.ty.jt.Dto.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao dao;

	public Employee saveEmp(Employee emp) {
		return dao.saveEmployee(emp);
	}

	public Employee getById(int id) {
		return dao.findById(id);
	}

	public List<Employee> getAll() {
		return dao.getAll();
	}

	public Employee update(int id, Employee emp) {
		return dao.updateemp(id, emp);
	}

	public void deleteById(int id) {
		dao.delete(id);
	}
	public Employee loginEmp(String name)
	{
		return dao.getByName(name);
	}
}
