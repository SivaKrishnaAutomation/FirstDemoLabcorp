package com.selenium.tests;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportGen {

	public static void main(String[] args) throws Exception {
		
		ExtentReports report = new ExtentReports(System.getProperty("user.dir")+"//Reports//TestReport.html");
		ExtentTest test = report.startTest("SampleTest");
		String username = "testemail";
		System.setProperty("webdriver.chrome.driver", "ChromeDriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		test.log(LogStatus.INFO, "Fb is launched in chrome"+test.addScreenCapture(getScreenshot(driver,"homepage")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		test.log(LogStatus.PASS, "user entered username as "+username+test.addScreenCapture(getScreenshot(driver,"usernamebox")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234567");
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "user entered password");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		test.log(LogStatus.FAIL, "Clicked on Login button");
		
		report.flush();
		

	}
	
	public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {

        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String destination = System.getProperty("user.dir") + "/TestScreenshots/" + screenshotName + dateName + ".png";
        File finalDestination = new File(destination);
        FileUtils.copyFile(source, finalDestination);
        Thread.sleep(1000);
        return destination;
    }

}
