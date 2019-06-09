package com.TestClasses;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PageObjectClasses.CollectionsPage;
import com.PageObjectClasses.LiveStream;
import com.PageObjectClasses.LoginNegativeCase;
import com.PageObjectClasses.LoginPage;
import com.PageObjectClasses.MediaList;
import com.PageObjectClasses.PlayList;
import com.PageObjectClasses.PlayerList;
import com.PageObjectClasses.PlayerNegativeCase;
import com.PageObjectClasses.Series;
import com.PageObjectClasses.Settings;
import com.PageObjectClasses.UploadVideos;
import com.PageObjectClasses.UserRoles;
import com.PageObjectClasses.Users;
import com.Utilities.ReusableActionsClass;


public class Video365MainClass {
	WebDriver driver;
	File folder;
	
	LoginPage loginpage;
	PlayerList playerListpage;
	MediaList  mediaListpage;
	PlayList playlistpage;
	CollectionsPage collectionpage;
	Series seriespage;
	LoginNegativeCase loginNgTcase;
	PlayerNegativeCase playerNgcase;
	UploadVideos uploadvideos;
	Users user;
	UserRoles userRoles;
	Settings settings;
	LiveStream livestream;
	
@BeforeMethod

public void beforeMethod() {
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://monocept.video365.com");
	
	
	loginpage=PageFactory.initElements(driver, LoginPage.class);
	playerListpage=PageFactory.initElements(driver, PlayerList.class);
	mediaListpage=PageFactory.initElements(driver, MediaList.class);
	playlistpage=PageFactory.initElements(driver, PlayList.class);
	collectionpage=PageFactory.initElements(driver, CollectionsPage.class);
	seriespage=PageFactory.initElements(driver,Series.class);
	loginNgTcase=PageFactory.initElements(driver, LoginNegativeCase.class);
	playerNgcase=PageFactory.initElements(driver, PlayerNegativeCase.class);
	uploadvideos=PageFactory.initElements(driver, UploadVideos.class);
	user=PageFactory.initElements(driver,Users.class);
	userRoles=PageFactory.initElements(driver,UserRoles.class);
	settings=PageFactory.initElements(driver, Settings.class);
	livestream=PageFactory.initElements(driver,LiveStream.class);
	
}


@Test


public void function1() throws Exception {
	
/*	loginpage.LoginDetails();
 	settings.SettingsDetails();
 	user.UsersDetails();
	Thread.sleep(10000);
	loginpage.logout();
	userRoles.UsersRolesDetails();
	playerListpage.setDetails();	
	mediaListpage.mediaDetails();
	Thread.sleep(4000);
	playerListpage.setDetails(); 
	Thread.sleep(2000);
	playlistpage.playListDetails();
	Thread.sleep(2000);
	collectionpage.CollectionsDetails(); 
	Thread.sleep(2000);
	seriespage.SeriesDetails();   
	
	Thread.sleep(2000);
	loginpage.logout(); 	*/
try {
	
	 loginpage.LoginDetails();
	 Thread.sleep(2000);
	 playlistpage.playListDetails(); 
     playerListpage.setDetails();  
     Thread.sleep(2000);
     loginpage.logout();
	 

     /*uploadvideos.UploadSectionDetails();
	 Thread.sleep(3000);
	 ReusableActionsClass.screenShot("Pass", driver);
	 mediaListpage.mediaDetails();	
	  Thread.sleep(2000); 
	
	 seriespage.SeriesDetails(); 
	 collectionpage.CollectionsDetails(); 
	
	 settings.SettingsDetails();
	 Thread.sleep(2000);
	 user.UsersDetails();
	 
	 livestream.LiveStreamDetail();
	 ReusableActionsClass.screenShot("Pass", driver); 
	 Thread.sleep(7000);
   
    ReusableActionsClass.screenShot("Pass", driver);
	
	Thread.sleep(2000);
	ReusableActionsClass.screenShot("Pass", driver);  
	//loginNgTcase.LoginNegativeTCDetails();
	//playerNgcase.playerNgDetails(); 
*/	}
 
	catch(Exception e) {
	Thread.sleep(3000);
	ReusableActionsClass.screenShot("fail", driver); 
	} 

                                                                           
}



@AfterTest
public void afterTest() {
	driver.quit();
}

}      
