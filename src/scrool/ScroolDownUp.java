package scrool;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ScroolDownUp {
	WebDriver driver;
	
  @Test
  public void scroolDown() throws Exception {
	  driver.get("https://www.selenium.dev/");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
	  Thread.sleep(3000);
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
	  jse.executeScript("scroll(0,3200)");
	  Thread.sleep(3000);
	//  driver.findElement(By.xpath("//a[normalize-space()='releases']")).click();
  }
  
  @Test
  public void scroolUp() {
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
	  jse.executeScript("scroll(3200,0)");
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}