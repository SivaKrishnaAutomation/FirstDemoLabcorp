package com.test.training;

public class FlowControl {

	public static void browserLaunch(String browser) {

		if(browser.equalsIgnoreCase("Chrome")) {

			System.out.println("launch chrome");
		}

		else if(browser.equalsIgnoreCase("IE")) {

			System.out.println("launch IE");

		}

		else {

			System.out.println("No browser launched");
		}
	}

	public static void m1(int a) {

		if(a==3)
			System.out.println("true");
		else
			System.out.println("false");
	}

	public static void switchEx(char a) {

		//a =97 A=65
		switch(a) {

		case 'A': 
			System.out.println("case 1");
			break;

		case 'B': 
			System.out.println("case 2");
			break;
		case 9/3: 
			System.out.println("case 3");
			break;
		case 9%3: 
			System.out.println("case 4");
			break;

		default: 
			System.out.println("default");

		}
	}

	public static void main(String[] args) {

		//FlowControl.browserLaunch("");
		FlowControl.switchEx('A');

	}

}
