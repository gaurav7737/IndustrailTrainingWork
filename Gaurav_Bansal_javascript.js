// Add your code here
//"use strict"

//Employee as main function  
function employee(){
  this.name;
  this.employeeid;
  this.experience;
  this.fun=function(){
  console.log("Employee name is: " + this.name);
  console.log("Employee id is: " + this.employeeid);
  console.log("Employee experience is: " + this.experience);
  }
}

//using prototype adding one more function in main function Employee
employee.prototype.salary;
employee.prototype.details=function()
{
  this.fun();
  console.log("Salary:"+this.salary);
}

//object1 named as manager
var manager = new employee;
manager.name="Gaurav";
manager.employeeid="accolite1";
manager.experience="5yrs";
manager.salary="10";

//using __proto__ adding one property only to Manager object
manager.__proto__.age="30";


//object2 named as HR
var HR = new employee;
HR.name= "Priyanka";
HR.employeeid="accolite2";
HR.experience="2yrs";
HR.salary="10";

//using __proto__ adding one property only to HR object
HR.__proto__.hometown="delhi";


//object3 named as Technical
var technical = new employee;
technical.name= "Yash";
technical.employeeid="accolite3";
technical.experience="7yrs";
technical.salary="10";

//using __proto__ adding one property only to Technical object
technical.__proto__.birthplace="mumbai";


//function for adding the all salary together
function totalsalary(obj1,obj2,obj3)
{
  var a1=obj1.salary;
  var a2=obj2.salary;
  var a3=obj3.salary;
  var a4=Number(a1)+Number(a2)+Number(a3);
  return a4 ;
}


//using call and bind function
//printing all the details of employees

var outerfun=manager.details;
outerfun.call(manager);//printing details of the manager
console.log("Manager's age: "+manager.age);

var outerfun1 = HR.details;
var outerfun1 = outerfun1.bind(HR)//printing details of the HR
outerfun1();
console.log("HR howntown: "+ HR.hometown);

var outerfun2 = technical.details;
var outerfun2 = outerfun2.bind(technical)//printing details of technical
outerfun2();
console.log("Technical birthplace: "+ technical.birthplace);

//printing total salary of employees
console.log("Total salary: "+ totalsalary(manager,HR,technical));


