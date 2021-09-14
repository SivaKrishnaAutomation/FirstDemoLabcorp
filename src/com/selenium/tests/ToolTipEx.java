package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipEx {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "ChromeDriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement el = driver.findElement(By.xpath("//input[@id='age']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(el).build().perform();
		Thread.sleep(2000);
		String tooltipText = driver.findElement(By.xpath("//div[@role='tooltip']")).getText();
		
		String text = "We ask for your age only for statistical purposes.";
		
		if(tooltipText.equals(text)) {
			
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
	}

}
