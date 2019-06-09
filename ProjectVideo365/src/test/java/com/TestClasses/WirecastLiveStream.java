package com.TestClasses;

import java.io.File;
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
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PageObjectClasses.LoginPage;
import com.Utilities.ReusableActionsClass;


public class WirecastLiveStream {
	WebDriver driver;
	File folder;
	LoginPage loginpage;
	
	@FindBy(how=How.XPATH,using="//section[@id='main-wrapper']/aside//ul[contains(@class,'nav-pills')]/li[8]/a")
	WebElement livestream;
	
	@FindBy(how=How.XPATH,using=" //table[@id='videoTable']/tbody/tr[2]/td[6]/a")
	WebElement managebtn;
	
	@FindBy(how=How.XPATH,using="//a[@id='downloadPresetFile']")
	WebElement downldpresetfile;
	
public void Scrolldown() {
		
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
	}
	
public void liveStream() {
	ReusableActionsClass.waitforElementToBeLocated(driver, livestream);
	livestream.click();
}
	
	@BeforeMethod

	public void beforeMethod() {
		
		folder=new File(UUID.randomUUID().toString());
		folder.mkdir();
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		
        ChromeOptions options=new ChromeOptions();
		
		Map<String,Object> prefs= new HashMap<String, Object>();
		prefs.put("profile.default_content_settings.popups",0);
		prefs.put("download.default_directory",folder.getAbsolutePath());
		
		options.setExperimentalOption("prefs", prefs);
			DesiredCapabilities cap= DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		driver=new ChromeDriver(cap);
		driver.manage().window().maximize();
		}
		
		
		@Test


		public void wirecastLiveStream() throws Exception {
			
			driver.get("https://qaadmin.video365.com/");
			loginpage=PageFactory.initElements(driver, LoginPage.class);
			
			loginpage.LoginDetails();
			Scrolldown();
			liveStream();
			managebtn.click();
			Thread.sleep(3000);
			downldpresetfile.click();
			Thread.sleep(3000);
			File listOfFiles[]=folder.listFiles();
			
			Assert.assertTrue(listOfFiles.length>0);
			
			for(File file:listOfFiles) {
				
			Assert.assertTrue(file.length()>0);
			
			
		}
			
}
}

