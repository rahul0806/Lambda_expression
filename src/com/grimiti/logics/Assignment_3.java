package com.grimiti.logics;


interface Sample1
{
	void Squa(int[] arr);
}

class demo implements Sample1
{
	
	public void Squa(int[] ar)
	{ 
		int s1=0;
		int s2=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				s1=s1+ar[i]*ar[i];
			}
			else
			{
				s2=s2+ar[i]*ar[i];
			}
		}
		System.out.println("even no's squares "+s1);
		System.out.println("odd no's squares "+s2);
	}
}

public class Assignment_3 {
  public static void main(String[] args) {
	int[] arr= {4,1,5,2,8,6};
	   
	new demo().Squa(arr);
	
	Sample1 t1=(int[] ar)->{
		int s1=0;
		int s2=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				s1=s1+ar[i]*ar[i];
			}
			else
			{
				s2=s2+ar[i]*ar[i];
			}
		}
		System.out.println("even no's squares "+s1);
		System.out.println("odd no's squares "+s2);
	};
	
	t1.Squa(arr);
	  
	  
}  
}
