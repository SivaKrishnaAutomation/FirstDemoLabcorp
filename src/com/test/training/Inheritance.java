package com.test.training;

public class Inheritance extends A{
	
	
	final double d = 12.345;
	
	Inheritance(){
		
		super("Labcorp");
		System.out.println();
	}

	public static void main(String[] args) {
		
		Inheritance obj = new Inheritance();
		System.out.println(obj.a);
		System.out.println(obj.str);
		System.out.println(obj.d);
		
		Inheritance.m1();

	}

}

class A{
	
	int a = 100;
	String str = "Labcorp";// instance 
	
	public A(String st){
		
		System.out.println(st);
	}
	
	public static void m1() {
		
		System.out.println("parent m1");
	}
}
