package com.Selenium_Tutorials1.qa.Working_With_TagsorLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;




/*
 * aLL LINKS HAVE TWO COMMON THINGS :
 * 1. 'a' TAG
 * 2. HREF: The href attribute specifies the URL of the page the link goes to 
 * 
 * 
 */









public class print_all_links_of_a_Page {

	public static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();

	driver.get("https://omayo.blogspot.com/");

//-----------------------------------------------------------------------------

	   List<WebElement> alltags=driver.findElements(By.tagName("a"));
	   
	   System.out.print("\nAll tags on this page is :"+alltags.size());
	   
	   for(int i=0;i<alltags.size();i++)
	   {
		   System.out.print("\nTag"+i+"is :"+alltags.get(i).getAttribute("href"));
	   }

	
	
	   
	   
	   
	}
}
