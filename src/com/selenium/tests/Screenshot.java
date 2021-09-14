package com.selenium.tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "ChromeDriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//a[text()='Insurance'])[1]")))).click();
		
		/*
		 * TakesScreenshot ts = (TakesScreenshot)driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); String destination =
		 * System.getProperty("user.dir") + "/TestScreenshots/" + "Test.png"; File
		 * finalDestination = new File(destination); FileUtils.copyFile(source,
		 * finalDestination);
		 */
		

	}

}
