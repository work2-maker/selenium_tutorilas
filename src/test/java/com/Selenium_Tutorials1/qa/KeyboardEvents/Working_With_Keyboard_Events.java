package com.Selenium_Tutorials1.qa.KeyboardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


/*
 *     Demonstrating Keyboard events as well as Text COPY paste Operation.
 * 
 * 
 * 
 */






public class Working_With_Keyboard_Events {

	public static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	//#dropZone > div.row-container.editor-container > div > div.CodeMirror-scroll > div.CodeMirror-sizer > div > div > div > div.CodeMirror-code > div:nth-child(9) > pre > span
	
	driver.get("https://extendsclass.com/text-compare.html");  // Step1: Open URL 
    
	WebElement sourceArea=driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[6]/pre"));
	
	Actions action=new Actions(driver);
	action.keyDown(sourceArea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();;
	
	Thread.sleep(3000);
	
	WebElement destArea=driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[7]/pre"));
	action.keyDown(destArea, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
	

	}
	
	
	
	
}
