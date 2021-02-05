package how_To_Handle_Dropdowns_in_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto_Suggestion_DropDown {

	public static WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();

	driver.get("https://en.wikipedia.org/wiki/Wikipedia");

	   WebElement searchBox=driver.findElement(By.cssSelector("#searchInput"));
	   
	   searchBox.sendKeys("Ind");
	   
	   Thread.sleep(2000);
	   
	   //Way1  
	   //   driver.findElement(By.xpath("//div[@rel=\"1\"]")).click();
	   
	  
	   
	   
	   
	   //Way2
	   
	   searchBox.sendKeys(Keys.ARROW_DOWN);
	   Thread.sleep(2000);
	   searchBox.sendKeys(Keys.ARROW_DOWN);
	   Thread.sleep(2000);
	   searchBox.sendKeys(Keys.ENTER);

	}
}
