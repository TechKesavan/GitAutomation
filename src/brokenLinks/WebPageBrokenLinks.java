package brokenLinks;

import org.testng.annotations.Test;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
public class WebPageBrokenLinks {
    WebDriver driver;
    @Test
    public void brokenLinks() throws InterruptedException 
    {
        driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(5000);
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("Total links are "+links.size());
        for(int i=0;i<links.size();i++)
        {
            WebElement ele= links.get(i);
            String url=ele.getAttribute("href");
            verifyLinkActive(url);
        }
    }
    public void verifyLinkActive(String linkUrl)
    {
try 
        {
			URL url = new URL(linkUrl);
            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
            httpURLConnect.setConnectTimeout(5000);
            httpURLConnect.connect();
            if(httpURLConnect.getResponseCode()>=400)
            {
                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
            if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
            {
System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }
        } catch (Exception e) {
        }
    }
    @BeforeTest
    public void beforeTest() {
     driver = new ChromeDriver();
     driver.manage().window().maximize();
        //System.setProperty("webdriver.chrome.driver","D:\\lib\\chromedriver.exe"); //--->chrome browser path
        //driver=new ChromeDriver();
    }

}


