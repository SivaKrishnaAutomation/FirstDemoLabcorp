package com.test.training;

public class OverLoading {
	
	public void m1() {
		
		System.out.println("m1 method-0 arg");
	}

	 int  m1(int a) {
		
		System.out.println("m1 method-1 arg");
		return a;
	}
	
	public static void main(String[] args) {
		
		OverLoading obj = new OverLoading();
		int a = obj.m1(100);
		System.out.println(a);

	}

}
