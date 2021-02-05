package com.Selenium_Tutorials1.qa.WebELementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * used to click on the link and wait for page load to complete before proceeding to the next command.
 */


public class Click_Method {
	
	
	public static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();

	driver.get("https://en.wikipedia.org/wiki/Wikipedia");

        
	// Use of SendKeys.....
	
	   WebElement EnglishWikiLink=driver.findElement(By.cssSelector("#mw-content-text > div.mw-parser-output > div:nth-child(2) > a:nth-child(1)"));
	   
	   EnglishWikiLink.click();   // Clicking English Wikipedia link
	   
	}

}
