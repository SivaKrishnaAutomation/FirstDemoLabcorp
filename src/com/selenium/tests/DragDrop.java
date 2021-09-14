package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "ChromeDriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");
		/*
		 * WebElement e = driver.findElement(By.xpath("//a[text()='Demos']")); Point p =
		 * e.getLocation(); System.out.println(p.getX()+"-------"+p.getY());
		 */

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		Actions actions = new Actions(driver);

		//Retrieve WebElement
		WebElement element = driver.findElement(By.xpath("//input[@id='age']"));

		// Using the action class to mimic mouse hover
		actions.moveToElement(element).build().perform();
		WebElement toolTip = driver.findElement(By.xpath("//*[@id='age']"));

		// To get the tool tip text and assert
		String toolTipText = toolTip.getText();
		System.out.println("toolTipText-->"+toolTipText);

		//Verification if tooltip text is matching expected value
		if(toolTipText.equalsIgnoreCase("We ask for your age only for statistical purposes.")){
		System.out.println("Pass");
		}else{
		System.out.println("Fail");
		
		}
		
	}

}
