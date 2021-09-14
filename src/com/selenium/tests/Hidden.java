package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "ChromeDriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://courses.letskodeit.com/practice");
		
		driver.findElement(By.id("hide-textbox")).click();
		System.out.println(driver.findElement(By.name("show-hide")).isDisplayed());
		System.out.println(getText(driver,driver.findElement(By.name("show-hide"))));
		System.out.println(driver.findElement(By.name("show-hide")).getLocation().getX());
		System.out.println(driver.findElement(By.name("show-hide")).getLocation().getY());

	}
	public static String getText(WebDriver driver, WebElement element){
	    return (String) ((JavascriptExecutor) driver).executeScript(
	        "return jQuery(arguments[0]).text();", element);
	}

}
