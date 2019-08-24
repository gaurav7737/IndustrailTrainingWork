package com.au.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.au.spring.model.Student;
import com.au.spring.rowmapper.RowMapperimpl;

@Repository
public class StudentDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public String getName() {

	return jdbcTemplate.queryForObject("select studentName from student where studentId=1",String.class );
	}

	public void postinsert(Student student) {
		jdbcTemplate.update("insert into student values (" + student.getStudentId() + ", '" + student.getStudentName() + "');");
	}
	
	public List<Student> getallName() {

		return  jdbcTemplate.query("Select * from student",new RowMapperimpl() );
	}

}
