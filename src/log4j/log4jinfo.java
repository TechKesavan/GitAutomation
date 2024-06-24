package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class log4jinfo {
	WebDriver driver;
  @Test
  public void googlesearch() {
	  Logger log =Logger.getLogger("search");
	  PropertyConfigurator.configure("Log4j.properties");
	  
	  driver = new ChromeDriver();
	  log.info("Chrome browser launched");
	  driver.manage().window().maximize();
	  log.info("Chrome browser maximized");
	  driver.get("https://www.google.com");
	  log.info("navigated to google application");
	  driver.findElement(By.name("q")).sendKeys("Selenium");
	  log.info("In google search field passing Selenium text");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  log.info("Enter pressed through keyboard");
  }
  
 
}
