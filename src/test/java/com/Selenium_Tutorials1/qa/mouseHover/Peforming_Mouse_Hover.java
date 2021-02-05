package com.Selenium_Tutorials1.qa.mouseHover;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

// In order to perform Mouse Hover we have to make use of : Actions Class


public class Peforming_Mouse_Hover {
	public static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();

	
	
	/* Task:
	 * 
	 * go to: https://demoqa.com/menu/-----> Main Menu2---->Sub Sub list---->Sub Sub Item1 
	 * 
	 */
	
	
    //Step1
	
	driver.get("https://demoqa.com/menu/");  // Step1: Open URL 
    
	driver.manage().window().maximize();
	Actions action=new Actions(driver);
	

	
	/* Elements Declaration */
	
	WebElement mainMenu=driver.findElement(By.linkText("Main Item 2"));
	
	//
	
	//
	
	
	
	

	
	/* Actions --->*/
	
	Thread.sleep(2000);
	action.moveToElement(mainMenu);                         // Step2 : Go to Main Menu 2             
	
	Thread.sleep(2000);
	WebElement subSubList1=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/a")); 
	action.moveToElement(subSubList1);                         //Step3: Go to Sub Sub list   
	

	Thread.sleep(2000);
	WebElement subSubItem1=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/ul/li[1]/a"));
	
	Thread.sleep(3000);;
	action.moveToElement(subSubItem1).click();                 

	action.perform();                                  // Most Imp .....
	

	}

}
