package com.accolite.JUnitAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();

		// getting data from the data base
		List<Student> studentList = new ArrayList<Student>();

		Criteria cr = session.createCriteria(Student.class);
		cr.add(Restrictions.gt("studentId", 0));
		studentList = cr.list();

		System.out.println("\nStudent Data from Database: \n");

		for (Student s : studentList) {
			System.out.print("StudentID: " + s.getStudentId());
			System.out.print("   Marks: " + s.getMarks());
			System.out.print("   DOB: " + s.getDob());
			System.out.println("   StudentName: " + s.getStudentName());
			
		}
		System.out.println("\n");
		

		/* adding data in database of table name studentRank */
		StudentService st = new StudentService();
		List<StudentRank> rankList= st.getRankList(studentList);
		
		  for (StudentRank rank : rankList) 
		  { 
			  session.save(rank);
		  }
		  session.getTransaction().commit();
		
		  
		  /* printing the rank list of students*/
		  System.out.println("\n\nStudent Rank: \n");
		  for (StudentRank s : rankList) {
			    System.out.print("Rank: "+s.getStudentRank());
			    System.out.print("   Marks: " + s.getMarks());
				System.out.print("   DOB: " + s.getDob());
				System.out.print("   StudentID: " + s.getStudentId());
				System.out.println("   StudentName: " + s.getStudentName());
				
			}
		  
		  

		

	}
}
