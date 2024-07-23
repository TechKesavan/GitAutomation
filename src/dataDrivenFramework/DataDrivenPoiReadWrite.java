package dataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDrivenPoiReadWrite {
	 WebDriver driver;
	    HSSFWorkbook workbook;
	    HSSFSheet sheet;
	    HSSFCell cell;
	 
	    @BeforeTest
		 public void TestSetup()
		{
		    // Set the path of the chrome driver.
	    	  System.setProperty("webdriver.chrome.driver", "E:\\Raju\\chromedriver.exe");
	  		driver = new ChromeDriver();
	  		driver.manage().window().maximize();
		    // Enter url.
		    driver.get("http://prakampanam.com/user");
		    driver.manage().window().maximize();
		     
		   
		}
	  
	 @Test
	 public void ReadData() throws IOException
	 {
	     // Import excel sheet.
	     File src=new File("E:\\Selenium\\TestData\\PoiThree.xls");
	      
	     // Load the file.
	     FileInputStream finput = new FileInputStream(src);
	      
	     // Load he workbook.
	    workbook = new HSSFWorkbook(finput);
	      
	     // Load the sheet in which data is stored.
	     sheet= workbook.getSheetAt(0);
	      
	     for(int i=1; i<=sheet.getLastRowNum(); i++)
	     {
	         // Import data for Email.
	         cell = sheet.getRow(i).getCell(1);
	       //  cell.setCellType(Cell.CELL_TYPE_STRING);
	         driver.findElement(By.id("edit-name")).sendKeys(cell.getStringCellValue());
	          
	         // Import data for password.
	         cell = sheet.getRow(i).getCell(2);
	       //  cell.setCellType(Cell.CELL_TYPE_STRING);
	         driver.findElement(By.id("edit-pass")).sendKeys(cell.getStringCellValue());
	         
	         driver.findElement(By.id("edit-submit")).click();
	         
	         // Write data in the excel.
	         FileOutputStream foutput=new FileOutputStream(src);
	           
	          // Specify the message needs to be written.
	          String message = "Data Read Successfully.";
	           
	          // Create cell where data needs to be written.
	          sheet.getRow(i).createCell(3).setCellValue(message);
	            
	          // Specify the file in which data needs to be written.
	          FileOutputStream fileOutput = new FileOutputStream(src);
	           
	          // finally write content
	          workbook.write(fileOutput);
	           
	           // close the file
	          fileOutput.close();
	                 
	        }
	  } 
	 
}
