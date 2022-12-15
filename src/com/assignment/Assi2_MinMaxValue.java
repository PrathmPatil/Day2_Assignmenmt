package com.assignment;
import java.util.Scanner;

public class Assi2_MinMaxValue {

	static int a;
	static int b;
	static int c;
	static int max=0;
	static int min=0;

	   
		public static void main(String[] args) {
	     System.out.println("Enter 3 numbers: ");
	     try(Scanner sc= new Scanner(System.in))
	     {
	    	 a=sc.nextInt();
	    	 b=sc.nextInt();
	    	 c=sc.nextInt();		 
	     }
	     @SuppressWarnings("unused")
	     Assi2_MinMaxValue obj= new Assi2_MinMaxValue();
	    
	     int ar[] =new int  [] { (((b * c)+ a)),((a / b)+ c), ((a % b)+c), ((a * b)+c) };
	     {
	    	 for(int i=0;i<ar.length;i++)
	    	 {
	    		 if(ar[i]!=0)
	    		 {
	    			 if(ar[i]>=max) 
	    			 {
	    				 max=ar[i];
	    			 }
	    		 }
	    	 }
	    	 System.out.println("maximun Value is: " +max);
	    	 
	    	 for(int j=0;j<ar.length;j++)
	    	 {
	            if(max>ar[j] && ar[j]!=max)
	            {
	            	for(int k=j+1;k<ar.length-1;k++)
	            	{
	            		if(ar[j]<ar[k])
	            		{
	            			min=ar[j];
	            		}
	            		else
	            		{
	            			min=ar[k];
	            		}
	            		            		
	            	}        			
	            }

	    	 }
	    	 System.out.println("minimun Value is: " +min);
	     }
	   
		}
		
	}


