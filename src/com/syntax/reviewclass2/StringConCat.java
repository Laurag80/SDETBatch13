package com.syntax.reviewclass2;

public class StringConCat {

	public static void main(String[] args) {
		
		String firstName="Laura";
		String lastName="Gasp";
		String fullName=firstName+lastName;
		int num=10;
		int num2=10;
		System.out.println(fullName);
		System.out.println(firstName+num);
		System.out.println(firstName+num+num2);// 1st Operation
		System.out.println(firstName+(num+num2));// 1st operation=(num+num2)=>10+110
		System.out.println(num+firstName+num2);// 10+Laura=>10Laurag

	}

}
