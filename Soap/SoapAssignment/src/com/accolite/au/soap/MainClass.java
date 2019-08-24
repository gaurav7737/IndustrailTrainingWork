package com.accolite.au.soap;

import java.util.*;

public class MainClass {
	
	static ArrayList <Employee> emp=new ArrayList<Employee>(); 
     
	public String addEmployee(String name,int age,int id) {
    	 emp.add(new Employee(name,age,id));
    	 return "New Employee "+"id "+id+" is Added";
     }
     
     
     public  String showEmployeebyID(int id)
 	{
    	 String name="";
    	 int age=0;
    	 int empid;
 		for(Employee e1:emp)
 		{
 			if(e1.getId()==id)
 			{
 				 name=e1.getName();
 			     age=e1.getAge();
 			     empid=e1.getId();
 			     return "Name:"+name+" "+"Age:"+age+" EmpID: "+empid;
 			}
 		}
 		return "Data not found";
 	}
     
   
     public String updateEmployee(int id,String name,int age)
 	{
 		for(Employee e1:emp)
 		{
 			if(e1.getId()==id)
 			{
 				e1.setName(name);
 				e1.setAge(age);
 				return "Found and updated";
 			}
 		}
 		return "this Employee Id: "+id+" is not found";
 		
 	}
     
     
     public String deleteEmployee(int id)
     {
    	 for(Employee e1:emp)
  		{
  			if(e1.getId()==id)
  			{
  				 
  			     emp.remove(e1);
  			     return "Data Deleted";
  			}
  		}
    	 return "Data not found";
     }
     
     
     
     
}

