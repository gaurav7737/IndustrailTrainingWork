package com.accolite.JUnitAssignment;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class StudentServiceTest {
	public StudentService service;
	
	public StudentDao studentDaoMock;
	
	@Before
	public void setup() {
		service=new StudentService();
		studentDaoMock = Mockito.mock(StudentDao.class);
		service.setDao(studentDaoMock);
	}
	
	@Test
	public void testRankStudents() {
		List<Student> students=new  ArrayList<Student>();
		students.add(new Student());
		students.get(0).setStudentName("gaurav");;
		students.get(0).setMarks(68);
		students.get(0).setDob("21-2-1996");
		students.get(0).setStudentId(1);
		
		students.add(new Student());
		students.get(1).setStudentName("manas");;
		students.get(1).setMarks(68);
		students.get(1).setDob("1-12-1995");
		students.get(1).setStudentId(2);
		
		students.add(new Student());
		students.get(2).setStudentName("ashwini");;
		students.get(2).setMarks(89);
		students.get(2).setDob("19-11-1998");
		students.get(2).setStudentId(3);
		
		students.add(new Student());
		students.get(3).setStudentName("aviral");;
		students.get(3).setMarks(83);
		students.get(3).setDob("1-12-1997");
		students.get(3).setStudentId(4);
		
		
		
		Mockito.when(studentDaoMock.getStudents()).thenReturn(students);
		
		List<StudentRank> studentRank=service.getRankList(students);
		
		assertEquals(4,studentRank.size());
		assertEquals("gaurav",studentRank.get(3).getStudentName());
		assertEquals("ashwini",studentRank.get(0).getStudentName());
		assertEquals("aviral",studentRank.get(1).getStudentName());
		assertEquals("manas",studentRank.get(2).getStudentName());
		assertEquals("gaurav",studentRank.get(3).getStudentName());
		
		Mockito.verify(studentDaoMock,
		  Mockito.times(4)).notifyStudent(Mockito.any(Student.class));
	}
	
	@Test
	public void testRankwithSameMarks() {
		List<Student> students=new  ArrayList<Student>();
		students.add(new Student());
		students.get(0).setStudentName("gaurav");;
		students.get(0).setMarks(76);
		students.get(0).setDob("21-2-1999");
		students.get(0).setStudentId(1);
		
		students.add(new Student());
		students.get(1).setStudentName("manas");;
		students.get(1).setMarks(76);
		students.get(1).setDob("1-12-1995");
		students.get(1).setStudentId(2);
		
		students.add(new Student());
		students.get(2).setStudentName("ashwini");;
		students.get(2).setMarks(76);
		students.get(2).setDob("19-11-1998");
		students.get(2).setStudentId(3);
		
		students.add(new Student());
		students.get(3).setStudentName("aviral");;
		students.get(3).setMarks(76);
		students.get(3).setDob("1-12-1997");
		students.get(3).setStudentId(4);
		
		
		
		Mockito.when(studentDaoMock.getStudents()).thenReturn(students);
		
		List<StudentRank> studentRank=service.getRankList(students);
		
		assertEquals(4,studentRank.size());
		assertEquals(1,studentRank.get(0).getStudentRank());
		assertEquals("manas",studentRank.get(0).getStudentName());
		assertEquals("aviral",studentRank.get(1).getStudentName());
		assertEquals("ashwini",studentRank.get(2).getStudentName());
		assertEquals("gaurav",studentRank.get(3).getStudentName());
		
		Mockito.verify(studentDaoMock,
		  Mockito.times(4)).notifyStudent(Mockito.any(Student.class));
	}

}
