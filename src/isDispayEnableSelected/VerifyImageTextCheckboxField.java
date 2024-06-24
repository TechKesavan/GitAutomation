package isDispayEnableSelected;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class VerifyImageTextCheckboxField {
	WebDriver driver;
  @Test
  public void isDisplayed() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  driver.get("https:/www.redmine.org/");
	  
	  boolean pro=driver.findElement(By.xpath("//*[normalization-space(text())='projects']")).isDisplayed();
	  
	  if(pro==true)
	  {
		  System.out.println("Project menu is displyaed in the top menu bar");
		  driver.findElement(By.xpath("//*[normalization-space(text())='projects']")).click();
	  }
	  else
	  {
		  System.out.println("Project menu is not displyaed in the top menu bar");
	  }
  }
  
  @Test
  public void isEnabled() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  driver.get("https:/www.redmine.org/");
	  driver.findElement(By.xpath("//*[normalization-space(text())='register']")).click();
	  
	  boolean user=driver.findElement(By.xpath("//*[normalization-space(text())='username']")).isEnabled();
	  
	  if(user==true)
	  {
		  System.out.println("user text field  is enabled to enter");
		  driver.findElement(By.xpath("//*[normalization-space(text())='username']")).sendKeys("kesavan");
	  }
	  else
	  {
		  System.out.println("user text field  is not enabled to enter");
	  }
  }
  
  @Test
  public void isSelected() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  driver.get("https:/www.redmine.org/");
	  driver.findElement(By.xpath("//*[normalization-space(text())='register']")).click();
	  
	//  driver.findElement(By.xpath("//*[normalization-space(text())='stay logged in']")).click();

	  boolean check=driver.findElement(By.xpath("//*[normalization-space(text())='stay logged in']")).isSelected();
	  
	  if(check==true)
	  {
		  System.out.println("stay loged in check box is selected");
	  }
	  else
	  {
		  System.out.println("stay loged is  check box is not selected");
	  }
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
