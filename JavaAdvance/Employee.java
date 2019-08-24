package au.assignment.java.advance;




public class Employee {
	String name;
	 int empId;
	 int age;
	 Employee(String n, int id, int a){
		 this.name=n;
		 this.empId=id;
		 this.age=a;		 
	 }
	 public String toString()
	 {
		 return "EmpID-"+empId+"  "+name + "   Age: " + age ;
	 }
	 
}
