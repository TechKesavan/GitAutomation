package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Skip_Ignore_Disable {
	WebDriver driver;
	 @Test(priority=2)
	  public void gmail() {
		  driver.get("https://www.gmail.com");	  
	  }
	  @Test(priority=0)
	  public void x() {
		  driver.get("https://www.x.com");	  
	  }
	  @Test(priority=1)
	  public void selenium() {
		  driver.get("https://www.selenium.com");	  
	  }
	  
	  @Test(priority=4)
	  public void facebook() {
		  driver.get("https://www.facebook.com");	  
	  }
	  
	  @Test(priority=3)
	  public void google() {
		  driver.get("https://www.google.com");	  
	  }
	  @Test(priority=5)
	  public void swiggy() {
		  driver.get("https://www.swiggy.com");	  
	  }
	  @Test(priority=6)
	  public void redmine() {
		  driver.get("https://www.redmine.com");	  
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.quit();
	  }

}