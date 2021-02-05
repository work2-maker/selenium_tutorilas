package com.Selenium_Tutorials1.qa.AlertBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;



/* For handling alert use .alert() functions
 * 
 * 
 * 
 *Alert interface provides the below few methods which are widely used in Selenium Webdriver.

1) void dismiss() // To click on the 'Cancel' button of the alert.

driver.switchTo().alert().dismiss();
2) void accept() // To click on the 'OK' button of the alert.

driver.switchTo().alert().accept();
3) String getText() // To capture the alert message.

driver.switchTo().alert().getText();			
4) void sendKeys(String stringToSend) // To send some data to alert box.

driver.switchTo().alert().sendKeys("Text");
 * 
 */




public class Handling_Alerts {
	public static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();

	driver.get("http://demo.guru99.com/test/delete_customer.php ");
	
	
	//Step1: Enter customer name 
    
	WebElement custId=driver.findElement(By.xpath("//input[@name=\"cusid\"]"));
	
	custId.sendKeys("53920");
	
	WebElement submitBtn=driver.findElement(By.xpath("//input[@name=\"submit\"]"));
	
	submitBtn.click();
	
	// At this point alert box will appear 
	
	//driver.switchTo().alert().dismiss();                // WAY1 to handle alert box
	
	
	/*
    driver.switchTo().alert().accept();                    // Way2 to handle alert box
    Thread.sleep(3000);
    driver.switchTo().alert().accept();                    
	*/
	
	
	//3) String getText() // To capture the alert message.

    System.out.print("Alert message :"+driver.switchTo().alert().getText());
	
	
    
    //4. 
  //  4) void sendKeys(String stringToSend) // To send some data to alert box.

    //driver.switchTo().alert().sendKeys("Text");
    
	}
	
	
	
}
