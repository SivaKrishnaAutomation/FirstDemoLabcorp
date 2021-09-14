package com.test.training;

public class TypeCastingEx extends Aa{
	
	public void m2() {
		
		System.out.println("m2");
	}

	public static void main(String[] args) {
		
		TypeCastingEx ch = new TypeCastingEx();
		
		Aa obj = new TypeCastingEx();
	
		
		// type casting
		
		int a = 200;
		byte b= (byte)a;
		
		TypeCastingEx childObj = (TypeCastingEx)obj;
		childObj.m2();
		
	}

}

class Aa{
	
	public void m1() {
		
		System.out.println("m1 method");
	}
	
}