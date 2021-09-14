package com.test.training;

class TestOuter {
	
	void m1() {
		
		for(int i=0;i<3;i++) {
		
			class TestInner{
				
				void m2() {
					System.out.println("m2");
				}
				
			}
			
			TestInner t = new TestInner();
			t.m2();
			
		}
		
	}
	
	
	
	public static void main(String [] args) {
		
		TestOuter o = new TestOuter();
		o.m1();
	}

}
