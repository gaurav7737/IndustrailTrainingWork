package com.accolite.JUnitAssignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class RankComparator implements Comparator<Student>{
		
	// sorting data according their marks and DOB (higher marks with earlier DOB
			// will have higher rank)
	
		SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
		Date date1;
		Date date2;
	    public int compare(Student s1, Student s2) {
	        if(s1.getMarks() < s2.getMarks()){
	            return 1;
	        } 
	        else if(s1.getMarks() > s2.getMarks())
	        {
	            return -1;
	        }
	        else
	        {
	        	try {
					date1 = format.parse(s1.getDob());
				} catch (ParseException e) {
					e.printStackTrace();
				}
	        	try {
					date2 = format.parse(s2.getDob());
				} catch (ParseException e) {
					e.printStackTrace();
				} 
	        	if(date1.compareTo(date2)<0) 
	   			  return -1; 
	   		  else return 1;
	        	
	        }
	}
}


