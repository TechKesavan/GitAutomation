package sikulipack;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;

public class WebAuto {
	WebDriver driver;
	Screen sc = new Screen();
	
  @Test
  public void automationgWeb() throws FindFailed, Exception {
	  driver.get("https://www.selenium.dev/");
	  Thread.sleep(3000);
	  sc.click("C:\\Users\\Home\\Pictures\\spic\\se.PNG");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
