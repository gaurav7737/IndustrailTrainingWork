package com.accolite.au.HibernateAssignment;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import pojo.assignment.Course;
import pojo.assignment.Student;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        SessionFactory factory = new Configuration().configure().buildSessionFactory(); 
        Session session = factory.openSession();
        session.beginTransaction();
        
        /* adding data one by one in database of table name student */
        Student st = new Student();
        
        st.setStudentId(10);
        st.setStudentName("ashwini");
        session.save(st);
        Integer id= (Integer) session.save(st);
        System.out.println(id);		
   
        session.getTransaction().commit();
        
        
        
        /* Printing the table student */
        
        List<Student> studentList= new ArrayList<Student>();
        
        Criteria cr = session.createCriteria(Student.class); 
		cr.add(Restrictions.gt("studentId",1));
		studentList= cr.list();
		
		for(Student s: studentList)
		{
		System.out.print("StudentID: "+ s.getStudentId());
        System.out.println(" StudentName: "+s.getStudentName());
		}
        
        
		/* adding data in database of table name course */
          Course c=new Course();
		  c.setCourseId(15); 
		  c.setCourseName("Hibernate");
		  c.setStudentId(10); 
		  Integer id1= (Integer) session.save(c);
		  System.out.println(id1); 
		  session.getTransaction().commit();
		  
		  
		  /* Printing the table course */
		  List<Course> courseList= new ArrayList<Course>();
	        Criteria cr1 = session.createCriteria(Course.class); 
			cr1.add(Restrictions.gt("courseId",1));
			courseList= cr1.list();
			
			for(Course c1: courseList)
			{
				System.out.print("CourseID: "+ c1.getCourseId());
		        System.out.print(" CourseName: "+c1.getCourseName());
		        System.out.println(" StudentID: "+ c1.getStudentId());
			}
	     
		
		/*joining both the tables course and student */
		
		System.out.println("Joining both tables:");
        for(Student student: studentList) {
    		  System.out.println( student.getStudentName()+" |studentID:"
    		  +student.getStudentId()+" |subject:"
    		  +(!student.getCourses().isEmpty()?student.getCourses().get(0).getCourseName()
    		  :"") +" |courseId:"+(!student.getCourses().isEmpty()?student.getCourses().get(0).getCourseId()
    		  		  :"") ); }
          
        
    }
}
