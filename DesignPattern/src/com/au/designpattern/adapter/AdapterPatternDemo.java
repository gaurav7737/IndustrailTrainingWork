package com.au.designpattern.adapter;

public class AdapterPatternDemo {
	 public static void main(String args[]){  
		  CustomerCard targetInterface=new ShopCustomer();  
		  targetInterface.giveShopDetails();  
		  System.out.print(targetInterface.getCustomerCard());  
		 }   
}
