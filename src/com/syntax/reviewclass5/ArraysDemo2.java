package com.syntax.reviewclass5;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo2 {

	public static void main(String[] args) {


		String [] names=new String[5];
		//names[0]="Ahmed";
		//names[2]="Kaiser";
		//names[3]="Naveed";
		//names[4]="Zameer";
		
		Scanner zameer=new Scanner(System.in);
		//names[0]=zameer.next();
		//names[1]=zameer.next();
		//names[2]=zameer.next();
		//names[3]=zameer.next();
		//names[4]=zameer.next();
		
		System.out.println(Arrays.toString(names));
		
		for(int i=0; i<names.length; i++) {
			names[i]=input.next();
		}

	}

}
