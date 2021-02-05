package com.Selenium_Tutorials1.qa.Slider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_With_Slider {
	public static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();

	
	driver.get("https://jqueryui.com/slider/");  // Step1: Open URL 
    
	driver.manage().window().maximize();
	Actions action=new Actions(driver);
	
	/* Elements declartion */
	WebElement frame=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	
	
	
	
	/* Action steps:*/
	
	driver.switchTo().frame(frame);
    
	/* Note: First Switch to frame and then declare the elements of that frame or inside that frame*/
	
	WebElement SliderObj=driver.findElement(By.cssSelector("#slider > span"));
	
	action.dragAndDropBy(SliderObj,100,0);
	
	action.perform();

	}
	
}
