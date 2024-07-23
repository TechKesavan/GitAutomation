package scrool;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InsidePageScrolling {
	WebDriver driver;
	
	  @Test
	  public void f() throws Exception {
		  driver.get("https://ssc.gov.in/");
		  Thread.sleep(3000);
		  
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
		  jse.executeScript("scroll(0,500)");
		  
		  Thread.sleep(3000);
		  
		  jse.executeScript("document.querySelector('.innerCardHead').scrollBy(0,500)");
		  //In above querySelector acts as a cssSelector


	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
	  }
}
