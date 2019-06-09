package com.TestClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PageObjectClasses.WebinarChatApp;

public class TestClassWebChat {
	WebDriver driver;
	WebDriver driver1;
	WebinarChatApp webinarchatApp;
	
@BeforeMethod
	
	public void beforemethod() throws Exception {
	
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://video365webinar.azurewebsites.net/");
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	/*Thread.sleep(10000);
	driver1=new ChromeDriver();
	driver1.manage().window().maximize();
	driver1.get("http://video365webinar.azurewebsites.net/");
*/	
	webinarchatApp=PageFactory.initElements(driver, WebinarChatApp.class);

}

@Test

public void WebChatTest() throws Exception {
	
	webinarchatApp.WebChatdetails();
	
}

}
