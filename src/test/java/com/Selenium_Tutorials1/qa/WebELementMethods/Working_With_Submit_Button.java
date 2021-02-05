package com.Selenium_Tutorials1.qa.WebELementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Submit Button	submit()	
WebDriver allows selection of more than one option in a multiple SELECT element.
You can use the submit() method on any element within the form. WebDriver will automatically trigger the submit function of the form where that element belongs to.
 * 
 * 
 * 
 * 
 */



public class Working_With_Submit_Button {


	public static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();

	driver.get("https://www.saucedemo.com/");

        
	// Use of SendKeys.....
	
	   WebElement username=driver.findElement(By.cssSelector("#user-name"));
	   WebElement password=driver.findElement(By.cssSelector("#password"));
	 
	   username.sendKeys("Amit");
	   password.sendKeys("sjkjklks");
	   
	   /*
	    * 
	    * 
	    * vvv      imp points.................
	    * 
	    * 
	    * Submit Buttons
Submit buttons are used to submit the entire form to the server. We can either use the click () method on the web element like a normal button as we have done above or use the submit () method on any web element in the form or on the submit button itself.

When submit() is used, WebDriver will look up the DOM to know which form the element belongs to, and then trigger its submit function.
	    */
	  Thread.sleep(3000);
	   password.submit();  
	   
	}
	
	
	
}
