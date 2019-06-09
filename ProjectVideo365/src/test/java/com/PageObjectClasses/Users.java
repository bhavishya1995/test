package com.PageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Utilities.ReusableActionsClass;

public class Users {
	WebDriver driver;

	@FindBy(how=How.XPATH, using="//a[@href='/User/Index'][@title='Users']")
	WebElement userstab;
	
	@FindBy(how=How.XPATH, using="//a[@href='/Account/Register']")
	WebElement createuser;
	
	@FindBy(how=How.XPATH,using="//input[@id='Email']")
	WebElement useremail;
	
	@FindBy(how=How.XPATH,using="//input[@id='FirstName']")
	WebElement userFirstname;
	
	@FindBy(how=How.XPATH,using="//input[@id='LastName']")
	WebElement userLastname;
	
	@FindBy(how=How.XPATH,using="//select//option[@value='Manager']")
	WebElement managerole;
	
	@FindBy(how=How.XPATH,using="//select//option[@value='Publisher']")
	WebElement publisherole;
	
	@FindBy(how=How.XPATH,using="//select//option[@value='Analyst']")
	WebElement analystrole;	
	
	@FindBy(how=How.XPATH,using="//select//option[@value='Editor']")
	WebElement editorole;
	
	@FindBy(how=How.XPATH,using="//button[@id='register']")
	WebElement registerbtn;
	
	@FindBy(how=How.XPATH,using="//input[@value='aa211ee1-ea17-4ccc-8359-360fc1e91ff0']")
	WebElement selectUser;
	
	@FindBy(how=How.XPATH,using="//button[@id='editUser']")
	WebElement editUser;
	
	@FindBy(how=How.XPATH,using="//button[@id='update']")
	WebElement updateDetails;
	
	

	@FindBy(how=How.XPATH, using="//input[@type='email']")
	WebElement gmailid;	
	@FindBy(how=How.XPATH, using="//div[@id='identifierNext']")
	WebElement mailnxtbtn;
	@FindBy(how=How.XPATH, using="//input[@type='password']")
	WebElement gmailPwd;
	@FindBy(how=How.XPATH, using="//div[@id='passwordNext']")
	WebElement gmailPwdnxtbtn;
	@FindBy(how=How.XPATH, using="//a[contains(@title,'Inbox')]")
	WebElement mailInbox;
	@FindBy(how=How.XPATH, using="//div[@class='UI']//table//tr[1]//following-sibling::td[@class='oZ-x3 xY']")
	WebElement selectFirstMail;
	@FindBy(how=How.XPATH, using="//div[@class='UI']//table//tr[1]")
	WebElement firstMailMessageRow;
	@FindBy(how=How.XPATH, using="//table[contains(@class,'MsoNormalTable')]//tr[2]//p[2]//a/img")
	WebElement verifyuserimg;
	
	@FindBy(how=How.XPATH,using="//a[@id='loginLink']")
	WebElement loginlink;

public Users(WebDriver driver) {
	
	this.driver=driver;
}

public void usersTab() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,userstab);
	userstab.click();
}

public void CreateUser() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,createuser);
	createuser.click();
}

public void UserEmail() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,useremail);
	useremail.sendKeys("priya.video365@gmail.com");
	
}

public void UserFirstName() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,userFirstname);
	userFirstname.sendKeys("Priya");
	
}

public void UserLastName() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,userLastname);
	userLastname.sendKeys("Sharma");
	
}

public void ManageRole() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,	managerole);
	managerole.click();
	
}

public void PublisheRole() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,publisherole);
	publisherole.click();
	
}

public void AnalystRole() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,analystrole);
	analystrole.click();
	
}

public void EditorRole() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,editorole);
	editorole.click();
	
}

public void RegisterBtn() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,registerbtn);
	registerbtn.click();
	
}

public void verifyUser() {
	
	driver.get("https://www.gmail.com/");
	ReusableActionsClass.waitforElementToBeLocated(driver,gmailid);
	gmailid.sendKeys("priya.video365");
	
}

public void NxtMailBtn() {
	ReusableActionsClass.waitforElementToBeLocated(driver,mailnxtbtn);
	mailnxtbtn.click();
}	

public void GmailPwd() {
	ReusableActionsClass.waitforElementToBeLocated(driver,gmailPwd);
	gmailPwd.sendKeys("Priya@123456");
}

public void NxtPwdBtn() {
	ReusableActionsClass.waitforElementToBeLocated(driver,gmailPwdnxtbtn);
	gmailPwdnxtbtn.click();
}

public void setDetailsEmailLink() throws Exception{
	
	ReusableActionsClass.waitforElementToBeLocated(driver, mailInbox);
	mailInbox.click();
	
	Thread.sleep(5000);
	
	//driver.navigate().refresh();
	
	ReusableActionsClass.waitforElementToBeLocated(driver, firstMailMessageRow);
	firstMailMessageRow.click();
	Thread.sleep(10000);
	
	ReusableActionsClass.waitforElementToBeLocated(driver, verifyuserimg);
	verifyuserimg.click();
	
	ReusableActionsClass.waitforElementToBeLocated(driver, loginlink);
	loginlink.click();
	
}

public void SelectUser() {
	ReusableActionsClass.waitforElementToBeLocated(driver,selectUser);
	selectUser.click();
}

public void EditUser() {
	ReusableActionsClass.waitforElementToBeLocated(driver,editUser);
	editUser.click();
}

public void UpdateDetails() {
	ReusableActionsClass.waitforElementToBeLocated(driver,updateDetails);
	updateDetails.click();
}




public void UsersDetails() throws Exception {
    	usersTab();
CreateUser();
	UserEmail();
	UserFirstName();
	UserLastName();
	AnalystRole();
	RegisterBtn();
	Thread.sleep(3000);
	verifyUser();
	NxtMailBtn();
	GmailPwd();
	NxtPwdBtn();
	setDetailsEmailLink();  
	
	/*
	SelectUser();
	EditUser();
	//AnalystRole();
	//EditorRole();
	ManageRole();
	//PublisheRole();
	
	Thread.sleep(2000);
	UpdateDetails();       */
	

}

}
