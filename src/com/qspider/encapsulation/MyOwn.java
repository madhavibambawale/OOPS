package com.qspider.encapsulation;

public class MyOwn 
{
   public static void main(String[] args) 
 {      
	   BankLocker bl= new BankLocker("madhs",2356897455l,65);
	   System.out.println(bl.getname());
	   System.out.println(bl.getaccountno());
	   System.out.println(bl.getlockerno());
	  
	   bl.setname("Meena");
	   bl.setaccountno(23568422l);
	   bl.setlockerno(256);
	   System.out.println(bl.getname());
	   System.out.println(bl.getaccountno());
	   System.out.println(bl.getlockerno());
 }
}
