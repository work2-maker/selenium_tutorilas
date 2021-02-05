package com.Selenium_Tutorials1.qa.WebELementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class get_Location_Method {

	
	
	public static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();

	driver.get("https://en.wikipedia.org/wiki/Wikipedia");

//-----------------------------------------------------------------------------

	   Point location1=driver.findElement(By.cssSelector("#mw-content-text > div.mw-parser-output > div:nth-child(2) > a:nth-child(1)")).getLocation();

	   System.out.println("Point ="+location1);
	}
}
