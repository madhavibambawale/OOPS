package com.coding.abstraction;

interface DirectSeller
{
	void displayproducts();
	void sell();
}
class RCM implements DirectSeller
{
	public void displayproducts()
	{
		System.out.println("Each product has RCM logo");
		System.out.println("Rcm products are skincare,dailyneeds,healthcare");
		System.out.println("Groceries,household products,agriculture products");
		
	}
	public void sell()
	{
		System.out.println("Take products from RCM company");
		System.out.println("keep it in shop to sell the RCM products to customer");
	}
}
class Forever implements DirectSeller
{
	public void displayproducts()
	{
		System.out.println("Each product has Forever logo");
		System.out.println("Aloevera juice");
		System.out.println("Aloevera skincare products");
	}
	public void sell()
	{
		System.out.println("take products from Forever company");
		System.out.println("keep it in shop to sell Forever products to customer");
	}
}
class LifeStyle implements DirectSeller
{
	public void displayproducts()
	{
		System.out.println("Each product has lifestyle logo");
		System.out.println("beauty products, cosmetics");
		System.out.println("skincare products,wellness products");
		System.out.println("clothes");
	}
	public void sell()
	{
		System.out.println("take products from Lifestyle company");
		System.out.println("keep it in shop to sell Lifestyle products to customer");
	}
}
class Shop 
{         //return type   //method
	public DirectSeller buy(String choose)
	{
		if(choose == "RCM products")
		{
			return new RCM();
		}
		else if (choose == "Lifestyle products")
		{
			return new LifeStyle();
		}
		else
		{
			return new Forever();
		}
	}
}
public class Program_123 
{
public static void main(String[] args) 
{
	Shop sh=new Shop();
	DirectSeller ds =sh.buy("Lifestyle products"); //upcasting happen ==>
	ds.displayproducts();                         // chosen product return by directseller
	ds.sell();
}
}
