package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Depends_On_Method {
	WebDriver driver;
  @Test(dependsOnMethods="medhod2")
  public void medhod1() throws Exception {
	  driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
  }
  
  @Test
  public void medhod2() {
	  driver.get("https://www.selenium.dev/");
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
