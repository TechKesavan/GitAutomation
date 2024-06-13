package alertOkCancelSendtext;

import org.testng.annotations.Test;

import java.time.Duration;

import org.junit.jupiter.api.Disabled;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AlertOkCancelText {
	WebDriver driver;

	@Disabled
	@Test
	public void alerOk() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://seleniumlearn.com/confirmation-dialog-box/");
		driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
		Alert alr = driver.switchTo().alert();
		alr.accept();
	}

	@Disabled
	@Test
	public void alertCancel() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://seleniumlearn.com/confirmation-dialog-box/");
		driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
		Alert alr = driver.switchTo().alert();
		alr.dismiss();
	}
	
	/* @Test
	  public void alerEnterTextOk() {
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.get("https://seleniumlearn.com/prompt-dialog-box/");
		  
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("\"//*[@id=\\\"node-103\\\"]/div/div[1]/div/div/button"))).click();
		  
		  
		  Alert alr=driver.switchTo().alert();
		  alr.sendKeys("King");
		  alr.accept();
	  }
	 */
	
	 @Test
	  public void alerEnterTextOk() throws Exception {		  
		  driver.get("https://seleniumlearn.com/prompt-dialog-box/");
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"node-103\"]/div/div[1]/div/div/button")).click();
		  Alert alr=driver.switchTo().alert();
		  Thread.sleep(2000);
		  alr.sendKeys("King");
		  Thread.sleep(2000);
		  alr.accept();
	  }

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
