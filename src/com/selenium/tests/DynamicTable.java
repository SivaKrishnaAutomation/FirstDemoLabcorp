package com.selenium.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicTable {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "ChromeDriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> list = driver.findElements(By.xpath("//table[@class='dataTable']/thead//th"));
		List<WebElement> compList = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		int index =0;
		for(int i=0;i<list.size();i++) {
			
			WebElement e = list.get(i);
			String data = e.getText();
			
			if(data.equals("Current Price (Rs)")) {
				
				index = i+1;
				System.out.println("Comapny column================" +index);
				break;
			}
			
		}
			List<WebElement> li = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td["+index+"]"));
			for(int j=0;j<li.size();j++) {
				
				System.out.println(li.get(j).getText());
				
			}
			
		}

}
