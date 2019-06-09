

package com.PageObjectClasses;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.asserts.SoftAssert;

import com.Utilities.ReusableActionsClass;

import junit.framework.Assert;

public class LoginPage {
	WebDriver driver;
	
	SoftAssert softAssert = new SoftAssert();
//pAGE FACTORY
	@FindBy(how=How.XPATH, using="//input[@name='Email']")
	WebElement userNameTextBox;
	
	@FindBy(how=How.XPATH, using="//input[@name='Password']")
	WebElement passwordTextBox;
	
	@FindBy(how=How.XPATH, using="//input[@id='signIn']")
	WebElement signInbtn;
	
	@FindBy(how=How.XPATH, using="//button[@id='header-logout']")
	WebElement logout;
	
	@FindBy(how=How.XPATH, using="//a[@href='/Account/ForgotPassword']")
	WebElement forgotpwd;
	
	@FindBy(how=How.XPATH, using="//input[@id='Email']")
	WebElement emailLinkfield;
	
	@FindBy(how=How.XPATH, using="//input[@value='Email Link']")
	WebElement emailLinkbtn;
	
	@FindBy(how=How.XPATH, using="//input[@type='email']")
	WebElement gmailid;
	
	@FindBy(how=How.XPATH, using="//div[@id='identifierNext']")
	WebElement mailnxtbtn;
	
	@FindBy(how=How.XPATH, using="//input[@type='password']")
	WebElement gmailPwd;
	
	@FindBy(how=How.XPATH, using="//div[@id='passwordNext']")
	WebElement gmailPwdnxtbtn;
	
	@FindBy(how=How.XPATH, using="//input[@id='Email']")
	WebElement useridfield;

	@FindBy(how=How.XPATH, using="//input[@id='Password']")
	WebElement resetPwd;
	
	@FindBy(how=How.XPATH, using="//input[@id='ConfirmPassword']")
	WebElement resetConfrmPwd;
	
	@FindBy(how=How.XPATH, using="//input[@value='Update']")
	WebElement updatePwd;
	
	
	
	//Gmail UI Element
	@FindBy(how=How.XPATH, using="//a[@aria-label='Mail']")
	WebElement mailImagelink;
	
	@FindBy(how=How.XPATH, using="//a[contains(@title,'Inbox')]")
	WebElement mailInbox;
	@FindBy(how=How.XPATH, using="//div[@class='UI']//table//tr[1]//following-sibling::td[@class='oZ-x3 xY']")
	WebElement selectFirstMail;
	@FindBy(how=How.XPATH, using="//div[contains(@class,'G-pMpUR-SBEKme')]//div[@class='G-Ni J-J5-Ji'][2]//div[3]")
	WebElement deleteBtn;
	@FindBy(how=How.XPATH, using="//div[@class='UI']//table//tr[1]")
	WebElement firstMailMessageRow;
	@FindBy(how=How.XPATH, using="//p[text()='*Premium as per the details provided above and is valid as on date.']/ancestor::td[1]/p[6]/a")
	WebElement emailBodyPaymentLink;	

	@FindBy(how=How.XPATH, using="//table[contains(@class,'MsoNormalTable')]//tr[2]//p[2]//a/img")
	WebElement resetpwdimg;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void UserId() {
		ReusableActionsClass.waitforElementToBeLocated(driver,userNameTextBox);
		userNameTextBox.sendKeys("admin.video365@monocept.com");
		
	}
	 
	public void PasswdFld() {
		ReusableActionsClass.waitforElementToBeLocated(driver,passwordTextBox);
		passwordTextBox.sendKeys("CeptMono@12345");
		Assert.assertEquals("CeptMono@12345","CeptMono@12345");
		
		System.out.println("Valid User login");
		softAssert.assertAll();  
		
	}   
	public void SignInBtn() {
		ReusableActionsClass.waitforElementToBeLocated(driver,signInbtn);
		signInbtn.click();
		
	}
	
	
	public void logout() {
		ReusableActionsClass.waitforElementToBeLocated(driver,logout);
		logout.click();
		
	}	
	
	public void ForgotPwd() {
		ReusableActionsClass.waitforElementToBeLocated(driver,forgotpwd);
		forgotpwd.click();
		
	}
	
	public void EmailLinkfield() {
		ReusableActionsClass.waitforElementToBeLocated(driver,emailLinkfield);
		emailLinkfield.sendKeys("priya.video365@gmail.com");
		
	}
	
	public void EmailResetpwd() {
		ReusableActionsClass.waitforElementToBeLocated(driver,useridfield);
		useridfield.click();
		useridfield.sendKeys("Admin@video365.com");
		
	}
	
	public void ResetPwd() {
		ReusableActionsClass.waitforElementToBeLocated(driver,resetPwd);
		resetPwd.sendKeys("Admin@1234567");
		
	}
	
	public void ResetConfrmPwd() {
		ReusableActionsClass.waitforElementToBeLocated(driver,resetConfrmPwd);
		resetConfrmPwd.sendKeys("Admin@1234567");
		
	}
	
	public void UpdatePwd() {
		ReusableActionsClass.waitforElementToBeLocated(driver,updatePwd);
		updatePwd.click();		
	}
	
	public void EmailLinkBtn() {
		ReusableActionsClass.waitforElementToBeLocated(driver,emailLinkbtn);
		emailLinkbtn.click();
		
	}
	
	public void ResetpwdLink() {
		
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
	
	

	//Function for payment through Email Link
	public void setDetailsEmailPaymentLink() throws Exception{
		
		ReusableActionsClass.waitforElementToBeLocated(driver, mailInbox);
		mailInbox.click();
		
		Thread.sleep(5000);
		
		//driver.navigate().refresh();
		
		ReusableActionsClass.waitforElementToBeLocated(driver, firstMailMessageRow);
		firstMailMessageRow.click();
		Thread.sleep(10000);
		
		ReusableActionsClass.waitforElementToBeLocated(driver, resetpwdimg);
		resetpwdimg.click();
		
	}
	
	/*Delete first message in Gmail
	public void gmail_messageDelete() throws Exception{
	selectFirstMail.click();
	Thread.sleep(5000);
	deleteBtn.click(); 
	} */
	
	
	public void LoginDetails() throws Exception {
		
		UserId();
		Thread.sleep(2000);
		PasswdFld();
		SignInBtn();
		/* 
		Thread.sleep(2000);
     	ForgotPwd();
		EmailLinkfield();
		EmailLinkBtn();   
		ResetpwdLink();
		NxtMailBtn();
		Thread.sleep(2000);
		GmailPwd();
		NxtPwdBtn();
		Thread.sleep(5000); 
		//logout();
		setDetailsEmailPaymentLink();
		EmailResetpwd();
		ResetPwd();
		ResetConfrmPwd();
		UpdatePwd();   */
	}
}
	

