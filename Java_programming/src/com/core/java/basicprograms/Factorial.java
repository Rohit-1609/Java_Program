package com.core.java.basicprograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
       System.out.println("MMS");
       System.out.println("Enter the number:- ");
       Scanner scan = new Scanner(System.in);
       int num= scan.nextInt();
       int c,f=1;
       
       if(num<0)
       {
    	   System.out.println("Number should be not negative");
       }
       else
       {
    	   for(c=1;c<=num;c++)
    	   {
    		   f=f*c;
    	   }
       }
       System.out.println("Factorial of number "+num+" is = "+f);
	
	System.out.println("MME");
	
	}
}
