package com.Selenium_Tutorials.qa.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators_In_Selenium {

	public static WebDriver driver;

	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		// 1. By id
		// driver.findElement(By.id("login-button")).click(); // clicking login button
		// using its ID

		// 2. By Name
		// driver.findElement(By.name("user-name")).sendKeys("Amit"); // Making
		// reference to Username field byusing name as Locator

		// 3. By Tagname: Mostly used for Hyperlinks
		// driver.findElement(By.tagName("input")).sendKeys("Amit");

		// 4. By link text
		// driver.get("https://www.swagbucks.com/");
		// driver.findElement(By.linkText("Prodege, LLC")).click();

		// By Partial Link Text

		// driver.get("https://www.swagbucks.com/");
		// driver.findElement(By.partialLinkText("Advertise With")).click();

		/*
		 * //By ClassName 
		 * driver.get("https://www.swagbucks.com/");
		 * driver.findElement(By.className("sbRegFormTermsLink")).click();
		 */

		// By xpath
		// Xpath syntax for relative xpath
		// Xpath= //tagname[@attribute='value']

		/*
		 * Note: XPath expression select nodes or list of nodes on the basis of
		 * attributes like ID , Name, Classname, etc. from the XML document as
		 * illustrated below.
		 * 
		 * Xpath=//input[@name='uid']
		 */

		/*
		 * 2) Contains(): Contains() is a method used in XPath expression. It is used
		 * when the value of any attribute changes dynamically, for example, login
		 * information.
		 * 
		 * The contain feature has an ability to find the element with partial text as
		 * shown in below XPath example.
		 * 
		 * In this example, we tried to identify the element by just using partial text
		 * value of the attribute. In the below XPath expression partial value 'sub' is
		 * used in place of submit button. It can be observed that the element is found
		 * successfully.
		 * 
		 * Complete value of 'Type' is 'submit' but using only partial value 'sub'.
		 * 
		 * Xpath=//*[contains(@type,'sub')]
		 */
		// driver.get("https://www.swagbucks.com/");
		// driver.findElement(By.xpath("//*[contains(@class,'sbRegFormTermsLink')]")).click();
		// // Use of Contains is vv beneficial.

		// ------------------------------------------------------------------------------------------
		/*
		 * Xpath : Starts with./... Xpath=//label[starts-with(@id,'message')]
		 */

	//	driver.get("https://www.swagbucks.com/");
		//driver.findElement(By.xpath("//*[starts-with(@class,'sbRegFormTermsLink')]")).click(); // Use of Contains is vv
																								// beneficial.

		// ----------------------------------------------------------------------------------------------

		/*
		 * Xpath : Xpath=//td[text()='UserID']
		 * 
		 * The XPath text() function is a built-in function of selenium webdriver which
		 * is used to locate elements based on text of a web element. It helps to find
		 * the exact text elements and it locates the elements within the set of text
		 * nodes. The elements to be located should be in string form.
		 * 
		 * In this expression, with text function, we find the element with exact text
		 * match as shown below. In our case, we find the element with text "UserID".
		 */
		//driver.get("https://www.swagbucks.com/");
		//driver.findElement(By.xpath("//a[text()='Terms']")).click();
//---------------------------------------css---------------------------------------------------------------------------------------
		/*
		 * What is a CSS Selector? Essentially, the CSS Selector combines an element
		 * selector and a selector value that can identify particular elements on a web
		 * page. Like XPath, CSS selector can be used to locate web elements without ID,
		 * class or Name.
		 * 
		 * Types of CSS Selectors (with examples) There are 5 types of CSS Selectors in
		 * Selenium tests-
		 * 
		 * A.  ID 
		 * B. Class 
		 * C. Attribute 
		 * D. Sub-String 
		 * E. Inner String
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
		
		
		//CSS with id: css=<HTML tag><#><Value of ID attribute>
		
		/*
		driver.get("https://www.swagbucks.com/");
		driver.findElement(By.cssSelector("div#socialConnectBlock")).click();
		*/
		
		
		// CSS with Class Attriute :Syntax   css=<HTML tag><.><Value of Class attribute>
		
		/*
		driver.get("https://www.swagbucks.com/");
		driver.findElement(By.cssSelector("label.sbVisuallyHidden")).click();
		*/
		
		
		//CSS with Attribute : css=<HTML tag><[attribute=Value of attribute]>
		
		/*
		driver.get("https://www.swagbucks.com/");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Amit");
		*/
		
		//----------------------------------------------------------------------------------------
		
		//#4 – Sub-string
		// In Selenium, CSS allows the matching of a partial string which, offers a way to create CSS selectors utilizing sub-strings. This can be done in three ways.
		
		//              # 4.1: Match a Prefix: use ^
		/*
		 *
		 *Syntax  : css=<HTML tag><[attribute^=prefix of the string]>
		 * 
		 */
		driver.get("https://www.swagbucks.com/");
		driver.findElement(By.cssSelector("input[type^='passw']")).sendKeys("Amit");
		

//--------------------------------------------------------------------------------------------------		
		
		
		
		//               #4.2 : Match a Suffix: 
		/*
		 * Match a suffix

The purpose of this is to correspond to the string by using a matching suffix.

Syntax

css=<HTML tag><[attribute$=suffix of the string]>
		 */
		
		driver.get("https://www.swagbucks.com/");
		driver.findElement(By.cssSelector("input[type$='sword']")).sendKeys("Amit");
		
		
		
		
//-----------------------------------------------------------------------------------------------------
		
		
		
		
		
		//               #4.3: Match a Substring
		/*
		 * Match a substring

The purpose of this is to correspond to the string by using a matching substring.

Syntax

css=<HTML tag><[attribute*=sub string]>
		 */
		
		driver.get("https://www.swagbucks.com/");
		driver.findElement(By.cssSelector("input[type*='swor']")).sendKeys("Amit");
		
//--------------------------------------------------------------------------------------------------
		//                #4.4: Match Inner Text--****************----> DOUBT....
		/*
		 * 
		 * #5 – Inner text
Using inner text helps identify and create CSS Selectors by utilizing a string pattern that the HTML Tag manifests on the web page. This mechanism is used most frequently to locate web elements on account of its simplified syntax.

In this example, focus on the “Forgot email?” hyperlink present beneath the login form at Gmail.com.

	 *
	 *               css=<HTML tag><:><contains><(text)>
	 *                    
	 *                                
	 *               
: – the colon is used to symbolize the contains method
contains – the value of the Class attribute that is being accessed
text – the text displayed anywhere on the web page, irrespective of its location
	 *
	 */
		
		/*
		driver.get("https://www.swagbucks.com/");
		driver.findElement(By.cssSelector("input:type")).sendKeys("Amit");
		*/
		

	}

}
