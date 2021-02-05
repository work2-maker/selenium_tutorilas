package com.Selenium_Tutorials1.qa.WebELementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * 
 * What are HTML Attributes?
Attributes are additional bits of information developers include in HTML tags. Attributes help in defining the characteristics of HTML elements. Apart from basic HTML tags like <h1>,<h2>, paragraph tag <p>, there are certain tags which can also include attributes.

Attributes are normally defined using “name-value” pairs. The name is the property that a developer wants to set. Let’s consider a basic HTML tag with an attribute title. It can be defined as follows:

<h3 title=”HTML Attributes”> ATTRIBUTES </h3>
In the above example, the h3 tag has an attribute with the property name as title and property value as HTML Attributes.


Why is the getAttribute() method required?
During the test script automation, QAs might need to fetch the attribute values of specific web elements to verify certain test scripts. Let’s understand this by taking an example.

Consider an air ticket booking application. The color of booked and available seats are different. Red represents the booked seats, and available seats are represented by green. So, for verifying whether a seat is booked or available, QAs need to fetch the attribute (color) value through the test script. Once the status of the seat is verified, only then can QAs verify further test scenarios.


How to use the getAttribute() method in Selenium?
The getAttribute() method in Selenium works on specific web elements. QAs need to locate the web elements first and then call the getAttribute() method by specifying the attributes for which values are required. One can quickly refer to this guide on locators in Selenium to understand how web elements can be located.

The snippet below represents the HTML code for the search box of duckduckgo.

<input id="search_form_input_homepage" class="js-search-input search__input--adv" type="text" autocomplete="off" name="q" tabindex="1" value="" autocapitalize="off" autocorrect="off">
The above Web Element has multiple attributes like class, type, name, etc.

Developers or QAs can retrieve values for these attributes using the getAttribute() method in Selenium.

Refer to the complete code below for better understanding:

public class GetAttributeSample
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://duckduckgo.com/");

WebElement searchTextBox= driver.findElement(By.id("search_form_input_homepage"));

// retrieving html attribute value using getAttribute() method
String typeValue=searchTextBox.getAttribute("type");
System.out.println("Value of type attribute: "+typeValue);

String autocompleteValue=searchTextBox.getAttribute("autocomplete");
System.out.println("Value of autocomplete attribute: "+autocompleteValue);

// Retrieving value of attribute which does not exist
String nonExistingAttributeValue=searchTextBox.getAttribute("nonExistingAttribute");
System.out.println("Value of nonExistingAttribute attribute: "+nonExistingAttributeValue);

}
}
Output:
Value of type attribute: text
Value of autocomplete attribute: off
Value of nonExistingAttribute attribute: null

When the above code is executed, it automatically fetches the attributes – type and autocomplete. For the attribute which is not available, it returns the null value.

The getAttribute() method plays a vital role in automating decisive scenarios. Naturally, it becomes imperative for QAs to know how to use the getAttribute() method in Selenium.

It is best to test user scenarios on real devices and browsers before releasing any software. Here’s where teams can leverage BrowserStack’s real device cloud for performing automated Selenium tests on 2000+ browsers and real devices. By doing so, they can be assured that their code runs exactly as it is meant to in real user conditions.










 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class Get_Attribute_Method {

	public static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();

	driver.get("https://en.wikipedia.org/wiki/Wikipedia");

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------        
	// Use of SendKeys.....
	
	   String title1=driver.findElement(By.cssSelector("#mw-content-text > div.mw-parser-output > div:nth-child(2) > a:nth-child(1)")).getAttribute("title");

	   System.out.println("Title= "+title1);
	   
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	   
	   String class1=driver.findElement(By.cssSelector("#toc > ul > li.toclevel-1.tocsection-1 > a > span.toctext")).getAttribute("class");

	   System.out.println("Title= "+class1);
	   
	   
	}
}
