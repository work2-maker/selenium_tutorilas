package com.Selenium_Tutorials1.qa.DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;






/* To perform drag and Drop we have to use 
 * Actions Class ---> Method ---> DragandDrop();
 */





public class DragAndDrop {

	public static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();

	
	driver.get("https://jqueryui.com/droppable/");  // Step1: Open URL 
    
	driver.manage().window().maximize();
	Actions action=new Actions(driver);
	
	/* Elements declartion */
	WebElement frame=driver.findElement(By.xpath("//iframe[@src=\"/resources/demos/droppable/default.html\"]"));
	
	
	
	
	/* Action steps:*/
	
	driver.switchTo().frame(frame);
    
	/* Note: First Switch to frame and then declare the elements of that frame or inside that frame*/
	
	WebElement sourceItem=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
	
	WebElement destItem=driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
	
	
	
	action.dragAndDrop(sourceItem, destItem);
	
	action.perform();

	}
	
	
}
