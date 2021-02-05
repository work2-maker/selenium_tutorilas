package how_To_Handle_Dropdowns_in_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDownHandling1 {

	public static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();

	driver.get("https://omayo.blogspot.com/");

//-----------------------------------------------------------------------------

	   WebElement dropdownBox=driver.findElement(By.cssSelector("#multiselect1"));

	   Select select=new Select(dropdownBox);
	   

	   
	   
	  /* Printing all the options of Company's dropdown */
	   List<WebElement> e = select.getOptions();
	   int itemCount = e.size();

	   for(int l = 0; l < itemCount; l++)
	   {
	       System.out.println(e.get(l).getText());
	   }
	   
	   

	   
	   select.selectByVisibleText("Volvo");;                               // selection using Index......
	
	   Thread.sleep(3000);
	   
	   
	   
	   
	   select.deselectByVisibleText("Volvo");
	 //  select.selectByVisibleText("11 - 50 employees");        // Selection using visble text
	   
	   
	   
	   
	   
	   
	   /* To check whether a dropdown allows Multiple selects or not use : ismultiple()
	    * 
	    * isMultiple() Example: How to Select Option from DropDown using Selenium Webdriver  	
Returns TRUE if the drop-down element allows multiple selections at a time; FALSE if otherwise.
No parameters needed
	    */
	
	   if(select.isMultiple())
	   {
		  System.out.println("Company size checkbox accepts multiple inputs");
		  
	   }
	   
	   else
		   System.out.println(" Company size checkbox do not support multiple inputs");
	   
	 
	   
	   
	   
	
	   
	   
	   
	}
	
}
