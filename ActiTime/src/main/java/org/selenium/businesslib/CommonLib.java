package org.selenium.businesslib;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.loggers.utils.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.selenium.genericlib.Driver;
import org.selenium.genericlib.WebDriverCommonLib;
import org.selenium.objectrepositories.CommonPage;
import org.selenium.objectrepositories.LoginPage;
import org.selenium.objectrepositories.TaskListPage;
import org.selenium.objectrepositories.UserListPage;



public class CommonLib {
	
	LoginPage loginpage = PageFactory.initElements(Driver.driver, LoginPage.class);
	UserListPage userlistpage = PageFactory.initElements(Driver.driver, UserListPage.class);
	CommonPage commonpage = PageFactory.initElements(Driver.driver, CommonPage.class);
	TaskListPage tasklistpage = PageFactory.initElements(Driver.driver, TaskListPage.class);
	
	WebDriverCommonLib webdrivercomlib = new WebDriverCommonLib();
	
	
	static final Logger logger = Logger.getLogger(CommonLib.class);
	
	public void login(String username,String password ){
		BasicConfigurator.configure();
		new LogStarter();
		//ExplicitWait.waitForElement(loginpage.getImage());
		//Reporter.log("Enter Credentials");		
		loginpage.getUserNameField().sendKeys(username);
		loginpage.getpwdField().sendKeys(password);
		logger.debug("Enter user credential");
		loginpage.getloginBtn().click();
		
		
		logger.debug("User logs in");
		
	}
	
	public void createUser(String strFirstName,String strLastName ,String userName , String strEmailID ,
			String strPassword, String strCopyPassword) throws InterruptedException{
		
		commonpage.getGetUsers().click();		  
		Thread.sleep(3000);
		userlistpage.getGetUserBtn().click();
		userlistpage.getFirstUserNameField().sendKeys(strFirstName);
		userlistpage.getGetUserNameField().sendKeys(strLastName);
		userlistpage.getGetLastNameField().sendKeys(userName);
		userlistpage.getGetEmailField().sendKeys(strEmailID);
		userlistpage.getGetpasswordField().sendKeys(strPassword);
		userlistpage.getGetpasswordCopyField().sendKeys(strCopyPassword);
		
	//	Driver.driver.findElement(By.xpath("//button[Text()='Feb 18, 2017']")).click();;
		
		userlistpage.getCreateUserBtn().click();
		}
	
	public void createTask() throws InterruptedException{

		commonpage.getTasks().click();
		Thread.sleep(2000);
		tasklistpage.getCreateTaskBtn().click();
		WebElement web = Driver.driver.findElement(By.xpath("/button[@id='ext-gen55']"));
		Thread.sleep(2000);
		webdrivercomlib.select(web, "Boston Chocolate");
		//button[@id='ext-gen55']
		
	}
	
}
