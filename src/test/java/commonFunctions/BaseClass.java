package commonFunctions;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;

public class BaseClass {
  protected static WebDriver driver;
  
  @BeforeSuite
  public void beforeSuite() {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\webdrivers\\chrome-85\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://182.74.238.221/clarion_promise_qa/home.php");
  }

  @AfterSuite
  public void afterSuite() {
	//  driver.quit();
  }
  
  public static void sendkeys(WebElement e, String v)
	{
		e.sendKeys(v);
	}
  public static void click(WebElement e)
  {
	e.click();  
  }
  
  public static String getValue(WebElement e) {
	  String text = e.getText();
	return text;
  }
  public static void dropDown(WebElement e,String val) {
	  Select s = new Select(e);
	  s.selectByVisibleText(val);
	  
  }
  
  //public static 
  
  
	 

}

