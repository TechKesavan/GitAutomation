package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;

public class DataDriven {
	WebDriver driver;

	@Test
	public void HydLogin() throws IOException, JXLException, Exception {
		Thread.sleep(3000);
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(3000);
		
		FileInputStream fi = new FileInputStream("F:\\Lib\\July\\TestData\\UserData.xls"); // Here your excelsheet path.
		Workbook w = Workbook.getWorkbook(fi);
		Sheet s = w.getSheet("Sheet1");

		driver.findElement(By.xpath("//input[@id='edit-name']")).sendKeys(s.getCell(0, 1).getContents());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='edit-pass']")).sendKeys(s.getCell(1, 1).getContents());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
	} 
	
	

	@BeforeTest
	public void beforeTest() {
	  	driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
