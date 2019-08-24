package au.assignment.java.advance;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

class AgeComp implements Comparator<Employee>{

	   @Override
	   public int compare(Employee e1, Employee e2) 
	   {
	       if(e1.age > e2.age){
	           return 1;
	       } else {
	           return -1;}
	   }
}

class IdComp implements Comparator<Employee>{

	   @Override
	   public int compare(Employee e1, Employee e2) 
	   {
	       if(e1.empId > e2.empId){
	           return 1;
	       } else {
	           return -1;}
	   }
}

class NameComp implements Comparator<Employee>{

	   @Override
	   public int compare(Employee e1, Employee e2) 
	   {
		   String s1=e1.name;
		   String s2=e2.name;
	       if(s1.compareTo(s2)>0){
	           return 1;
	       } else {
	           return -1;}
	   }
}


public class MainCompanyClass {
	
	public static void main(String[] args) {
		//for company1
		List<Company> comp =new LinkedList<Company>();
		
		Company c1 = new Company();
 		List<Employee> emp = new LinkedList<Employee>();
 		emp.add(new Employee("Gaurav",1,22));
 		emp.add(new Employee("Yash",2,23));
 		emp.add(new Employee("Aviral",3,24));			
 		emp.add(new Employee("Mayank",4,25));
 		emp.add(new Employee("Manas",5,26));
 		emp.add(new Employee("Soumya",6,30));
 		emp.add(new Employee("Rashmi",7,21));
 		emp.add(new Employee("Himani",8,40));
 		emp.add(new Employee("Sonali",9,32));
 		c1.setE(emp);
 		
 		c1.setCompanyName("Accolite");
 		Address a1= new Address("new street","bangalore","Karnataka");
 		c1.setAddress(a1);
 		
 		/*for(Employee ele : emp)
 		{
 			System.out.println(ele);
 		}*/
 		
 		System.out.println("Company name: "+ c1.getCompanyName()+"\n");
 		// sorting employees based on their age
 		Collections.sort(emp,new AgeComp());
 		
 		System.out.println("Sorting Empoyees based on their Age: "+ "\n");
 		
 		for(Employee ele : emp)
 		{
 			System.out.println(ele);
 		}
 		System.out.println("\n");
 		
 		//Sorting employees based on their name
 		Collections.sort(emp,new NameComp());
 		
 		System.out.println("Sorting Empoyees based on their Name: "+ "\n");
 		
 		for(Employee ele : emp)
 		{
 			System.out.println(ele);
 		}
 		
 		System.out.println("\n");
 		//Sorting employees based on their empID
 		Collections.sort(emp,new IdComp());
 		
 		System.out.println("Sorting Empoyees based on their empID: "+ "\n");
 		
 		for(Employee ele : emp)
 		{
 			System.out.println(ele);
 		}
 		
 		
 		System.out.println(" \n");
 		//Employees whose age is less than 30
 		System.out.println("Employees whose age is less than 30: "+ "\n");
 		for(Employee ele : emp)
 		{
 			if(ele.age<30) {
 			System.out.println(ele);}
 		}
 		
 		//adding more companies
 		Company c2 = new Company();
 		c2.setCompanyName("HPE");
 		Address a2= new Address("new road","pune","Karnataka");
 		c2.setAddress(a2);
 		
 		Company c3 = new Company();
 		c3.setCompanyName("Cisco");
 		Address a3= new Address("new colony","bangalore","Maharashtra");
 		c3.setAddress(a3);
 		
 		Company c4 = new Company();
 		c4.setCompanyName("Samsung");
 		Address a4= new Address("new street","pune","Maharashtra");
 		c4.setAddress(a4);
 		
 		//adding all the companies list in a linkedlist
 		comp.add(c1);
 		comp.add(c2);
 		comp.add(c3);
 		comp.add(c4);
 		
 		System.out.println("\n");
 		  		
 		//print all companies name
 		System.out.println("All companies details: \n");
 		for(Company e : comp)
 		{
 			System.out.println(e+"   city: "+ e.getAddress().city);
 			
 		}
 		
 		Set<String> set1 = new HashSet<>();
 		
 		for(Company c :comp)
 		{
 			set1.add(c.getAddress().city);
 		}
 		
 		
 		Iterator<String> it=set1.iterator();  
 		
 		System.out.println("\n"+"Companies sorted according to their city \n");
 		
 		//printing all companies which have same city
         while(it.hasNext())  
         {  
        	 String s=it.next();
        	 System.out.println(s);
        	 for(Company ele : comp)
      		{
      			if(s==ele.getAddress().city)
      			{
      				System.out.println(ele);
      			}
      		}
        	 System.out.println();
      	}
        	 
   }
}
 		
	



