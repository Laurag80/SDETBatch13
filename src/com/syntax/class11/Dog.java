package com.syntax.class11;

import java.util.Scanner;

public class Dog {
	
	String name;
	int age;
	double weight;
	String color;
	double height;
	String breed;
	
	void bark() {
		System.out.println("Dog barks");
		}
	void walks() {
		System.out.println("Dog walks");
	}
	void eat() {
		System.out.println("Dog like to  eat bone");
	}

	public static void main(String[] args) {
		
		//new Dog() how we create an object
		
		//Scanner scanner=new Scanner(System.in);
		//scanner.next();
		Dog jimmy=new Dog();// creating an object and
		jimmy.name="Jimmy";
		jimmy.age=6;
		jimmy.weight=16;
		jimmy.color="black";
		jimmy.height=2.6;
		jimmy.breed="German";
		jimmy.bark();
		
		
		
	}

}
