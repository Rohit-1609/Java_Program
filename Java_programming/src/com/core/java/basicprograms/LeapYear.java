package com.core.java.basicprograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args)
	{
		System.out.println("MMS");
		int year;
		System.out.println("Enter the Year:-");
		Scanner scan= new Scanner(System.in);
		year=scan.nextInt();
		boolean isLeap=false;
		
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					isLeap=true;
				}
				else
				{
					isLeap=false;
				}
				
			}
			else
			{
				isLeap=true;
				
			}
		}
		else
		{
			isLeap=false;
		}
	
	
	if(isLeap==true)
	{
		System.out.println(year +" is a Leap Year");
	}
	else
	{
		System.out.println(year+ " is not Leap Year");
	}
    System.out.println("MME");
}
}