package com.syntax.reviewclass2;

public class IfElseDemo4 {

	public static void main(String[] args) {


		double money=1000;
		boolean amIFree=true;
		
		if(money>100) {
			if(amIFree) {
				System.out.println("Go watch a movie");
				if (true) {
					System.out.println("Line1");
				}
			}
		}
	}

}
