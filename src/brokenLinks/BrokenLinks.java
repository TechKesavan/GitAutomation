package brokenLinks;

import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

//import javax.print.DocFlavor.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BrokenLinks {
	    WebDriver driver;
	    @Test
	    public void brokenLinks() throws InterruptedException 
	    {
	        driver.get("http://archives.peoplesdemocracy.in/");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        Thread.sleep(5000);
	        List<WebElement> links=driver.findElements(By.tagName("a"));
	        System.out.println("Total links are "+links.size());
	        List<String> urlList=new ArrayList<String>();
	        for(WebElement e : links)
	        {
	            String url=e.getAttribute("href");
	            //urlList.add(url);
	            verifyLinkActive(url);
	        }
	    }


	    public void verifyLinkActive(String linkUrl)
	    {
	try 
	        {
	            URL url = new URL(linkUrl);
	            HttpURLConnection httpURLConnect=(HttpURLConnection) url.openConnection();
	            httpURLConnect.setConnectTimeout(5000);
	            httpURLConnect.connect();
	            if(httpURLConnect.getResponseCode()>=200)
	            {
	                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() +"is Broken link");
	            }
	            else
	            {
	            	System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
	            }
	        } catch (Exception e) {
	        }
	    }
	    @BeforeTest
	    public void beforeTest() {
	     driver = new ChromeDriver();
	        //System.setProperty("webdriver.chrome.driver","D:\\lib\\chromedriver.exe"); //--->chrome browser path
	        //driver=new ChromeDriver();
	    }

	
}
