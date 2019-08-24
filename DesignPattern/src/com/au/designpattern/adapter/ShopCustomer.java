package com.au.designpattern.adapter;

public class ShopCustomer extends ShopDetails implements CustomerCard {
	
	public void giveShopDetails(){    
	   long customerNumber= 10001;    
	   
	   String shopName= "Big Bazzar";
	   String customerName= "Gaurav Bansal";
	   
	   setCustomerName(customerName);  
	   setShopName(shopName);  
	   setCustomerNumber(customerNumber);  
	 }
	
	 
	   @Override  
	   public String getCustomerCard() {  
	    long custno=getCustomerNumber();  
	    String custname=getCustomerName();  
	    String sname=getShopName();  
	           
	    return ("The CustomerCard number "+custno+" of "+custname+" in "+sname+ " shop is valid and authenticated for issuing the shop card. ");
	   }  
}
