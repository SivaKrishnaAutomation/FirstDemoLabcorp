package com.test.training;


public class ExceptionEx {
	
	public static void m1(int age) throws InvalidAgeException {
		
		if(age>30) {
			System.out.println("hello");
		}
		
		else {
			throw new InvalidAgeException("invalid age");
		}
		
	}
	
	public static void main(String[] args) throws InvalidAgeException   {

		m1(0);

	}

}

class InvalidAgeException extends Exception{
	
	InvalidAgeException(String str){
		
		super(str);
	}
}
