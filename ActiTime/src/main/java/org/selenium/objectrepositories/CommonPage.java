package org.selenium.objectrepositories;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonPage {
	
	@FindBy(xpath="//a[@class='userProfileLink username']")
	private WebElement getUserNameText;
	
	@FindBy(xpath="//img[@src='/img/custom/logo.0.1639263166325251.jpg?hash=970234804']")
	private WebElement getCommonLogo;
	
	@FindBy(xpath="//div[contains(text(), 'Users')]/following-sibling::img")
	private WebElement getUsers;
	
	@FindBy(xpath="//div[contains(text(), 'Tasks')]/following-sibling::img")
	private WebElement Tasks;
	
	public WebElement getTasks() {
		return Tasks;
	}

	public WebElement getGetUsers() {
		return getUsers;
	}

	public WebElement getGetCommonLogo() {
		return getCommonLogo;
	}

	public WebElement getGetUserNameText() {
		return getUserNameText;
	}
	
	

}
