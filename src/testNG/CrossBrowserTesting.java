package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	WebDriver driver;
	 @Parameters({ "browser" })
	    @BeforeTest
	    public void openBrowser(String browser) {

	        try {

	            if (browser.equalsIgnoreCase("Firefox")) {
	                driver = new FirefoxDriver();
	                driver.manage().window().maximize();
	            } 

	            else if (browser.equalsIgnoreCase("Chrome")) {
	                driver = new ChromeDriver();
	                driver.manage().window().maximize();
	            } 
	            else if (browser.equalsIgnoreCase("MEdge")) {
	                driver = new InternetExplorerDriver();
	                driver.manage().window().maximize();
	            }

	            /*else if (browser.equalsIgnoreCase("opera")) {
	                System.setProperty("webdriver.opera.driver","D:\\lib\\operadriver.exe");  //--->IE for Windows path
	                driver=new OperaDriver();
	             }

	        else if (browser.equalsIgnoreCase("safari")) {
	            System.setProperty("webdriver.safari.driver", "D:\\lib\\SafariDriver.exe"); //To stop uninstall each time
	             driver = new SafariDriver();
	             driver.get("http://www.google.com");
	            }*/

	        } 
	        catch (WebDriverException e) {
	            System.out.println(e.getMessage());
	        }
	    }

	    @Test
	    public void Run() throws Exception {
	        driver.manage().window().maximize();
	        driver.get("http://www.seleniumlearn.com");
	    }

	    @AfterTest
	    public void closeBrowser() {
	        driver.quit();
	    }
}
