package com.selenium.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDay1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "ChromeDriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com/au/");
		driver.findElement(By.xpath("//span[contains(text(),'Start my free trial')]")).click();
		Thread.sleep(2000);
		String currentWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(windows);
		Iterator<String> itr = windows.iterator();
		
		while(itr.hasNext()) {
			
			String win = itr.next();
			if(!win.equals(currentWindow)) {
				
				driver.switchTo().window(win);
			}
			
		}
		
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Siva");
		driver.close();
		driver.switchTo().window(currentWindow);
		String text = driver.findElement(By.xpath("//span[contains(text(), 'We bring companies and customers to')]")).getText();
		System.out.println(text);




	}

}
