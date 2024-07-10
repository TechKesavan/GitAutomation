package screenshot;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TimeFormatScreenshot {
WebDriver driver;
	
	public void timeScreenshot() throws IOException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
		Date date = new Date();
		String time = dateFormat.format(date);

		File f = ((org.openqa.selenium.TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Lin\\screenshots\\GoogleSearch_" + time + ".png"));
	}	

	@Test
	public void googlesearch() throws Exception {
		driver.get("https://redmine.org");
		Thread.sleep(2000);
		timeScreenshot();
		
		driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).click();
		Thread.sleep(1000);
		timeScreenshot();
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Ashok");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("fnjf887dd");
		Thread.sleep(1000);
		timeScreenshot();
		
		
		driver.findElement(By.xpath("//*[@id=\"login-submit\"]")).click();
		Thread.sleep(1000);
		timeScreenshot();
	}

	@Test(enabled=false)
	public void facebook() throws Exception {
		driver.get("http://seleniumlearn.com/selenium-commands");
		Thread.sleep(6000);
		timeScreenshot();
		String selectalltext = Keys.chord(Keys.CONTROL, "a"); // select all text in techlearn.in home page
		driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).sendKeys(selectalltext);		           
	//	timeScreenshot();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
}
