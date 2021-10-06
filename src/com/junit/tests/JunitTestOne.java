package com.junit.tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitTestOne {
	
	@BeforeClass
	
	public static void beforeClass() {
		
		System.out.println("before class");
	}
	
	@Before
	public void beforeTest() {
		
		System.out.println("Before");
	}
	
	@Ignore
	@Test
	public void testMethod1() {
		System.out.println("m1 method");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("m2 method");
	}
	
	@After
	
	public void afterTest() {
		System.out.println("after");
	}
	
	@AfterClass
	
	public static void afterClass() {
		
		System.out.println("After class");
	
	}
	
	

}
