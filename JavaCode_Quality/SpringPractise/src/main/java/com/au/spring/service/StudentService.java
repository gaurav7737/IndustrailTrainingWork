package com.au.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.au.spring.dao.StudentDao;
import com.au.spring.model.Student;



@Service
public class StudentService {
	
	@Autowired
	StudentDao studentDAO;
	
	public String getName() {
		return studentDAO.getName();
	}
	
	public void insert(Student student)
	{
		 studentDAO.postinsert(student);
	}

	public List<Student> getallName() {
		return studentDAO.getallName();
	}
}
