package com.test.training;

public class ArrayOb {

	public static void main(String[] args) {
		
		System.out.println(new ArrayOb());
		int a [] = new int[10];
		Student s [] = new Student[3];// declaring an array 
		
		s[0]= new Student("Renee",100);
		s[1]= new Student("Labcorp",200);
		s[2]= new Student("Siva",300);
		
		for(int i=0;i<s.length;i++) {
			
			System.out.println(s[i]);
			
		}
		

	}

}

class Student{
	
	String name;// instance 
	int rollNum;// instance 
	
	Student(String name, int rollNum) {
		
		this.name= name;
		this.rollNum= rollNum;
	}
	
	
	
	
	
}
