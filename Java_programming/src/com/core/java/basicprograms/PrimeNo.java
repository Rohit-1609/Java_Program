package com.core.java.basicprograms;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) 
	{	
	   System.out.println("MMS");
	   System.out.println("Enter the number:-");
	   Scanner scan = new Scanner(System.in);
	   int num= scan.nextInt();
	   boolean  isPrime = false;;
	
	   
		 for(int i=2;i<=num/2;i++)
		 {
			 if(num%i==0)
			 {
				 isPrime=true;
				 break;
			 }
	
		 
	   }
		   if(num==1)
		   {
			   System.out.println(num+ " is neither prime nor composite");
		   }  
	 else
	   {
		 if(isPrime==false)
		 {
			 System.out.println(num+ " is a Prime Number");
		 }
		 else
		 {
			 System.out.println(num+ " is a not Prime number");
		 }
	   }
	   System.out.println("MME");
		
	}
}
