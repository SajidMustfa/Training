package org.selenium.genericlib;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverCommonLib {
	
public void waitForElement(String webelement) {
		
		WebDriverWait webdriverwait = new WebDriverWait(Driver.driver, 20);
		webdriverwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(webelement)));
		
	}

public void select(WebElement selWb , String value){
	Select sel = new Select(selWb);
	sel.selectByVisibleText(value);
}

public void select(WebElement selWb , int index){
	Select sel = new Select(selWb);
	sel.selectByIndex(index);
}
public void getSelectElement(WebElement web , String str){
	
	try{
		Select select= new Select(web);
		List<WebElement> list = select.getOptions();
		
		for(int i=0 ; i<list.size();i++){
			
			String actualVal = list.get(i).getText();
				if(actualVal.contains(str)){
					//select.selectByVisibleText(actualVal);
					web.sendKeys(str);
					break;
				}
			
		}
		
	}catch(Exception e){
		e.printStackTrace();
	}
}

public boolean verifyIfElementInWebTable(String tableName,String row,String column,String strExpText){
	
    boolean statusFlag = false;
    

	
	WebElement htmltable =  Driver.driver.findElement(By.xpath(tableName));
	  List<WebElement> rows = htmltable.findElements(By.tagName(row));
	  
	  for( int i=0;i<rows.size();i++){
		  List<WebElement> cols = rows.get(i).findElements(By.xpath(column));
	  
		  for( int j=0 ; j< cols.size() ;j++){
			  //Reporter.log(cols.get(j).getText(),true);
			  
			  if(strExpText.contains(cols.get(j).getText())){
				  statusFlag =true;
					  break;
			  }
				 			
		  }				  			  
	  }
	return statusFlag;
}

}
