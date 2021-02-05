package com.Selenium_Tutorials1.qa.WebELementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/* Note : This method generally returns true for every element , but for not enabled it will
 * All elements apart from disabled input elements) and false if otherwise.
 */





public class is_Enabled_Method {

	public static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();

	driver.get("https://en.wikipedia.org/wiki/Wikipedia");

//-----------------------------------------------------------------------------

	   boolean b=driver.findElement(By.cssSelector("#mw-content-text > div.mw-parser-output > div:nth-child(2) > a:nth-child(1)")).isEnabled();

	   System.out.println("Element english wiki is Enabled ?:"+b);
	}
}
