package dataDrivenFramework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DataDrivenPoiFirst {

	WebDriver driver;

	HSSFWorkbook workbook;
	HSSFSheet sheet;
	HSSFCell cell;

	@BeforeTest
	public void TestSetup() throws InterruptedException
	{
		// Set the path of the chrome driver.
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Enter url.
		Thread.sleep(3000);
		driver.get("http://hyderabadreport.com//user");
		driver.manage().window().maximize();


	}

	@Test
	public void ReadData() throws IOException, InterruptedException
	{
		// Import excel sheet.
		File src=new File("C:\\Lin\\TestData\\LoginDetails.xls");

		// Load the file.
		FileInputStream finput = new FileInputStream(src);

		// Load he workbook.
		workbook = new HSSFWorkbook(finput);

		// Load the sheet in which data is stored.
		sheet= workbook.getSheetAt(0);

	//	for(int i=1; i<=sheet.getLastRowNum(); i++)
		{
			// Import data for Email.
			cell = sheet.getRow(1).getCell(0);
		//	cell.setCellType(Cell.CELL_TYPE_STRING);
			driver.findElement(By.id("edit-name")).sendKeys(cell.getStringCellValue());
			Thread.sleep(3000);
			// Import data for password.
			cell = sheet.getRow(1).getCell(1);
		//	cell.setCellType(Cell.CELL_TYPE_STRING);
			driver.findElement(By.id("edit-pass")).sendKeys(cell.getStringCellValue());
			Thread.sleep(3000);
			driver.findElement(By.id("edit-submit")).click();
			Thread.sleep(3000);
		}
	} 
 }
