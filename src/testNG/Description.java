package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Description {
	WebDriver driver;
  @Test(description="selenium web open")
  public void selenium() {
	  driver.get("https://www.selenium.dev/");	  
  }
  @Test(description="gmail web open")
  public void gmail() {
	  driver.get("https://www.gmail.com");	  
  }
  @Test(description="google web open")
  public void google() {
	  driver.get("https://www.google.com");	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
