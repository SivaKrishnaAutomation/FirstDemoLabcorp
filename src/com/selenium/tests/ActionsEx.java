package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsEx {
	
	@Test(priority=0)
	public void m1() {
		System.setProperty("webdriver.chrome.driver",
				  "ChromeDriver//chromedriver.exe"); WebDriver driver = new ChromeDriver();
				 driver.manage().window().maximize(); driver.get("https://www.facebook.com/");
	}
	@Test(priority=1)
	public void m2() {
		System.setProperty("webdriver.chrome.driver",
				  "ChromeDriver//chromedriver.exe"); WebDriver driver = new ChromeDriver();
				 driver.manage().window().maximize(); driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void msk() {
		System.setProperty("webdriver.chrome.driver",
				  "ChromeDriver//chromedriver.exe"); WebDriver driver = new ChromeDriver();
				 driver.manage().window().maximize(); driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void mnks() {
		System.setProperty("webdriver.chrome.driver",
				  "ChromeDriver//chromedriver.exe"); WebDriver driver = new ChromeDriver();
				 driver.manage().window().maximize(); driver.get("https://www.facebook.com/");
	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * 
	 * System.setProperty("webdriver.chrome.driver",
	 * "ChromeDriver//chromedriver.exe"); WebDriver driver = new ChromeDriver();
	 * driver.manage().window().maximize(); driver.get("https://www.facebook.com/");
	 * 
	 * Actions act = new Actions(driver);
	 * 
	 * WebElement e = driver.findElement(By.id("email"));
	 * 
	 * Action a = act.moveToElement(e) .click() .keyDown(e,Keys.SHIFT)
	 * .sendKeys(e,"hello") .keyUp(e, Keys.SHIFT) .contextClick(e).build();
	 * 
	 * a.perform(); driver.close();
	 * 
	 * driver.get("https://www.facebook.com/");
	 * 
	 * }
	 */

}
