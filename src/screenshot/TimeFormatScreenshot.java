package screenshot;

import org.testng.annotations.Test;

import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TimeFormatScreenshot {
	WebDriver driver;
	
	public void timeScreenshot() {
		SimpleDateFormat dateformat=new SimpleDateFormat("YYYY_MM_DD_HH_MM_SS");
		String time=dateformat.format(date);
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,File("C:\\Lin\\screenshots\\failedSS_"+time+".png"));
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
		  timeScreenshot();
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
