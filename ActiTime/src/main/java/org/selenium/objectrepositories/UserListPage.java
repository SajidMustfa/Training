package org.selenium.objectrepositories;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserListPage {
	
	@FindBy(xpath="//div[@id='ext-comp-1003']")
	private WebElement getUserBtn;
	
	@FindBy(id="userDataLightBox_commitBtn")
	private WebElement getCreateUserBtn;
	
	@FindBy(id="userDataLightBox_usernameField")
	private WebElement getUserNameField;
	
	@FindBy(id="userDataLightBox_firstNameField")
	private WebElement firstUserNameField;
	
	
	@FindBy(id="userDataLightBox_lastNameField")
	private WebElement getLastNameField;
	
	@FindBy(id="userDataLightBox_emailField")
	private WebElement getEmailField;
	
	@FindBy(id="userDataLightBox_passwordField")
	private WebElement getpasswordField;
			
	@FindBy(id="userDataLightBox_passwordCopyField")
	private WebElement getpasswordCopyField;
	
	@FindBy(id="ext-gen148")
	private WebElement timeZoneDropDown;
	
	@FindBy(id ="ext-gen175")
	private WebElement overTimeDropDown;
	
	@FindBy(id="userNameInput")
	private WebElement userNameInput;
	
	@FindBy(xpath="//td[@id='userDataLightBox_accessSelectorPlaceholder']/img")
	private WebElement userActiveButton;
		
	public WebElement getUserActiveButton() {
		return userActiveButton;
	}

	public WebElement getUserNameInput() {
		return userNameInput;
	}

	public WebElement getOverTimeDropDown() {
		return overTimeDropDown;
	}

	public WebElement getTimeZoneDropDown() {
		return timeZoneDropDown;
	}

	public WebElement getUserNameField() {
		return getUserNameField;
	}
			
	public WebElement getLastNameField() {
		return getLastNameField;
	}
							
	public WebElement getCreateUserBtn() {
		return getCreateUserBtn;
	}
	public WebElement getGetUserNameField() {
		return getUserNameField;
	}

	public WebElement getGetLastNameField() {
		return getLastNameField;
	}

	public WebElement getGetEmailField() {
		return getEmailField;
	}

	public WebElement getGetpasswordField() {
		return getpasswordField;
	}

	public WebElement getGetpasswordCopyField() {
		return getpasswordCopyField;
	}
	
	public WebElement getGetUserBtn() {
		return getUserBtn;
	}
	
	public WebElement getFirstUserNameField() {
		return firstUserNameField;
	}

	
	

}
