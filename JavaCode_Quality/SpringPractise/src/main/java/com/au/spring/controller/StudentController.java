package com.au.spring.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.au.spring.model.Student;
import com.au.spring.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/getName")
	public String getName()
	{
		return studentService.getName();
	}
	
	@GetMapping("/getallName")
	public List<Student> getallName()
	{
		return studentService.getallName();
	}
	
	
	@PostMapping("/insert/studentDetails")
	public void insertstudentdetails(@RequestBody Student student) {
			 studentService.insert(student);
			
	}
}

