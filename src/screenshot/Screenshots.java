package screenshot;

import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
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
	public void TakeScreenShot() throws Exception {
		driver.get("https://www.google.com/");
		Thread.sleep(3000);

		WebElement gmail = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a"));

		File f = gmail.org.openqa.selenium.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Lin\\screenshots\\gmail.png"));

	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
