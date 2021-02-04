package com.Selenium_Tutorials.qa.WebDriverMethods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic_Webdriver_Methods {

	
	
	
	public static WebDriver driver;

	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

        //1. Get(): Load a new WebPage in current browser
		driver.get("https://www.google.com/");
		
		
		//2. Manage(): Get option Interface
		//driver.manage().
		
		
		
		//3. getCurrent Url: Gets a string representing Current page url browser is looking at.
		System.out.println(driver.getCurrentUrl());
		
		//4. GetTitle: Get the title of the last page LOaded
		System.out.println(driver.getTitle());
		
		//5. getPageSource: Returns the page source oif the last loaded page
	//	System.out.print(driver.getPageSource());
		
		//6. navigate():An abstraction allowing the driver to access the browser's history and to naviagte to a certain URL
		
		driver.navigate().to("https://www.google.com/");
		
		
		
		//7. Quit(): Closes the entire browser right away
		//driver.quit();
		
		//8. close(): closes the current window of the browser. Note : If current window is the only window open in that browser then the browser will close it right away
		
		
		 
		driver.get("https://www.swagbucks.com/");
		 
		String windowhandle_SwagBucks=driver.getWindowHandle();
		 
		//System.out.print(windowhandle_SwagBucks);
		 
		//Set<String> s1=driver.getWindowHandles();
/*
		Iterator<String> i = s1.iterator(); 
        while (i.hasNext()) 
            System.out.println("\n"+i.next()); 
		
		
		 Thread.sleep(3000);
*/		driver.findElement(By.cssSelector("#sbRegFormWrapper > p > a:nth-child(2)")).click(); 
		 //driver.findElement(By.linkText("Terms")).click();
		 //driver.close();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		
	    String mainWindow=i1.next();
	    
	    String ChildWindow=i1.next();
	    
	    System.out.println("Parent handle ="+mainWindow);
	    System.out.print("Child Handle ="+ChildWindow);
		 
	    driver.switchTo().window(ChildWindow);
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("#main-wrapper > main > div > section.col-12.section.legal__section > div > div:nth-child(1) > a:nth-child(14)")).click();
	    
	    
	}
}
