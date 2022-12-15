package com.assignment;

import java.util.Scanner;

public class Assi2VowelConsonant {

	static char value;
		public static void main(String[] args) {
	 System.out.print("Enter the charactor: ");
	 try(Scanner sc=new Scanner(System.in))
	    {
		 value=sc.next().charAt(0);
		}
	  if((value == 'a')||(value=='e')||(value=='i')||(value=='o')||(value=='u'))
	  {
		  System.out.println("Enterd charactor "+value+" are Vowel");
	  }
	  else if((value == 'A')||(value=='E')||(value=='I')||(value=='O')||(value=='U'))
	  {
		  System.out.println("Enterd charactor "+value+" are Vowel");
	  }
	  else
	  {
		  System.out.println("Enterd charactor "+value+" are Consonant");
	  }
	   	}

	}


