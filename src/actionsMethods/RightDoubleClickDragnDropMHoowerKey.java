package actionsMethods;

import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class RightDoubleClickDragnDropMHoowerKey {
	WebDriver driver;
	
  @Test
  public void rightClick() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://seleniumlearn.com/right-click");  
	Actions act = new Actions(driver);
	act.contextClick(driver.findElement(By.xpath("right click button xpath"))).build().perform();
  }
  
  @Test
  public void doubleClick() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://seleniumlearn.com/double-click");  
	
//	JavascriptExecutor jse = (JavascriptExecutor)driver;
//	jse.executeScript("scroll(0,2000)");
	
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//button[normalize-space()='Techlearn.in']"))).doubleClick().build().perform();
	
	//driver.switchTo().alert().accept();
  }
  
  @Test
  public void dragAndDrop() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://seleniumlearn.com/drag-drop-html");  
	Actions act = new Actions(driver);
	WebElement source = driver.findElement(By.xpath("dragable"));
	WebElement target = driver.findElement(By.xpath("Dropable"));
	act.dragAndDrop(source, target).build().perform();
  }
  
  @Test
  public void mouseHower() throws Exception {
	driver.get("http://baalabharathi.com/");  
	Thread.sleep(3000);
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'AGES 1 – 6 Years')]"))).build().perform();
//	driver.findElement(By.xpath("//*[@id=\\\"menu-item-135\\\"]/a/span")).click();
	act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-item-135\"]/a/span"))).click().build().perform();
  }
  
  @Test
  public void keyBoard() throws Exception {
	driver.get("http://facebook.com/");  
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("king");
	Actions act = new Actions(driver);
	act.sendKeys(Keys.TAB).build().perform();
	act.sendKeys(Keys.ENTER).build().perform();
	
  }
	
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
