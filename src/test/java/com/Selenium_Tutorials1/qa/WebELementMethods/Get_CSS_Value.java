package com.Selenium_Tutorials1.qa.WebELementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 
 What is CSS:
Cascading Style Sheets (CSS) is a style sheet language used for describing the presentation of a document written in a markup language. It describes how HTML elements are to be displayed on screen, paper, or in other media. It describes look and feel of HTML elements(font size, width, height etc) i.e. how should it be displayed. It provides special and easy ways to specify various properties to HTML element. We can specify several style properties for a HTML element.

Example: <p style=”color:green;font-size:24px;“>Hey, There!!</p>
 
 
 
 Why we need getCssValue() method?
By using getAttribute() method we can retrieve value of attributes which are written as:

attributeName=”attributeValue”

So, getAttribute() can give you all css properties defined for html element at once but not individually. For example, if you want to retrieve only font size or color, you can not retrieve through getAttribute() method.
 
 
 
 
 
 
 
 
 
 */

public class Get_CSS_Value {
	
	public static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();

	driver.get("https://en.wikipedia.org/wiki/Wikipedia");

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------        
	// Use of SendKeys.....
	
	   String cssVal1=driver.findElement(By.linkText("English Wikipedia")).getCssValue("font-size");

	   System.out.println("Font-size css property value ="+cssVal1);
	   
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	}

}
