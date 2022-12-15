package com.assignment;

import java.util.Scanner;

public class Assi2_CalculateDistance {
	static float x;
	static float y;
	static double c;
	  public static double distance(float x2, float y2)
	  {
		 c=Math.sqrt(Math.pow(x2, y2));
		  
		  return c;
	  }
		public static void main(String[] args) {

			try(Scanner sc=new Scanner(System.in))
			{
				x=sc.nextFloat();
				y=sc.nextFloat();
			}
	       distance(x,y);
	       System.out.println(c);
	       
		}
	  
	}


