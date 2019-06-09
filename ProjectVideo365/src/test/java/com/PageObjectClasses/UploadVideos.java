package com.PageObjectClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Utilities.ReusableActionsClass;

public class UploadVideos {
	WebDriver driver;
	
	@FindBy(how=How.XPATH, using="//a[@href='/Media/BulkUpload']")
	WebElement upload;
	
	@FindBy(how=How.XPATH, using="//div[@class='select-and-upload-area cn']//following::div[contains(@class,'btn btn-redsubmit')]")
	WebElement uploadvideo;
	
	@FindBy(how=How.XPATH, using="//button[@id='showUploadStatusButton']")
	WebElement showstatusbtn;
	
	@FindBy(how=How.XPATH, using="//button[@class='close']")
	WebElement closestatusbtn;
	
	@FindBy(how=How.XPATH, using="//a[@href='/Media/UploadedFileStatus'][text()=' Track Uploaded File Status ']")
	WebElement trackupload;
	
	@FindBy(how=How.XPATH, using="//a[@href='/Videos/VideoProcessorDetails?videoQueueId=133']")
	WebElement trackuploadinfo;
	
	@FindBy(how=How.XPATH, using="//button[text()='Close']")
	WebElement unsupportedformatclosebtn;
	
	public UploadVideos(WebDriver driver) {
		
		this.driver=driver;
	}
	
public void Upload() {
		
		ReusableActionsClass.waitforElementToBeLocated(driver, upload);
		upload.click();
			
	}
	
	public void SelectFile() throws Exception {
		
		ReusableActionsClass.waitforElementToBeLocated(driver, uploadvideo);
		uploadvideo.click();
		Thread.sleep(4000);
		
		Runtime.getRuntime().exec("D:\\AutoITfiles\\AutoItScript.exe");    //Uploading  file(.mp4)
		//Runtime.getRuntime().exec("C:\\Users\\spriya\\Desktop\\AutoItScript2.exe");	 //Uploading  file(.avi)
		//Runtime.getRuntime().exec("C:\\Users\\spriya\\Desktop\\AutoItScriptSC3.exe");  //Uploading  file with special characters
		//Runtime.getRuntime().exec("C:\\Users\\spriya\\Desktop\\AutoItScript4.exe");	 //Uploading  file with wrong Extention
		//Runtime.getRuntime().exec("C:\\Users\\spriya\\Desktop\\AutoItScript5.exe");    //Uploading  existing file with different name
		//Runtime.getRuntime().exec("C:\\Users\\spriya\\Desktop\\AutoItScript6.exe");      //Uploading  file with large size
		
		//System.out.println("FileName having Special Characters can't be upload");
	}
	
	public void ShowStatusBtn() {
		
		ReusableActionsClass.waitforElementToBeLocated(driver, showstatusbtn);
		showstatusbtn.click();
			
	}

	public void CloseStatusBtn() {
		
		ReusableActionsClass.waitforElementToBeLocated(driver, closestatusbtn);
		closestatusbtn.click();
			
	}
	
public void TrackUploadStatus() {
		
		ReusableActionsClass.waitforElementToBeLocated(driver, trackupload);
		trackupload.click();
			
	}

public void TrackUploadInfo() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver, trackuploadinfo);
	trackuploadinfo.click();
		
}

public void CloseUnsupportedFormatab() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver, unsupportedformatclosebtn);
	unsupportedformatclosebtn.click();
		
}
	
	public void UploadSectionDetails() throws Exception {
		Upload();
		SelectFile();
		Thread.sleep(5000);
		//CloseUnsupportedFormatab();
		ShowStatusBtn();
		Thread.sleep(16000);
		
		CloseStatusBtn(); 
		//Thread.sleep(3000);
		TrackUploadStatus();
		//TrackUploadInfo();
		//Thread.sleep(3000);
		//TrackUploadStatus();
		Thread.sleep(3000);
		Upload();
		Thread.sleep(3000);
		
		
		
	}

}
