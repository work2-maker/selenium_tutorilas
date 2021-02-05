package com.Selenium_Tutorials1.qa.PopUpWindowsOrMultiPleWindows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultiple_Windows1 {

	public static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();

	driver.get("http://demo.guru99.com/popup.php");

	
	// NOTE : Initially the control is at the Window 1
	// In order to Perform any action on elements lying on ANother window , then  we have to direct our control to that another window whose elements we want to access.
	
	// window1--> window2--->Window2's Elements 
	
	
	WebElement clickHereLink=driver.findElement(By.linkText("Click Here"));
	clickHereLink.click();
	
	 Set<String> s1=driver.getWindowHandles();		
     Iterator<String> i1=s1.iterator();	
     
     String MainWindowHandle=i1.next();     // Parent window handle
     
     String childWindow=i1.next();          // New Window Handle
     
     System.out.println("Main Window handle ="+MainWindowHandle);
     System.out.println("Child Window handle ="+childWindow);
	

     //In order to work on Child Window we have to first Switch our control to it 
     
     driver.switchTo().window(childWindow);                 // Control switched to ChildWindow
     
     WebElement emailBox=driver.findElement(By.xpath("//input[@name=\"emailid\"]"));
     emailBox.sendKeys("Amit");
     
     driver.close();                                         // It will close Child Window Only......
     
     driver.switchTo().window(MainWindowHandle); 
     
     Thread.sleep(3000);
     driver.findElement(By.cssSelector("#navbar-brand-centered > ul > li:nth-child(1) > a")).click();
     
     
     
	}
	
}
