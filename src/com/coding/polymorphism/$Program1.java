package com.coding.polymorphism;

class ChannelBroadcaster
{
	void ProvideChannel()
	{
	 System.out.println("Provide bunch of channel network through satellite");	
	}
}
class Videocon extends ChannelBroadcaster
{
	void ProvideChannel()
	{
	 System.out.println("Provide affordable channel package");	
    }
}
class Reliance extends ChannelBroadcaster
{
	void ProvideChannel()
	{
		System.out.println("Provide least channel package ");
	}
}
class TataSky extends ChannelBroadcaster
{
	void ProvideChannel()
	{
		 System.out.println("costly channel package with HD");	
	}
}
class SettopBox
{                           //input arg
	void displayprogram(ChannelBroadcaster ref)
	{
		ref.ProvideChannel(); 	
	}
}
public class $Program1 
{
   public static void main(String[] args) 
   {
	   SettopBox ref=new SettopBox();
	   ref.displayprogram(new Videocon());
	   ref.displayprogram(new Reliance());
	   ref.displayprogram(new TataSky());
	   
   }
}
