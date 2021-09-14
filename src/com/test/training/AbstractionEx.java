package com.test.training;

public class AbstractionEx extends TestLatest{
	
	public AbstractionEx() {
		
		super();
		System.out.println("1111");
	}
	public void m1() {
		System.out.println("m1 method");
	}
	
	public void m3() {
		System.out.println("m3 method");
	}
	
	public static void main(String [] args) {
		
		
		AbstractionEx obj = new AbstractionEx();
		obj.m1();
		
	}
	

}

abstract class Test{
	
	Test(){
		System.out.println("constructor");
	}
	abstract void m1();
	abstract void m3();
	void m2() {
		
		System.out.println("m2 method");
	}
	
	
}
