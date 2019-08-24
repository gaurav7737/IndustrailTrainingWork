package au.assignment.java.advance;

import java.util.LinkedList;
import java.util.List;

public class Company {
	private String CompanyName;
	private Address address;
	List<Employee> E;
	
	Company(){
		CompanyName=null;
		E = new LinkedList<Employee>();
	}
	
	public String getCompanyName() {
		return CompanyName;
	}	
	
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Employee> getE() {
		return E;
	}
	public void setE(List<Employee> e) {
		E = e;
	}
	
	public String toString()
	 {
		 return "Company Name: "+CompanyName  ;
	 }

}



