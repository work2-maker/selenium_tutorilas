package com.Selenium_Tutorials1.qa.Checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_With_Checkbox {

	public static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();

	driver.get("https://www.sugarcrm.com/request-demo/");

	WebElement checkbox2=driver.findElement(By.id("interest_sell_c0"));
	
    WebElement radio1=driver.findElement(By.cssSelector("#interest_sell_c0"));
	
	Actions action=new Actions(driver);
	
	//action.moveToElement(checkbox2).click();

	Thread.sleep(3000);
	
	action.moveToElement(radio1).click().perform();
	

	
	
	

	
/*
	
	WebElement radio1=driver.findElement(By.cssSelector("#doi0"));

	
	
*/
	
	
	  // Clicking any specific element
	
	//Make use of : Actions class

	}
}
