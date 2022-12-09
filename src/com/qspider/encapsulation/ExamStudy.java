package com.qspider.encapsulation;


class ExamStudyApp 
{
	private String coursename;
	private int noofvideos;
	private long phoneno;
	public ExamStudyApp()
	{
		coursename="Bank PO exam";
		noofvideos=300;
		phoneno=789561312l;
	}
	public String getcoursename()
	{
		System.out.println("gen otp send to phoneno");
		return coursename;
	}
	public long getphoneno()
	{
		System.out.println("gen otp");
		 return phoneno;
	}
	
	public int getnoofvideos()
	{
		System.out.println("gen otp send to phoneno for accessing videos");
		return noofvideos;
	}
	
	public void setphoneno(long phno)
	{
		System.out.println("gen otp");
		 phoneno=phno;
	}
	
	public static void main(String[] args) 
	{
		ExamStudyApp es = new ExamStudyApp();
		System.out.println(es.getcoursename());
		System.out.println(es.getphoneno());
		System.out.println(es.getnoofvideos());
		es.setphoneno(9125864955l);
		System.out.println(es.getphoneno());
	}
}
	
