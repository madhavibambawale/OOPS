package com.qspider.encapsulation;

class BankLocker
{
	private String name;
	private long accountno;
	private int lockerno;
	public BankLocker(String name,long accountno,int lockerno)
	{this.name=name;
	 this.accountno=accountno;
	 this.lockerno=lockerno;
	 }
	 public String getname()
	 {
		 System.out.println("otp code");
		 return name;
	 }
	 public long getaccountno()
	 {
		 System.out.println("otp code");
		 return accountno;
	 }
	 public int getlockerno()
	 {
		 System.out.println("otp code");
		 return lockerno;
	 }
	 public void setname(String na)
	 {
		 System.out.println("otp code");
		  name=na;
	 }
	 public void setaccountno(long ac)
	 {
		 System.out.println("otp code");
		 accountno=ac;
	 }
	 public void setlockerno(int lc)
	 {
		 System.out.println("otp code");
		 lockerno=lc;
	 }
	
	
	
}
