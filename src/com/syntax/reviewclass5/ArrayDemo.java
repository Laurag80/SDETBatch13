package com.syntax.reviewclass5;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//should create an array
		String name="Laura";
		String name2="king";
		String name3="Mumtaz";
		
		//should not create an array
		
		String city="New York";
		String country="USA";
		String continent="America";
		//only used 5% of the times
		String []names= {"Oleg","King","Laura"};
		//95% of times this approach
		String [] names2=new String[3];
		names2[0]="Oleg";
		names2[1]="King";
		names2[2]="Mumtaz";
	}

}
