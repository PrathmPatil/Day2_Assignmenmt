package com.assignment;
import java.util.Scanner;

public class Assi2_PrintSingleDigit {
	static int a;
		public static void main(String[] args) {
			System.out.println("Enter a Single Digit Number: ");
			try(Scanner sc=new Scanner(System.in))
			{
				a=sc.nextInt();
			}
			if(a==1) 
			{
	          System.out.println("One");
			}
			else if(a==2) 
			{
	          System.out.println("Two");
			}
			else if(a==3) 
			{
	          System.out.println("Three");
			}
			else if(a==4) 
			{
		       System.out.println("Four");
			}
			else if(a==5) 
			{
			     System.out.println("Five");
			}
			else if(a==6) 
			{
				System.out.println("Six");
			}
			else if(a==7) 
			{
				System.out.println("Seven");
			}
			else if(a==8) 
			{
				System.out.println("Eight");
			}
			else if(a==9) 
			{
	          System.out.println("Nine");
			}
			else if(a==0) 
			{
	          System.out.println("Zero");
			}
			else
			{
				System.out.println("Enter Valid Number");
			}
		}

	}


