package com.grimiti.logics;



interface Demo1
{
	void Squa(String str);
}

class Trad implements Demo1
{

	@Override
	public void Squa(String str) {
		// TODO Auto-generated method stub
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{                                                                                                                                                                                                                                                                                                           
			rev=rev+str.charAt(i);
		}
		if(rev.equals(str))
			System.out.println("Traditional  "+"Palindrom");
	}
	
}


class Assignment_1
{
	public static void main(String[] args) {
		
		new Trad().Squa("mom");
		
		Demo1 d1=(str)->{
		    String rev="";
			for(int i=str.length()-1;i>=0;i--)
			{                                                                                                                                                                                                                                                                                                           
				rev=rev+str.charAt(i);
			}
			if(rev.equals(str))
				System.out.println("Lambda "+"Palindrom");
		};
		d1.Squa("mom");
	}
}
