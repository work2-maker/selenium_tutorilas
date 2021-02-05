package com.Selenium_Tutorials1.qa.Resize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

/* Resize able elements can be anything with an offset: like slider, dragger etc.
 * 
 * Here : We have to make use of :
 * 1. Actions class ----> Method----> DragandDropBy(offset)
 */




public class Working_With_ResizeAble_Elements {

	
	public static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();

	
	driver.get("https://jqueryui.com/resizable/");  // Step1: Open URL 
    
	driver.manage().window().maximize();
	Actions action=new Actions(driver);
	
	/* Elements declartion */
	WebElement frame=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	
	
	
	
	/* Action steps:*/
	
	driver.switchTo().frame(frame);
    
	/* Note: First Switch to frame and then declare the elements of that frame or inside that frame*/
	
	WebElement pointObj=driver.findElement(By.xpath("//div[@class=\"ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se\"]"));
	
	action.dragAndDropBy(pointObj,0,50);
	
	action.perform();

	}
	
	
	
}
