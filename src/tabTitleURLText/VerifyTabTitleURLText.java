package tabTitleURLText;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class VerifyTabTitleURLText {
	WebDriver driver;
  @Test
  public void tabTitle() {
	  driver.get("https://www.google.com");
	  String expected = "google";
	  System.out.println("Expected tab title : "+expected);
	  
	  String actual = driver.getTitle();
	  System.out.println("Actual tab title : "+actual);
	  
	  Assert.assertEquals(actual, expected);
  }
  
  @Test
  public void verifyURL() {
	  driver.get("https://www.google.com");
	  String expectedURL = "https://www.google.com";
	  System.out.println("Expected tab title : "+expectedURL);
	  
	  String actualURL = driver.getCurrentUrl();
	  System.out.println("Actual tab title : "+actualURL);
	  
	  Assert.assertEquals(actualURL, expectedURL);
	  
  }
  
  @Test
  public void verifyText() {
	  driver.get("https://www.google.com");
	  
	  String expectedText = "gmail";
	  String actualText = driver.findElement(By.xpath("//*[normalize-space(text())='gmail']")).getText();
	  Assert.assertEquals(actualText, expectedText);
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
