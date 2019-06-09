package com.PageObjectClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Utilities.ReusableActionsClass;

public class Settings {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//a[@title='Settings']")
	WebElement settingstab;
	
	@FindBy(how=How.XPATH,using="//a[@href='/Configuration/RegenerateAccountKeys']")
	WebElement regenratekeys;
	
	@FindBy(how=How.XPATH,using="//a//i[@class='fa icon-lock ']")
	WebElement changepwd;
	
	@FindBy(how=How.XPATH,using="//input[@id='OldPassword']")
	WebElement currentpwd;
	
	@FindBy(how=How.XPATH,using="//input[@id='NewPassword']")
	WebElement newpwd;
	
	@FindBy(how=How.XPATH,using="//input[@id='ConfirmPassword']")
	WebElement confrmpwd;
	
	@FindBy(how=How.XPATH,using="//button[@value='Change password']")
	WebElement changepwdbtn;
	
	@FindBy(how=How.XPATH,using="//a/i[@class='fa icon-wrench ']")
	WebElement accountsettings;
	
	@FindBy(how=How.XPATH,using="//input[@id='FirstName']")
	WebElement firstname;
	
	@FindBy(how=How.XPATH,using="//input[@id='LastName']")
	WebElement lastname;
	
	@FindBy(how=How.XPATH,using="//input[@id='PhoneNumber']")
	WebElement phonenumber;
	
	@FindBy(how=How.XPATH,using="//input[@id='Company']")
	WebElement company;
	
	@FindBy(how=How.XPATH,using="//input[@id='Designation']")
	WebElement designation;
	
	@FindBy(how=How.XPATH,using="//input[@id='UserPhoto']")
	WebElement userPhoto;
	
	@FindBy(how=How.XPATH,using="//button[@id='createPlayerBtn']")
	WebElement updatedetails;
	
	public Settings(WebDriver driver) {
		this.driver=driver;
		
	}
	
public void Scrolldown() {
		
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
	}
	
	public void SettingsTab() {
		
		ReusableActionsClass.waitforElementToBeLocated(driver, settingstab);
		settingstab.click();
	}
	
public void RegenrateKeys() {
		
		ReusableActionsClass.waitforElementToBeLocated(driver, regenratekeys);
		regenratekeys.click();
	}

public void ChangePwd() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver, changepwd);
	changepwd.click();
}

public void CurrentPwd(){
	
	ReusableActionsClass.waitforElementToBeLocated(driver, currentpwd);
	currentpwd.sendKeys("Admin@123456");
}

public void NewPwd(){
	
	ReusableActionsClass.waitforElementToBeLocated(driver, newpwd);
	newpwd.sendKeys("Admin@12345");
}

public void ChangePwdBtn(){
	
	ReusableActionsClass.waitforElementToBeLocated(driver, changepwdbtn);
	changepwdbtn.click();
}

public void ConfrmPwd(){
	
	ReusableActionsClass.waitforElementToBeLocated(driver, confrmpwd);
	confrmpwd.sendKeys("Admin@12345");
}

public void AccSettings(){
	
	ReusableActionsClass.waitforElementToBeLocated(driver, accountsettings);
	accountsettings.click();
}

public void FirstName(){
	
	ReusableActionsClass.waitforElementToBeLocated(driver, firstname);
	firstname.clear();
	firstname.sendKeys("Video365");	
}

public void LastName(){
	
	ReusableActionsClass.waitforElementToBeLocated(driver, lastname);
	lastname.clear();
	lastname.sendKeys("Admin");	
}

public void PhoneNumber(){
	
	ReusableActionsClass.waitforElementToBeLocated(driver, phonenumber);
	phonenumber.clear();
	phonenumber.sendKeys("7799071902");	
}

public void Company(){
	
	ReusableActionsClass.waitforElementToBeLocated(driver, company);
	company.clear();
	company.sendKeys("Monocept");	
}

public void Designation(){
	
	ReusableActionsClass.waitforElementToBeLocated(driver, designation);
	designation.sendKeys("Admin");	
}

public void Choosefile(){
	
	ReusableActionsClass.waitforElementToBeLocated(driver, userPhoto);
	userPhoto.sendKeys("F:\\Video365AzureDevops\\ProjectVideo365\\dp2.jpg");	
}

public void UpdateDetailsbtn(){
	
	ReusableActionsClass.waitforElementToBeLocated(driver, updatedetails);
	updatedetails.click();
}


	
	public void SettingsDetails() throws Exception {
		
		SettingsTab();
		Thread.sleep(5000);
		//RegenrateKeys();
		//Thread.sleep(3000);
		Scrolldown();
					
		AccSettings();
		FirstName();
		LastName();
		PhoneNumber();
		Company();
		Designation();
		Thread.sleep(2000);
	//	Choosefile();
	//	Thread.sleep(2000);
		UpdateDetailsbtn();
		ChangePwd();
		Thread.sleep(2000);
		CurrentPwd();
		NewPwd();
		ConfrmPwd();
		Thread.sleep(2000);
		ChangePwdBtn();
	}
}
