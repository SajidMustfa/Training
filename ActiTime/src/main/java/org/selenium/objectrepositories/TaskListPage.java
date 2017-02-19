package org.selenium.objectrepositories;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskListPage {

	
	
	@FindBy(xpath="//div[@id='ext-comp-1016']/span")
	private WebElement CreateTaskBtn;

	public WebElement getCreateTaskBtn() {
		return CreateTaskBtn;
	}
	
	
	
	
	
}
