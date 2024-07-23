package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class DataProvider {

	WebDriver driver;
	public String str;

	@DataProvider(name = "datainput")
	//@DataProvider(name = "datainput",indices= {0,1})
	public String[][] login() {
		return new String[][] { 
			{ "Validuser", "InValidPassword" },
			{ "indraja", "9980251000" },
			{ "ValidUsername@gmail.com", "ValidPassfsfdaword" },
			{ "InvalidUser", "InvalidPassword" },
			{ "techlearn", "InvalidPassword" },
			{ "indraja", "9980251000" }
			};
	}

	@Test(dataProvider = "datainput")
	public void login(String username, String password) throws Exception {
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"edit-name\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"edit-name\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).click();
		try 
		{
			driver.findElement(By.linkText("Log out")).click();
			str = "Pass";
			System.out.println(str);
		} 
		catch (Exception a) 
		{
			str = "Fail";
			System.out.println(str);
			System.out.println("==========================="+a);
		}
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
	}
}
