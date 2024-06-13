package iframes;

import org.testng.annotations.Test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class IFramesAutomate {
	WebDriver driver;
	
  @Test
  public void iFrame() throws Exception {
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	  Thread.sleep(2000);
	  
	  WebElement frame = driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
	  Thread.sleep(2000);
	  driver.switchTo().frame(frame);
	  driver.findElement(By.xpath("//button[@type='button']")).click();
	  Thread.sleep(2000);
	  
	  driver.switchTo().defaultContent();
	  Thread.sleep(2000);

	  driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]")).click();
	  Thread.sleep(2000);

	  ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tab.get(1));
	  Thread.sleep(2000);

	  driver.findElement(By.xpath("//*[@id=\"subtopnav\"]/a[6]")).click();
	  
  }
  
  
  
  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
