package org.selenium.objectrepositories;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(id="username")
	private WebElement userNameField;
	

	@FindBy(name="pwd")
	private WebElement pwdField;
	

	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//img[@src='/img/custom/logo.0.1639263166325251.jpg?hash=970234804']")
	private WebElement getImage;
	
	
	
	
	public WebElement getUserNameField(){
		
		return userNameField;
	}
		
	public WebElement getpwdField(){
		return pwdField;
		
	}
		
	public WebElement getloginBtn(){
		return loginBtn;
		
	}
	
	public WebElement getImage(){
		return getImage;
	}
	

}
