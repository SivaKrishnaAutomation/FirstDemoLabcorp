package com.excel.tests;

public class TestEx {
	
	static String s = "selenium"; // static variable  s area1
double d= 12.3444; // instance variable

//s area2
	public static void main(String [] args){
		
		System.out.println(TestEx.s);
		TestEx t = new TestEx();
		//System.out.println(a);
		t.m1();
		t.m1();
		
		
		
	}
	// instance area
	public void m1(){
		int a=100;// local 
		System.out.println(s+" Java");
		System.out.println(a);
		
	}
	

}
