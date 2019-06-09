package com.PageObjectClasses;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.Utilities.ReusableActionsClass;

public class LiveStream {
	WebDriver driver;
	File folder;

	@FindBy(how=How.XPATH,using="//section[@id='main-wrapper']/aside//ul[contains(@class,'nav-pills')]/li[8]/a")
	WebElement livestream;
	
	@FindBy(how=How.XPATH,using="//a[@href='/LiveStream/Create']")
	WebElement createChannel;
	
	@FindBy(how=How.XPATH,using="//input[@id='channelName']")
	WebElement channelname;
	
	@FindBy(how=How.XPATH,using="//input[@id='description']")
	WebElement channeldescription;
	
	@FindBy(how=How.XPATH,using="//button[@id='channelButton']")
	WebElement channelbtn;
	
	@FindBy(how=How.XPATH,using=" //table[@id='videoTable']/tbody/tr[2]/td[6]/a")
	WebElement managebtn;
	
	@FindBy(how=How.XPATH,using="//a[@id='startChannelBtn']")
	WebElement startchannelbtn;
	
	@FindBy(how=How.XPATH,using="//a[@id='stopChannelBtn']")
	WebElement stopchannelbtn;
	
	
	
	@FindBy(how=How.XPATH,using="//a[contains(@class,'filterbuttons-black')]/i[@class='fa fa-refresh']")
	WebElement refreshchannelbtn;
	
	@FindBy(how=How.XPATH,using="//div[contains(@class,'col-md-9')]/div/div/a/i[@class=' fa fa-plus']")
	WebElement createEventbtn;
	
	@FindBy(how=How.XPATH,using="//input[@id='eventName']")
	WebElement eventname;
	
	@FindBy(how=How.XPATH,using="//input[@id='description']")
	WebElement eventdescriptn;
	
	@FindBy(how=How.XPATH,using="//input[@id='hours']")
	WebElement eventhrs;
	
	@FindBy(how=How.XPATH,using="//input[@id='minutes']")
	WebElement eventminutes;
	
	@FindBy(how=How.XPATH,using="//button[@id='eventButton']")
	WebElement eventbtn;
	
	@FindBy(how=How.XPATH,using="//a[@id='downloadPresetFile']")
	WebElement downldpresetfile;
	
	
	
	public LiveStream(WebDriver driver) {
		this.driver=driver;
	}
	
	
public void Scrolldown() {
		
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
	}

	public void liveStream() {
		ReusableActionsClass.waitforElementToBeLocated(driver, livestream);
		livestream.click();
	}
	
	public void CreateChannel() {
		ReusableActionsClass.waitforElementToBeLocated(driver, createChannel);
		createChannel.click();
	}
	
	public void ChannelName() {
		ReusableActionsClass.waitforElementToBeLocated(driver, channelname);
		channelname.sendKeys("TestChannel");
		
	}
	
	public void ChannelDescriptn() {
		ReusableActionsClass.waitforElementToBeLocated(driver, channeldescription);
		channeldescription.sendKeys("Testing LiveStreaming");
		
	}
	
	public void Channelbtn() {
		ReusableActionsClass.waitforElementToBeLocated(driver, channelbtn);
		channelbtn.click();
	}
	
	public void ManageBtn() {
		ReusableActionsClass.waitforElementToBeLocated(driver, managebtn);
		managebtn.click();
	}
	
	public void StartChannelBtn() {
		ReusableActionsClass.waitforElementToBeLocated(driver, startchannelbtn);
		startchannelbtn.click();
	}
	
	public void StopChannelBtn() {
		ReusableActionsClass.waitforElementToBeLocated(driver, startchannelbtn);
		stopchannelbtn.click();
	}
	
	public void RefreshChannelBtn() {
		ReusableActionsClass.waitforElementToBeLocated(driver, refreshchannelbtn);
		refreshchannelbtn.click();
	}
	
	public void CreateEventBtn() {
		ReusableActionsClass.waitforElementToBeLocated(driver, createEventbtn);
		createEventbtn.click();
	}

	public void EventName() {
		ReusableActionsClass.waitforElementToBeLocated(driver, eventname);
		eventname.sendKeys("TestEvent1");
	}
	
	public void EventDescriptn() {
		ReusableActionsClass.waitforElementToBeLocated(driver, eventdescriptn);
		eventdescriptn.sendKeys("LiveStreaming Event");
	}
	
	public void EventHrs() {
		ReusableActionsClass.waitforElementToBeLocated(driver, eventname);
		eventhrs.clear();
		eventhrs.sendKeys("4");
	}
	
	public void EventMinutes() {
		ReusableActionsClass.waitforElementToBeLocated(driver, eventminutes);
		eventminutes.clear();
		eventminutes.sendKeys("10");
	}
	
	public void EventBtn() {
		ReusableActionsClass.waitforElementToBeLocated(driver, eventbtn);
		eventbtn.click();
	}
	
	public void DownldPresetFile() throws Exception {
		
		folder=new File(UUID.randomUUID().toString());
		folder.mkdir();
		
		ReusableActionsClass.waitforElementToBeLocated(driver,downldpresetfile);
		downldpresetfile.click();
		
		}
	
	
	
	
	public void LiveStreamDetail() throws Exception {
		Scrolldown();
		liveStream();
		Thread.sleep(2000);
		CreateChannel();
		ChannelName();
		ChannelDescriptn();
		Thread.sleep(2000);
		Channelbtn();
		Thread.sleep(2000);  
		ManageBtn();
		Thread.sleep(2000);
		StartChannelBtn();
		Thread.sleep(26000);
		RefreshChannelBtn(); 
		Thread.sleep(2000);
		CreateEventBtn();
		EventName();
		EventDescriptn();
		EventHrs();
		EventMinutes();
		Thread.sleep(2000);
		EventBtn();
		Thread.sleep(2000);  
		DownldPresetFile();
		Thread.sleep(2000);
		//StopChannelBtn() ;
		
		
		
		
	}
}

