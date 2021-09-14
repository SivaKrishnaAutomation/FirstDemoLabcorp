package com.test.training;

class StaticInner {
	
	static int a =200;
	static int b =300;

	static class AA{
		
		static String str = "";
		
		public static void main(String [] args) {
			
			System.out.println(a);
		}
	}
	
}
