package com.PageObjectClasses;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Utilities.ReadexcelFile;
import com.Utilities.ReusableActionsClass;

public class WebinarChatApp {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH ,using="//input[@id='txtNickName']")
	WebElement entername;
	
	@FindBy(how=How.XPATH ,using="//input[@id='btnStartChat']")
	WebElement startbtn;
	
	
	public WebinarChatApp(WebDriver driver) {
		this.driver=driver;
		
	}
	
/*	public void MemberName() {
		
		ReusableActionsClass.waitforElementToBeLocated(driver,entername);
		entername.sendKeys("Priya");
		
	}*/
	
	public void StartBtn() {
		
		ReusableActionsClass.waitforElementToBeLocated(driver,startbtn);
		startbtn.click();
	}
	
	public void WebChatdetails() throws Exception {
		
		//int rownum=ReusableActionsClass.maxrow;
		
        ReadexcelFile.readExcel("sheet1");
		
		for(int i=0; i<=ReadexcelFile.rowCount-1; i++)
		{
			String str=ReadexcelFile.readdata[i][0].toString();
			ReusableActionsClass.waitforElementToBeLocated(driver,entername);
			entername.sendKeys(str);
			StartBtn();
			Thread.sleep(2000);
		
			
			 JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.open('your url','_blank');");
			
				
				String WindowHandle=driver.getWindowHandle();
				for(String winHandle: driver.getWindowHandles()) {
					driver.switchTo().window(winHandle);
				}
				
			//ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		    //driver.switchTo().window(tabs.get(i+1));
		    Thread.sleep(3000);
		    
				
		    
			driver.get("http://video365webinar.azurewebsites.net/");
			
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				
			
			
		}
	}
		
		
	

}
