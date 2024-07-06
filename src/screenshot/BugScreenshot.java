package screenshot;

import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BugScreenshot {
	WebDriver driver;
	
	public void bugScreenshot() {
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,File("C:\\Lin\\screenshots\\failedscreenshot.png"));
	}
	
  @Test
  public void redmine() {
	 
	  driver.get("https:\\www.redmine.org");
	  try {
	  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a"));
	  driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Kalyan");
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("92878yh34d");
	  driver.findElement(By.xpath("//*[@id=\"login-submit\"]")).click();
	  }
	  catch(Exception e) {
		  bugScreenshot();
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
