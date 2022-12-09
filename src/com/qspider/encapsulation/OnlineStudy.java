package com.qspider.encapsulation;

 

public class OnlineStudy
{
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
		
		
		
