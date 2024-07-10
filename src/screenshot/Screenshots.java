package screenshot;

import org.testng.annotations.Test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Screenshots {
	WebDriver driver;

	@Test
	public void TakeScreenShot() throws Exception {
		driver.get("https://www.google.com/");
		Thread.sleep(3000);

		WebElement img = driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div[1]/div/div[2]/a"));

		File f = img.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Lin\\screenshots\\gmail.png"));

	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
