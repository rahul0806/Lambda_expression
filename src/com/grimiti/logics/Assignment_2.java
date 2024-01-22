package com.grimiti.logics;

import java.util.Scanner;



interface Sample
{
	void calcu(int a,int b);
}


public class Assignment_2 {

   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   
	 Sample s1=(a,b)->{
		
		 String str=sc.next();
		 
		 if(str.equals("add"))
		 { 
			 System.out.println(a+b);
		 }
		 else
			 if(str.equals("sub"))
		      {
			       System.out.println(a-b);
		        }
	    else
			if(str.equals("mul"))
			{
			   System.out.println(a*b);
			}
		 else
			 if(str.equals("div"))
					{
					   System.out.println(a/b);
					}
		 else
			 if(str.equals("mod"))
			 {
				 System.out.println(a%b);
			 }
				 
		 
	 };
	 s1.calcu(10, 20);
}	
	
}

