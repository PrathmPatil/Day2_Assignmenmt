package com.assignment;
import java.util.Scanner;

public class Assi2_NumberArePalendrome {
	static int number;
	static int reverse=0;
	static int remainder;
		public static void main(String[] args) {
			System.out.println("Enter the number: ");
			try(Scanner sc=new Scanner(System.in))
			{
				number=sc.nextInt();
			 }
			for(;number!=0;)
			{
			 remainder=number%10;
			 reverse=reverse*10+remainder;
			 number=number/10;
			}
			if(number!=reverse)
			{
				System.out.println("Ther number are not Palindrome");
			}
			else
			{
				System.out.println("Ther number not Palindrome");
			}
		}

	}


