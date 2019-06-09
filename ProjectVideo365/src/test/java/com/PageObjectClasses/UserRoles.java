package com.PageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Utilities.ReusableActionsClass;

import junit.framework.Assert;

public class UserRoles {
	WebDriver driver;
	
	@FindBy(how=How.XPATH, using="//input[@name='Email']")
	WebElement userNameTextBox;
	
	@FindBy(how=How.XPATH, using="//input[@name='Password']")
	WebElement passwordTextBox;
	
	@FindBy(how=How.XPATH, using="//input[@id='signIn']")
	WebElement signInbtn;
	
	@FindBy(how=How.XPATH, using="//span[@class='caret']")
	WebElement analystDropdwn;
	
	@FindBy(how=How.XPATH, using="//a[@href='/Configuration/Index']")
	WebElement analystAccKeys;
	
	@FindBy(how=How.XPATH, using="//a[@href='/Configuration/AllowedDomains']")
	WebElement analystDomainRt;
	
	@FindBy(how=How.XPATH, using="//a[@title='Media']")
	 WebElement media;
	
	@FindBy(how=How.XPATH, using="//a[@href='/Dashboard/Reports']//i[contains(@class,'icon-fontsize')]")
	 WebElement dashboardtab;
	
	@FindBy(how=How.XPATH, using="//a[@title='Players']")
	 WebElement player;
	
	@FindBy(how=How.XPATH, using="//a[@href='/User/Index'][@title='Users']")
	WebElement userstab;
	
	@FindBy(how=How.XPATH, using="//a[@title='PlayList']")
	 WebElement playlist;
	
	@FindBy(how=How.XPATH, using="//a[@href='/LiveStream/Index']")
	 WebElement livestream;
	
	@FindBy(how=How.XPATH, using="//a[@title='Content Organization']")
	WebElement collection;
	
	
	public UserRoles(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void UserId() {
		ReusableActionsClass.waitforElementToBeLocated(driver,userNameTextBox);
		userNameTextBox.sendKeys("priya.video365@gmail.com");
		
	}
	 
	public void PasswdFld() {
		ReusableActionsClass.waitforElementToBeLocated(driver,passwordTextBox);
		passwordTextBox.sendKeys("Admin@123456");
		
	}   
	public void SignInBtn() {
		ReusableActionsClass.waitforElementToBeLocated(driver,signInbtn);
		signInbtn.click();
		
	}
	
	public void AnalystDropdwn() {
		ReusableActionsClass.waitforElementToBeLocated(driver,analystDropdwn);
		analystDropdwn.click();
		
	}
	
	public void AnalystAccKeys() {
		ReusableActionsClass.waitforElementToBeLocated(driver,analystAccKeys);
		analystAccKeys.click();
		
	}
	
	public void AnalystDomainRt() {
		ReusableActionsClass.waitforElementToBeLocated(driver,analystDomainRt);
		analystDomainRt.click();
		
	}
	
	public void mediatab() {
		ReusableActionsClass.waitforElementToBeLocated(driver, media);
		media.click();
	}
	
	public void Dashboardtab() {
		ReusableActionsClass.waitforElementToBeLocated(driver, dashboardtab);
		dashboardtab.click();
	}
	
	public void playerTab() {
		ReusableActionsClass.waitforElementToBeLocated(driver, player);
		player.click();
	}

	public void usersTab() {
		
		ReusableActionsClass.waitforElementToBeLocated(driver,userstab);
		userstab.click();
	}
	public void PlaylistTab(){
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, playlist);
		playlist.click();
		
	}
	
	public void LivestreamTab(){
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, livestream);
		livestream.click();
		
	}
	
	public void CollectionTab() {
		
		ReusableActionsClass.waitforElementToBeLocated(driver, collection);
		collection.click();	
		
	}
	
	
	
	public void UsersRolesDetails() throws Exception {
		
		UserId();
		Thread.sleep(2000);
		PasswdFld();
		SignInBtn();
		AnalystDropdwn();
		Thread.sleep(2000);
		 AnalystAccKeys();
		 Thread.sleep(2000);
		 AnalystDropdwn();
		 Thread.sleep(2000);
		 AnalystDomainRt();
		 Thread.sleep(2000);
		 Dashboardtab();
		 Thread.sleep(5000);
		 usersTab();
		 Thread.sleep(2000);
		 LivestreamTab();
		 Thread.sleep(2000);

		/* mediatab();
		 Thread.sleep(2000);
	     playerTab();
		 Thread.sleep(2000);
		 PlaylistTab();
		 Thread.sleep(2000);
		 CollectionTab();*/
		
	}

}
