package com.grimiti.logics;



interface Concan
{
	void merge(String s1,String s2);
}

class imp implements Concan
{

	@Override
	public void merge(String s1, String s2) {
		// TODO Auto-generated method stub
		
			 System.out.println( s1.concat(s2));	
			}
			
	
	
}
public class Assignment_4 {
	
	public static void main(String[] args) {
		
		new imp().merge("Girmiti","Software");
		
		Concan c1=(String s1, String s2)->{
		 System.out.println( s1.concat(s2));	
		};
		c1.merge("Girmiti", "Software");
	}

}