package waitcommands;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class WaitCommands {
	WebDriver driver;
  @Test
  public void implicitEplicit() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	  
	  driver.get("Https://www.google.com/");
	  driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
	  
	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[normalize-space(text())='Images']")));
	  
	  driver.findElement(By.xpath("//*[normalize-space(text())='Images']")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
