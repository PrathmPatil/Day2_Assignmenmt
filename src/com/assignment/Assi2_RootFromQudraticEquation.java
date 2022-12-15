package com.assignment;

import java.util.Scanner;

public class Assi2_RootFromQudraticEquation {
	
	/*
	 To finding Quadratic Equation roots;
	 basically their are 3 type of root it depend on determinant(b*b-4*a*c)
	 1.
	   if determinant is > 0 (roots are real and different)
	 2.
	  if determinant is == 0 (roots are same)
	 3. 
	  if determinant is < 0 (roots are complex and different)
	 
	 */

	

		static double a,b,c;
		static double determinant;
		static double cal1;
		static double cal2;
		public static void main(String[] args) {
			//Assi2_RootFromQudraticEquation obj=new Assi2_RootFromQudraticEquation();
			try(Scanner sc= new Scanner(System.in))
			{
				a=sc.nextDouble();
				b=sc.nextDouble();
				c=sc.nextDouble();
				
				determinant=((b*b)-(4*a*c));
				if(determinant>0)
				{
					 cal1= -b+Math.sqrt(determinant)/(2*a);
					 cal2= -b-Math.sqrt(determinant)/(2*a);
			       System.out.format("root1 = %.2f and root2 = %.2f",cal1,cal2);
				}
				else if(determinant==0)
				{
					cal1= -b/(2*a);
					 cal2= -b/(2*a);
			       System.out.format("root1 = %.2f and root2 = %.2f",cal1,cal2);
				}
				else
				{
					cal1= -b/(2*a);
				 cal2= Math.sqrt(determinant)/(2*a);
			       System.out.format("root1 = %.2f + %.2f i",cal1,cal2);
			       System.out.format("\nroot2 = %.2f - %.2f i",cal1,cal2);
	            }
	}
		}
	}


