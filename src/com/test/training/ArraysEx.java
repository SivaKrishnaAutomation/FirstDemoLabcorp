package com.test.training;

import java.util.Arrays;

public class ArraysEx {
	
	public static void m1(int [] ar) {
		
		Arrays.sort(ar);
		
	}
	
	public static int [] m2(int [] ar) {
		
		Arrays.sort(ar);
		return ar;
	}
	

	public static void main(String[] args) {
		
		int [] a = {1,4,2,3,6,9,8,7};
		int [] arr = ArraysEx.m2(a);
		for(int i :arr) {
			System.out.println(i);
		}
		
		
		
	}

}


