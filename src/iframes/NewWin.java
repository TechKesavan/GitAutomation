package iframes;

import org.testng.annotations.Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class NewWin {
	WebDriver driver;
  @Test
  public void newWindow() throws InterruptedException {
	  driver.get("https://www.google.com/");
	  driver.switchTo().newWindow(WindowType.WINDOW);
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("king");
	  Thread.sleep(2000);

	  Set<String> win=driver.getWindowHandles();
	  Object s[]=win.toArray();
	  driver.switchTo().window(s[0].toString());
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("King");
	  Thread.sleep(2000);

	  driver.switchTo().window(s[1].toString());
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("ruller");
  }
  @BeforeTest
  public void beforeTest() {
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  }

}
