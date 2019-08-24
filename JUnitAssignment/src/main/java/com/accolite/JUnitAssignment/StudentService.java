package com.accolite.JUnitAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentService {
	public StudentDao dao;

	public StudentDao getDao() {
		return dao;
	}

	public void setDao(StudentDao dao) {
		this.dao = dao;
	}

	public List<StudentRank> getRankList(List<Student> studentList) {
		
		Collections.sort(studentList, new RankComparator());
		List<StudentRank> studentRankList= new ArrayList<StudentRank>();
		
		int student_rank = 0;
		for (Student s : studentList) {
			student_rank++;
			StudentRank rank = new StudentRank();
			rank.setStudentRank(student_rank);
			rank.setStudentId(s.getStudentId());
			rank.setStudentName(s.getStudentName());
			rank.setDob(s.getDob());
			rank.setMarks(s.getMarks());
			studentRankList.add(rank);
			dao.notifyStudent(s);
		}
		
		return studentRankList;
	}

}
