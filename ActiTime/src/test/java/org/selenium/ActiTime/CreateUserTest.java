package org.selenium.ActiTime;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.selenium.businesslib.CommonLib;
import org.selenium.genericlib.Driver;
import org.selenium.genericlib.ExcelLib;
import org.selenium.genericlib.WebDriverCommonLib;
import org.selenium.objectrepositories.CommonPage;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateUserTest {
	
	  CommonLib commonlib = new CommonLib();
	  ExcelLib excellib = new ExcelLib();
	  WebDriverCommonLib webdriverCommonLib = new WebDriverCommonLib();
	  CommonPage commonpage = PageFactory.initElements(Driver.driver, CommonPage.class);
	  static final Logger logger = Logger.getLogger(CreateUserTest.class);
	  
	  @BeforeMethod
	  public void testSetUp() throws InterruptedException{
		  BasicConfigurator.configure();
		  Reporter.log("Test Execution Started",true);
		  logger.debug("Test Execution Started");
		  //Step 1
		  Driver.driver.get("http://localhost/login.do");
		  Driver.driver.manage().window().maximize();
		  Reporter.log("Browser Launched",true);
		  
		  //Step -2
		  commonlib.login("admin", "manager");
		  webdriverCommonLib.waitForElement("//img[@src='/img/custom/logo.0.1639263166325251.jpg?hash=970234804']");
		  Reporter.log("Logged in successfully",true);
		  		  
		  String strExpected = "Robert Barber"; 
		  Thread.sleep(3000);
		  String strActual = commonpage.getGetUserNameText().getText().trim();
		  boolean flag = strExpected.contains(strActual);
		  Reporter.log("Actual = "+strActual + "   " +" Expected = "+strExpected,true);
		  Assert.assertTrue(flag,"Actual = "+strActual + "   " +" Expected = "+strExpected);
		  Thread.sleep(3000);
	  }
	  
	  
	  @Test
	  public void userTest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		String Fname = excellib.getExcelData("Test-001", 1, 2);
		String Lname = excellib.getExcelData("Test-001", 1, 3);
		String username = excellib.getExcelData("Test-001", 1, 4);
		String email =   excellib.getExcelData("Test-001", 1, 5);
		String pwd =  excellib.getExcelData("Test-001", 1, 6);
		
		Reporter.log(Fname,true);
		Reporter.log(Lname,true);
		//String Lname =
		  commonlib.createUser(Fname, Lname, username, email, pwd, pwd);
		  String strExpText = "KK, kill (Khalessi)";
		  boolean actualFlag = webdriverCommonLib.verifyIfElementInWebTable("//table[@class='userListTable canEditUsers hidePTO sortByOvertime']/tbody", "tr", "td[1]", strExpText);		  
		  Assert.assertTrue(actualFlag,"Not found");
		  Reporter.log("User successfully added");
		  
		//  userlistpage.getUserNameInput().sendKeys("KK");
		  
	  }
	  
	//  @Test
	  public void createTaskTest() throws InterruptedException {
		  Reporter.log("Create Task test",true);
		  commonlib.createTask();
		  
		  
		  
	  }
	  
	  @AfterMethod
	  public void AfterProjectTest(){
		//  Driver.driver.close();
	  }
}
