package testNG;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class DropDown {
	WebDriver driver;
	
  @Test
  public void dropDown() throws Exception {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	  driver.get("https://www.facebook.com");
	  driver.findElement(By.xpath("//*[normalize-space(text())='Create new account']")).click();
	  Select sl=new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
	  sl.selectByVisibleText("29");
	  Select sl1=new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
	  sl1.selectByVisibleText("Jun");
	  Select sl2=new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
	  sl2.selectByVisibleText("2000");
  	}
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
