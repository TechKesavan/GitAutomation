package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Groups {
	WebDriver driver;
  @Test(groups="work")
  public void gmail() {
	  driver.get("https://www.gmail.com");	  
  }
  @Test(groups="social")
  public void x() {
	  driver.get("https://www.x.com");	  
  }
  @Test(groups="tech")
  public void selenium() {
	  driver.get("https://www.selenium.com");	  
  }
  
  @Test(groups="social")
  public void facebook() {
	  driver.get("https://www.facebook.com");	  
  }
  
  @Test(groups="food")
  public void zomato() {
	  driver.get("https://www.zomato.com");	  
  }
  @Test(groups="food")
  public void swiggy() {
	  driver.get("https://www.swiggy.com");	  
  }
  @Test(groups="tech")
  public void redmine() {
	  driver.get("https://www.redmine.com");	  
  }
  
  @BeforeTest(groups="food")
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
