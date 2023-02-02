package com.ty.springmvc_prc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.ty.springmvc_prc.dao.StudentDao;
import com.ty.springmvc_prc.dto.Student;

@Service
public class StudentService {
	@Autowired
	StudentDao dao;

	public Student save(Student std)
	{
		dao.saveStudent(std);
		return std;
	}
	
	public Student log(Student std)
	{
		Student rec=dao.findStudentByEmail(std.getEmail());
		if(rec.getPassword().equals(std.getPassword()))
		{
			return rec;
		}
		else
			return null;
	}
	public List<Student> getAll(Student std)
	{
		return dao.getAll();
	}
	
	public void DeletebyId(int id)
	{
		dao.deleteStudent(id);
	}
	
	public Student findByid(int id)
	{
		return dao.findStudent(id);
	}
	public void update(Student student)
	{
		dao.updateStudent(student);
	}
}
