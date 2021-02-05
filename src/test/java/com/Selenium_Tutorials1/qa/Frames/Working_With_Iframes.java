package com.Selenium_Tutorials1.qa.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * 
We can identify the frames in Selenium using methods given below:

Right click on the element, If you find the option like 'This Frame' then it is an iframe.(Please refer the above diagram)
Right click on the page and click 'View Page Source' and Search with the 'iframe', if you can find any tag name with the 'iframe' then it is meaning to say the page consisting an iframe.
In above diagram, you can see that 'This Frame' option is available upon right clicking, so we are now sure that it is an iframe.

We can even identify total number of iframes by using below snippet.

Int size = driver.findElements(By.tagName("iframe")).size();
How to switch over the elements in iframes using Web Driver commands:
Basically, we can switch over the elements and handle frames in Selenium using 3 ways.

By Index
By Name or Id
By Web Element
Switch to the frame by index:

Index is one of the attributes for frame handling in Selenium through which we can switch to it.

Index of the iframe starts with '0'.

Suppose if there are 100 frames in page, we can switch to frame in Selenium by using index.

driver.switchTo().frame(0);
driver.switchTo().frame(1);
Switch to the frame by Name or ID:

Name and ID are attributes for handling frames in Selenium through which we can switch to the iframe.

driver.switchTo().frame("iframe1");
driver.switchTo().frame("id of the element");
Example of Switching to iframe through ID:

Let's take an example to switch frame in Selenium displayed in the below image. Our requirement is to click the iframe.

We can access this iframe through this below URL:http://demo.guru99.com/test/guru99home/s
 We can even identify total number of iframes by using below snippet.

Int size = driver.findElements(By.tagName("iframe")).size();
How to switch over the elements in iframes using Web Driver commands:
Basically, we can switch over the elements and handle frames in Selenium using 3 ways.

By Index
By Name or Id
By Web Element
                      REFER: https://www.guru99.com/handling-iframes-selenium.html


 *
 *
 *
 *
 *
 *
 *Switch to the frame by Web Element:

We can even switch to the iframe using web element .

driver.switchTo().frame(WebElement);
How to switch back to the Main Frame

We have to come out of the iframe.

To move back to the parent frame, you can either use switchTo().parentFrame() or if you want to get back to the main (or most parent) frame, you can use switchTo().defaultContent();

	    driver.switchTo().parentFrame();
	    driver.switchTo().defaultContent();
 *
 */


public class Working_With_Iframes {
	
	public static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();

	driver.get("http://demo.guru99.com/test/guru99home/");

	
	// NOTE : Initially the control is at the PAGE level
	// In order to Perform any action on elements lying inside any frame we have to direct our control inside the frame whose elements we want to access.
	
	// Page--->Frame---->Frames's elements 
	
	
	WebElement frame1=driver.findElement(By.id("a077aa5e"));
	
	driver.switchTo().frame(frame1);
	
	WebElement ad1=driver.findElement(By.xpath("//img[@src=\"Jmeter720.png\"]"));
	
	ad1.click();
	
	
	// to take control back to Parent frame of the current frame
	driver.switchTo().parentFrame();
	
	
	// to take control back to Page level directly , we can use : switchTo().defaultContent();
	/*
	 * 
To move back to the parent frame, you can either use switchTo().parentFrame() or if you want to get back to the main (or most parent) frame, you can use switchTo().defaultContent();
	 */
	
	driver.switchTo().defaultContent();
	

	}

}
