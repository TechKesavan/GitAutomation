package screenshot;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.reflections8.vfs.Vfs.File;
import org.testng.annotations.BeforeTest;

public class Screenshots {
	WebDriver driver;
  @Test
  public void screenshot() throws Exception {
	  driver.get("https://www.google.com/");
	  Thread.sleep(2000);
	  WebElement logo=driver.findElement(By.xpath("glogo"));
	  File f=logo.getScreenshotAs(outputType.FILE);
	  FileUtils.copyFile(f,new File("F:\\Lib\\glogo.pn"));
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
