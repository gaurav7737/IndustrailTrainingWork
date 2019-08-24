package org.accolite.java.EmployeeManagement.service;

import java.util.ArrayList;

import org.accolite.java.EmployeeManagement.dto.EmployeeDTO;

public class EmployeeService {
	
	static ArrayList<EmployeeDTO> emp1=new ArrayList<EmployeeDTO>();
		
	 public EmployeeService()
	{
		EmployeeDTO e=new EmployeeDTO();
		e.setEmployeeName("ankita");
		e.setEmployeeID("18");
		e.setEmployeeAge(34);
		emp1.add(e);
		EmployeeDTO e1=new EmployeeDTO();
		e1.setEmployeeName("suraj");
		e1.setEmployeeID("19");
		e1.setEmployeeAge(32);
		emp1.add(e1);
		EmployeeDTO e2=new EmployeeDTO();
		e2.setEmployeeName("asjka");
		e2.setEmployeeID("20");
		e2.setEmployeeAge(35);
		emp1.add(e2);
		
	}
	 
	public ArrayList<EmployeeDTO> getAllEmployee()
	{
		return emp1;
		
	}
	
	public EmployeeDTO getById(String id)
	{
		for(EmployeeDTO e: emp1)
		{
			if((e.getEmployeeID()).equals(id))
			{
				return e;
			}
		}
		return new EmployeeDTO();
	}
	
	public ArrayList<EmployeeDTO> updateEmployee(EmployeeDTO newEmp)
	{
		for(EmployeeDTO e: emp1)
		{
			//System.out.println(e.getEmployeeID());
			if((e.getEmployeeID()).equals(newEmp.getEmployeeID()))
			{
				e.setEmployeeAge(newEmp.getEmployeeAge());
				e.setEmployeeName(newEmp.getEmployeeName());
				break;
			}
		}
		return emp1;
	}
	/*public ArrayList<EmployeeDTO> insertEmployee(EmployeeDTO newEmp)
	{
		
		
	}*/
	
	

	
	
	



}
