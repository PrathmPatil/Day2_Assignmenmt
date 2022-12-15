package com.assignment;

import java.util.Scanner;

public class Assi2_SpringSeason {
	
	public static int m;
	public static int d;
	    static boolean value;     

		public static void main(String[] args) {
			System.out.println("Enter Month and Date: ");
			try(Scanner sc= new Scanner(System.in))
			{
			 d=sc.nextInt();
			 m=sc.nextInt();
			 if(m>=3 && d>=20&&d<=31||m==4&&d>0&&d<=30||m==5&&d>0&&d<=31||m<=6&&d<=20)
			 {
				 value=true;
			 }
			 else
			 {
				 value=false;
			 }
			 System.out.println(value);
			}

		}

	}


