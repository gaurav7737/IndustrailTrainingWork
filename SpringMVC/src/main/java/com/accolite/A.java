package com.accolite;


public class A {  
	
private static final A obj=new A();  

private A()
{System.out.println("private constructor calling in factory class");}  

public static A getA(){  
    System.out.println("Now factory method is called");  
    return obj;  
}

public void msg(){  
    System.out.println("hello user");  
}  
}  
