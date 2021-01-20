package com.core.java.basicprograms;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args)
	{
		System.out.println("MMS");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:-");
		long num = scan.nextLong();
		long temp,sum=0,res;
		temp=num;
		
		while(num>0)
		{
			res= num%10;
			sum= sum +(res*res*res);
			num=num/10;
		}
		
		if(sum==temp)
		{
			System.out.println(temp +" is a Armstrong number");
		}
		else
		{
			System.out.println(temp +" is not a Armstrong number");
		}
		
       System.out.println("MME");
	}
}
