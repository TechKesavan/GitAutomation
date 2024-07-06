package screenshot;

import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FullpageScreenshot {
	WebDriver driver;
	
  @Test
  public void selenium() throws Exception {
	  driver.get("https:\\www.seleniumlearn.com");
	  Thread.sleep(2000);
	  
	  Screenshot s=new Ashot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	  ImageIO.write(s.getImage()."PNG",new File("C:\\Lin\\screenshots\\fullScreen.PNG"))
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
