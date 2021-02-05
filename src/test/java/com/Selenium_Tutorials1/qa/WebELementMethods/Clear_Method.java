package com.Selenium_Tutorials1.qa.WebELementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//clear():        used to clear text boxes of its current value



public class Clear_Method {

	public static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();

	driver.get("https://en.wikipedia.org/wiki/Wikipedia");

        
	// Use of SendKeys.....
	
	   WebElement searchWikipedia=driver.findElement(By.cssSelector("#searchInput"));
	   
	   searchWikipedia.sendKeys("Amit");   // Sending string 'Amit' in searchWikipedia textbox
	   
	   Thread.sleep(3000);
	   
	   searchWikipedia.clear();            // Clearing String entered in searchWikipedia
	
	}
	
	
}
