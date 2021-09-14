package com.test.practice;

public class Test {
	
	 static void m1() {
		System.out.println("m1 is public");
	}
	 X x = new X() {
		 public void m1() {
			 System.out.println("jjj");
		 }
	 };
	
	public static void main(String [] args) {
		
		new Test().x.m1();
	}

}

class X{
	
	public void m1(){
		System.out.println("h");
	}
	
}

