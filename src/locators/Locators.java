package locators;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Locators {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Disabled
	@Test
	void locatorsTest() throws Exception {
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("kesavan");
		Thread.sleep(1000);
		driver.findElement(By.name("pass")).sendKeys("Hello@123");
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("email")).clear();
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Disabled
	@Test
	void cssSelector() throws Exception {
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#email")).sendKeys("kesavan");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input._6luy _55r1 _1kbt")).sendKeys("Hello123");
		
	}

	@Disabled
	@Test
	void xpath() throws Exception {
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("kesavan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Hello123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[normalize-space(text())='Forgotten password?']")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	

	@Test
	void tagName() throws Exception {
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		List<WebElement> totallinks=driver.findElements(By.tagName("a"));
		System.out.println("total links="+totallinks.size()); 
		driver.quit();
	}
}
