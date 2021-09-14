package com.test.training;

public class NestedEx {

	public static void main(String[] args) {
		
		Outer o = new Outer();
		o.m1();
		//System.out.println(o.a+"----"+o.b);
		
		Outer.Inner i =  new Outer().new Inner();
		i.m2(10,20);

	}

}

class Outer{
	
	 private int a = 100;
	private  int b=200;
	void m1() {
		System.out.println("m1 in Outer class");
	}
	class Inner{
		 int i =200;
		int x =100;
		int y=200;
		
		void m2(int a, int b) {
			System.out.println("m2 in Inner class");
			System.out.println(x+y);
			System.out.println(Outer.this.a+Outer.this.b);
		}
		
		
	}
}
