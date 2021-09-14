package com.test.practice;

class TTT {
	
	void m1() {
		System.out.println("m1 m");
	}
	
	class BBB{
		//static int i =100;
		void m2() {
			System.out.println("m2s");
		}
	}
	
	public static void main(String[] args) {
		
		
		new TTT().new BBB().m2();
	}

}
