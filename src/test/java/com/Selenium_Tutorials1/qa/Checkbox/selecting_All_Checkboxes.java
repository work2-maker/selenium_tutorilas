package com.Selenium_Tutorials1.qa.Checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selecting_All_Checkboxes {

	public static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();

	driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

	  
	   List<WebElement> els =driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
	   for ( WebElement el : els ) {
	       if ( !el.isSelected() )
	       {
	           el.click();
	       }
	   }
	   
	}
	
	
}
