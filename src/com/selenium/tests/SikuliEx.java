package com.selenium.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class SikuliEx {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "ChromeDriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		Screen s = new Screen();
		s.type(System.getProperty("user.dir")+"//Images//UserID.PNG","labcorp");
		
	}

}
