package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Timeout {
	WebDriver driver;
	
  @Test(timeOut=4000)
  public void selenium() {
	  driver.get("https://www.selenium.dev/");
	  driver.findElement(By.xpath("//*[@id=\"navbarDropdown\"]")).click();
	  driver.findElement(By.xpath("//a[@class='dropdown-item'][normalize-space()='About Selenium']")).click();
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }
  
}
