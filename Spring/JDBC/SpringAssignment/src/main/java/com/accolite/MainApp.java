package com.accolite;


import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		
		JDBCTemplateDao jdbc=applicationContext.getBean(JDBCTemplateDao.class);
		Student student = new Student();
		student.setStudentId(3);
		student.setStudentName("raj");
		jdbc.saveStudent(student);

		List<Student> lt=jdbc.findall();
		for(Student w:lt) 
		{
			System.out.println("StudentId : "+w.getStudentId()+" StudentName :"+w.getStudentName());
		}
		
		A a=(A)applicationContext.getBean("A");  
	    
		
	
	
	}
}
