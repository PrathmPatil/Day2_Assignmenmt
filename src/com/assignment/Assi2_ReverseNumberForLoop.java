package com.assignment;

import java.util.Scanner;

public class Assi2_ReverseNumberForLoop {
	
	static int number;
	static int reverse=0;
	static int remainder;

		public static void main(String[] args) {
			System.out.println("Enter the number: ");
			try(Scanner sc= new Scanner(System.in))
			{
				number=sc.nextInt();
			}
	          for(;number!=0;)
	          {
	        		remainder=number%10;
	        		reverse=reverse*10+remainder;
	        		number=number/10;
	          }
	          System.out.println("Reverse Vlaue is "+ reverse);
		}

	}

