package org.accolite.java.EmployeeManagement.dto;

public class EmployeeDTO {
	private String employeeName,employeeID;
	private int employeeAge;
	
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	
	/*public String toString()
	 {
		 return "EmpID-"+employeeID+"  "+employeeName + "   Age: " + employeeAge ;
	 }*/
	

}
