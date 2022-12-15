package com.assignment;

import java.util.Scanner;

public class Assi2_SumNnumberUsingWhile {

	static int number;
		public static void main(String[] args) {
			int remainder;
			int reverse=0;
	    System.out.println("Enter Number:- ");
	    try(Scanner sc=new Scanner(System.in))
	    {
	    	number=sc.nextInt();
	    }
	     while(number!=0)
	     {
	    	remainder=number % 10;
	    	reverse=reverse*10+remainder;
	    	number=number/10;
	     }
	    System.out.println("the reverse of given number is "+ reverse);
		}

	}


