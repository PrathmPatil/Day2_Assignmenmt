package com.assignment;

import java.util.Scanner;

public class Assi2_DisplayUnit {
	
	  static String a;
		public static void main(String[] args) {
			System.out.println("Enter the Value:- ");
			try(Scanner sc=new Scanner(System.in))
			{
				a=sc.nextLine();
			}
			
			if(a.length()==1)
			{
				System.out.println("Unit");
			}
			else if(a.length()==2)
			{
				System.out.println("Ten");
			}
			else if(a.length()==3)
			{
				System.out.println("Hundred");
			}
			else if(a.length()==4)
			{
				System.out.println("Thousend");
			}
			else if(a.length()==5)
			{
				System.out.println("Ten Thousend");
			}
			else if(a.length()==6)
			{
				System.out.println("Lakh");
			}

		}

	}


