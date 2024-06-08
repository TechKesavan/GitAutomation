package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Anotations_Execution_Order {
  @Test
  public void test() {
	  System.out.println(" Execution 5 Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println(" Execution 4 BeforMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println(" Execution 6 AfterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println(" Execution 3 BeforClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println(" Execution 7 AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println(" Execution 2 BeforSuite");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println(" Execution 8 AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println(" Execution 1 BeforSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println(" Execution 9 AfterSuite");  
  }

}
