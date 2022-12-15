package com.assignment;

import java.util.Scanner;

public class Assi3_SumNnaturalNumber {
	
	 static int n;
		public static void main(String[] args) {
			int i=1;
			int sum=0;
			System.out.println("Enter Value:- ");
			try(Scanner sc=new Scanner(System.in))
			{
				n=sc.nextInt();
			}
			while(i<=n)
			{
				sum+=i;
				i++;
			}
			System.out.println("Sum of the first "+n+" numbers are "+ sum);
		}

	}


