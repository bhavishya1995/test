package com.PageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.Utilities.ReusableActionsClass;

public class LoginNegativeCase {

	WebDriver driver;
	
	SoftAssert softAssert = new SoftAssert();
	
	@FindBy(how=How.XPATH, using="//input[@name='Email']")
	WebElement userNameTextBox;
	
	@FindBy(how=How.XPATH, using="//input[@name='Password']")
	WebElement passwordTextBox;
	
	@FindBy(how=How.XPATH, using="//input[@id='signIn']")
	WebElement signInbtn;
	

public  LoginNegativeCase(WebDriver driver) {
	
	this.driver=driver;
}

public void InvalidEmail() {	
	
	ReusableActionsClass.waitforElementToBeLocated(driver,userNameTextBox);
	userNameTextBox.sendKeys("admin@videocom");
	
	System.out.println("The Email field is not a valid e-mail address.");
	 
}


public void ValidEmail() {
	ReusableActionsClass.waitforElementToBeLocated(driver,userNameTextBox);
	userNameTextBox.sendKeys("admin@video365.com");
	
}


public void BlankEmail() {
	ReusableActionsClass.waitforElementToBeLocated(driver,userNameTextBox);
	userNameTextBox.sendKeys("");
	System.out.println("The Email field is required.");
}

public void BlankPasswd() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,passwordTextBox);
	passwordTextBox.sendKeys("");
	System.out.println("The Password field is required.");
	
	
}

public void WrongPassword() {
	ReusableActionsClass.waitforElementToBeLocated(driver,passwordTextBox);
	passwordTextBox.sendKeys("Admin3456");
	System.out.println("Wrong Password.");
	
}

public void CorrectPasswd() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,passwordTextBox);
	passwordTextBox.sendKeys("Admin@123456");
	
	
	
}

public void SignInbtn() {
	ReusableActionsClass.waitforElementToBeLocated(driver,signInbtn);
	signInbtn.click();
	
}

public void LoginNegativeTCDetails() throws Exception {
	InvalidEmail();
	BlankPasswd();
	
	BlankEmail() ;
	BlankPasswd();
	
	ValidEmail();
	InvalidEmail();
	
	InvalidEmail();
	CorrectPasswd();
	
	InvalidEmail();	
	InvalidEmail();
	
	  
	SignInbtn();
	Thread.sleep(2000);  
}

}