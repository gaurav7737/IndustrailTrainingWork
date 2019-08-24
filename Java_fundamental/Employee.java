package com.accolite.au.practice;

//fundamentals of java

//inheritance, interface, overridding, overloading, static block, instance block, static method, static variables
public class Employee {
	
	//overloading functions
	static void totalSalary(int a,int b)
	{
		System.out.println("Total Salary: "+ (a+b)+"k");
	}
	static void totalSalary(int a,int b,int c)
	{
		System.out.println("Total Salary: "+ (a+b+c)+"k");
	}
	static void totalSalary(int a,int b,int c, int d)
	{
		System.out.println("Total Salary: "+ (a+b+c+d)+"k");
	}

	public static void main(String[] args) {
		Manager m=new Manager();
		m.name="Gaurav";
		m.salary=55;
		m.printName();
		m.printSalary();
		m.print_No_of_Employee();
		
		System.out.println("\nOne more employee added in a company:\n");
		Manager m1=new Manager();
		m1.name="Mayank";
		m1.salary=78;
		m1.printName();
		m1.printSalary();
		m1.print_No_of_Employee();
		
		System.out.println("\nOne more employee added in a company:\n");
		HR hr1=new HR();
		hr1.name="Maya";
		hr1.salary=67;
		hr1.printName();
		hr1.printSalary();
		hr1.print_No_of_Employee();
		
		System.out.println("\nOne more employee added in a company:\n");
		HR hr2=new HR();
		hr2.name="Soumya";
		hr2.salary=87;
		hr2.printName();
		hr2.printSalary();
		hr2.print_No_of_Employee();
		
		class_interface o=new class_interface();
		o.function();
		
		totalSalary(m.salary,m1.salary);
		totalSalary(m.salary,m1.salary,hr1.salary);
		totalSalary(m.salary,m1.salary,hr1.salary,hr2.salary);
		
	}
}

//parent and child class

class EmployeeClass{
	int salary;
	static int numberofEmployee;
	String name;
	void printName()
	{
		System.out.println("Name: "+this.name);
	}
	void printSalary()
	{
		System.out.println("Salary: "+this.salary+"k");
	}
	void print_No_of_Employee()
	{
		System.out.println("Total no. of employees in a company: "+ numberofEmployee);
	}
	
	
	
}


class Manager extends EmployeeClass{
	Manager()
	{
		numberofEmployee++;
	}
	
}

class HR extends EmployeeClass{
	{
		System.out.println("HR instance block called every time ");
	}
	static {
		System.out.println("HR static block call only once  ");
	}
	HR()
	{
		numberofEmployee++; 
	}
	
}


//interface example in java
interface interface1{
	
void function();
	
}

class class_interface implements interface1{
	@Override
	public void function() {
		System.out.println("first method of class implementing interface called");
	}
}
