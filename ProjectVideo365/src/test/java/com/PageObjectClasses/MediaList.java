package com.PageObjectClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Utilities.ReusableActionsClass;

public class MediaList {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH, using="//a[@title='Media']")
	 WebElement media;
	
	@FindBy(how=How.XPATH, using="//a[text()='silk thread.mp4']")
	 WebElement manageMedia;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"MediaItem_Title\"]")
	 WebElement videoTitle;
	
	@FindBy(how=How.XPATH, using="//textarea[@id='MediaItem_ShortDescription']")
	 WebElement shortdescrip;
	
	@FindBy(how=How.XPATH, using="//button[@id='editMediaItemBtn']")
	 WebElement savebasicSettings;
	
	
	@FindBy(how=How.XPATH, using="//a[@href='#customparameters']")
	 WebElement customparameter;
	
	@FindBy(how=How.XPATH, using="//button[@id='addParamField']")
	 WebElement Addcustomparameter;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"customParam[]\"]")
	 WebElement Addcpfield1;
	
	@FindBy(how=How.XPATH, using="//a[@href='#']//ancestor::div[1]")
	 WebElement deletecpfield1;
	
	@FindBy(how=How.XPATH, using="//a[@href='#tags']")
	 WebElement tagtab;
	
	@FindBy(how=How.XPATH, using="//input[@id='currentTag_tag']")
	 WebElement addtag;
	
	@FindBy(how=How.XPATH, using="//a[@title='Removing tag']")
	 WebElement removetag;
	
	@FindBy(how=How.XPATH, using="//a[@href='#basicsettings']")
	 WebElement metadatatab;
	
	@FindBy(how=How.XPATH, using="//a[@href='#home1']")
	 WebElement playersettingstab;
	
	@FindBy(how=How.XPATH, using="//select[@id='PlayerList']")
	 WebElement playerlist;
	
	@FindBy(how=How.XPATH, using="//select[@id='PlayerList']/option[@value='247']")
	 WebElement selectplayerlist;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"playerSettingForm\"]/div/div[1]/div/div[3]/div/div/div[2]/div[4]/a/img")
	 WebElement selectthumbnail;
	
	@FindBy(how=How.XPATH, using="//a[@class='upload-btn']")
	 WebElement uploadthumbnail;
	
	@FindBy(how=How.XPATH, using="//button[text()='Upload']")
	 WebElement uploadthumbnailbtn;
	
	@FindBy(how=How.XPATH, using="//div[@class='bootstrap-dialog-header']//button")
	 WebElement closethumbnailbtn;
	
	@FindBy(how=How.XPATH, using="//div[contains(@class,'radio')]/label//following::input[@id='autoPlay']")
	 WebElement uncheckAutoplay;

	
	@FindBy(how=How.XPATH, using="//button[@id='updatePlayerBtn']")
	 WebElement savePlayersettings;
	
	@FindBy(how=How.XPATH, using="//a[@href='#sharing1']")
	 WebElement Adsettingstab;
	
	@FindBy(how=How.XPATH, using="//select[@id='MediaItem_AdType']")
	 WebElement Adlist;
	
	@FindBy(how=How.XPATH, using="//select[@id='MediaItem_AdType']//following::div[@id='adsPre']")
	 WebElement AdtypePre;
	
	@FindBy(how=How.XPATH, using="//input[@id='preadsUrl']")
	 WebElement adUrl;
	
	@FindBy(how=How.XPATH, using="//div[contains(@class,'form-group')]//input[@id='preSkipAds']//ancestor::div[1]//span//small")
	 WebElement skipbutton;
	
	@FindBy(how=How.XPATH, using="//input[@id='preAdsOffset']")
	 WebElement adskiptime;
	
	@FindBy(how=How.XPATH, using="//button[@id='updateAdSettingsBtn']//ancestor::div[1]")
	 WebElement saveadSettings;
	
	@FindBy(how=How.XPATH, using="//li[@class='active']//following::a[@href='#DRM']")
	 WebElement drmtab;
	
	@FindBy(how=How.XPATH, using="//div[contains(@class,'has-switch')]//input[@id='MediaItem_EnableDrm']//ancestor::div[1]//span//small")
	 WebElement drmbutton;
	
	@FindBy(how=How.XPATH, using="//button[@id='enableContentProtectionBtn']")
	 WebElement savedrm;
	
	@FindBy(how=How.XPATH, using="//button[@id='embedcodebtn']")
	 WebElement embedcode;
	
	@FindBy(how=How.XPATH, using="//div[contains(@class,'close-button')]//button[@class='close']")
	 WebElement closembedcode;
	
	@FindBy(how=How.XPATH, using="//div[@id='playerDropDown']//select[@id='PlayerListEmbedCode']//following::option[@value='223']")
	 WebElement embedcodeSelectplayr;
	
	@FindBy(how=How.XPATH, using="//a[@href='https://qavideo365storage.blob.core.windows.net/embedvideo/a3e6f7c2-159d3648.html']//ancestor::div[2]//i")
	 WebElement embedpreviewpage;
	
	@FindBy(how=How.XPATH, using="//button[contains(@class,'vjs-big-play-button ')]")
	 WebElement previewPlaybtn;
	
	@FindBy(how=How.XPATH, using="//button[@type='button']//following::i[@class='icon-ban']")
	 WebElement unpublish;
	
	@FindBy(how=How.XPATH, using="//button[text()='Unpublish']")
	 WebElement unpublishbtn;

	@FindBy(how=How.XPATH, using="//button[@id='publishButton']//span[text()='Publish this Video']")
	 WebElement publishvideo;
	
	@FindBy(how=How.XPATH, using="//button[text()='Publish']")
	 WebElement publishbtn;
	
	@FindBy(how=How.XPATH, using="//a[text()='CANCEL']")
	 WebElement backtomedia;
	
	@FindBy(how=How.XPATH, using="//a[@href='/Dashboard/Reports']//i[contains(@class,'icon-fontsize')]")
	 WebElement dashboardtab;

		
public MediaList(WebDriver driver) {
		this.driver=driver;
		
	}

public void media1() {
	ReusableActionsClass.waitforElementToBeLocated(driver, media);
	media.click();
}

public void ManageMedia() {
	ReusableActionsClass.waitforElementToBeLocated(driver, manageMedia);
	manageMedia.click();
}

public void ManageMediaTitle() {
	ReusableActionsClass.waitforElementToBeLocated(driver, videoTitle);
	videoTitle.click();
	videoTitle.clear();
	videoTitle.sendKeys("Player18.mp4");
}	


public void ShortDescription() {
	ReusableActionsClass.waitforElementToBeLocated(driver, shortdescrip);
	shortdescrip.click();
	shortdescrip.sendKeys("This is a demo video");
}

public void SaveBasicSettings() {
	ReusableActionsClass.waitforElementToBeLocated(driver, savebasicSettings);
	savebasicSettings.click();
}

public void customParameterTab() {
	ReusableActionsClass.waitforElementToBeLocated(driver, customparameter);
	customparameter.click();
}

public void AddCustomParameter() {
	ReusableActionsClass.waitforElementToBeLocated(driver, Addcustomparameter);
	Addcustomparameter.click();
}

public void AddCustomParameterField1() {
	ReusableActionsClass.waitforElementToBeLocated(driver, Addcpfield1);
	//Addcpfield1.click();
	Addcpfield1.sendKeys("test");
}

public void DeleteCustomParameter() {
	ReusableActionsClass.waitforElementToBeLocated(driver, deletecpfield1);
	deletecpfield1.click();
}

public void tagsTab() {
	ReusableActionsClass.waitforElementToBeLocated(driver, tagtab);
	tagtab.click();
}

public void AddTags() throws InterruptedException {
	ReusableActionsClass.waitforElementToBeLocated(driver, addtag);
	addtag.sendKeys("google");
	
		
}

public void RemoveTags() {
	ReusableActionsClass.waitforElementToBeLocated(driver, removetag);
	removetag.click();
		
}


public void Metadatatab() {
	ReusableActionsClass.waitforElementToBeLocated(driver, metadatatab);
	metadatatab.click();
}

public void Playersettingstab() {
	ReusableActionsClass.waitforElementToBeLocated(driver, playersettingstab);
	playersettingstab.click();
}

public void Playerselect() {
	ReusableActionsClass.waitforElementToBeLocated(driver, playerlist);
	playerlist.click();
}

public void Playerselectzoom() {
	ReusableActionsClass.waitforElementToBeLocated(driver, selectplayerlist);
	selectplayerlist.click();
}

public void selectThumbnail() {
	ReusableActionsClass.waitforElementToBeLocated(driver, selectthumbnail);
	selectthumbnail.click();
}

public void uploadThumbnail() {
	ReusableActionsClass.waitforElementToBeLocated(driver, uploadthumbnail);
	uploadthumbnail.click();
}

public void uploadThumbnailBtn() {
	ReusableActionsClass.waitforElementToBeLocated(driver, uploadthumbnailbtn);
	uploadthumbnailbtn.click();
}

public void CloseThumbnailBtn() {
	ReusableActionsClass.waitforElementToBeLocated(driver, closethumbnailbtn);
	closethumbnailbtn.click();
}


public void savePlayerSettings() {
	ReusableActionsClass.waitforElementToBeLocated(driver, savePlayersettings);
	savePlayersettings.click();
}


public void Uncheckautoplay() {
	ReusableActionsClass.waitforElementToBeLocated(driver, uncheckAutoplay);
	uncheckAutoplay.click();
}

public void AdSettingsTab() {
	ReusableActionsClass.waitforElementToBeLocated(driver, Adsettingstab);
	Adsettingstab.click();
}

public void selectAdtype() {
	ReusableActionsClass.waitforElementToBeLocated(driver, Adlist);
	Adlist.click();
}


public void PreAdtype() {
	ReusableActionsClass.waitforElementToBeLocated(driver, AdtypePre);
	AdtypePre.click();
}

public void AdUrl() {
	ReusableActionsClass.waitforElementToBeLocated(driver, adUrl);
	adUrl.sendKeys("https://sr-test.azurewebsites.net/Plugins/AMP2/Preroll_amp/vast_test.xml");
}

	public void InvalidAdUrl() {
		ReusableActionsClass.waitforElementToBeLocated(driver, adUrl);
		adUrl.clear();
		adUrl.sendKeys("shdncduffnc");
		System.out.println("Enter Valid Url");
	}

public void SkipAd() {
	ReusableActionsClass.waitforElementToBeLocated(driver, skipbutton);
	ReusableActionsClass.clickByJS(driver, skipbutton);
}

public void AddSkipTime() {
	ReusableActionsClass.waitforElementToBeLocated(driver, adskiptime);
	adskiptime.sendKeys("3");
}

	public void InvalidSkipTime() {
		ReusableActionsClass.waitforElementToBeLocated(driver, adskiptime);
		adskiptime.clear();
		adskiptime.sendKeys("rff");
		System.out.println("Enter Digits Only");
	}

public void SaveAdSettings() {
	ReusableActionsClass.waitforElementToBeLocated(driver, saveadSettings);
	saveadSettings.click();
	
}

public void DRMtab() {
	ReusableActionsClass.waitforElementToBeLocated(driver, drmtab);
	drmtab.click();
	
}

public void DRMenable() {
	ReusableActionsClass.waitforElementToBeLocated(driver, drmbutton);
	ReusableActionsClass.clickByJS(driver, drmbutton);
}

public void saveDRM() {
	ReusableActionsClass.waitforElementToBeLocated(driver, savedrm);
	savedrm.click();
	
}

public void EmbedCode() {
	ReusableActionsClass.waitforElementToBeLocated(driver, embedcode);
	embedcode.click();	
}

public void EmbedCodeSelectPlayer() {
	ReusableActionsClass.waitforElementToBeLocated(driver, embedcodeSelectplayr);
	embedcodeSelectplayr.click();
	
}

public void ClosEmbedCode() {
	ReusableActionsClass.waitforElementToBeLocated(driver, closembedcode);
	closembedcode.click();
	
}

public void EmbedPreviewpage() {
	ReusableActionsClass.waitforElementToBeLocated(driver,embedpreviewpage);
	embedpreviewpage.click();	
}

public void PreviewPlayBtn() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,previewPlaybtn);
	previewPlaybtn.click();
	
	 //ReusableActionsClass.waitforElementToBeLocated(driver, previewPlaybtn);
 	//ReusableActionsClass.clickByJS(driver, previewPlaybtn);
	
}

public void Unpublishvideo() {
	ReusableActionsClass.waitforElementToBeLocated(driver,unpublish);
	unpublish.click();	
}

public void Unpublishvideobtn() {
	ReusableActionsClass.waitforElementToBeLocated(driver,unpublishbtn);
	unpublishbtn.click();	
}

public void Publishvideo() {
	ReusableActionsClass.waitforElementToBeLocated(driver,publishvideo);
	publishvideo.click();	
}

public void Publishvideobtn() {
	ReusableActionsClass.waitforElementToBeLocated(driver,publishbtn);
	publishbtn.click();	
}

public void Backtomedia() {
	ReusableActionsClass.waitforElementToBeLocated(driver,backtomedia);
	backtomedia.click();	
}

public void RemoveTitle() {
	ReusableActionsClass.waitforElementToBeLocated(driver, videoTitle);
	videoTitle.click();
	videoTitle.clear();
	videoTitle.sendKeys("");
	System.out.println("Title Field is Required field");
}
public void Dashboardtab() {
	ReusableActionsClass.waitforElementToBeLocated(driver, dashboardtab);
	dashboardtab.click();
}

public void Scrolldown() {
	
	((JavascriptExecutor)driver).executeScript("scroll(0,500)");
}

public void mediaDetails()throws Exception {
						/*		//Negative Cases
								media1();
								ManageMedia();
								RemoveTitle() ;
								Thread.sleep(2000);
								SaveBasicSettings();
								Thread.sleep(2000);
								SaveBasicSettings();
								
								Playersettingstab();
								Playerselect();
								Playerselectzoom();
								Thread.sleep(2000);
								Playerselect();
								uploadThumbnail();
								uploadThumbnailBtn();
								CloseThumbnailBtn();
								Thread.sleep(2000);
								AdSettingsTab();
								selectAdtype();
								Thread.sleep(2000);
								PreAdtype();
								InvalidAdUrl();
								InvalidSkipTime();
								Thread.sleep(2000);
								SaveAdSettings();
								Thread.sleep(2000);  */
								
	media1();
	ManageMedia();						
	//ManageMediaTitle();
	ShortDescription();
	Thread.sleep(2000);
	customParameterTab();
	//AddCustomParameter();
	//AddCustomParameterField1();
	//DeleteCustomParameter();
	tagsTab();
	AddTags();
	tagsTab();
	RemoveTags();
	Thread.sleep(2000);
	Metadatatab();
	Thread.sleep(2000);   
	SaveBasicSettings();
	
	Playersettingstab();
	Playerselect();
	Playerselectzoom();
	Thread.sleep(2000);
	
	Playerselect();
	            uploadThumbnail();
	           // uploadThumbnailBtn();
	            CloseThumbnailBtn();  
	//selectThumbnail();
	Scrolldown();
	Uncheckautoplay();
    Thread.sleep(2000);
	savePlayerSettings();   

	
	 
	
	Thread.sleep(2000);  
	DRMtab();
	DRMenable();
	 Thread.sleep(2000);
	saveDRM();
	 Thread.sleep(2000);     
	 
	 AdSettingsTab();
		selectAdtype();
		 Thread.sleep(2000);
		PreAdtype();
		AdUrl();
		SkipAd();
		AddSkipTime();
		//Thread.sleep(2000);
		SaveAdSettings();
/*
	 EmbedCode();
	 Thread.sleep(2000);
	 //EmbedCodeSelectPlayer();
	 
     // EmbedPreviewpage();
	 //Thread.sleep(5000);
	 //PreviewPlayBtn();
	 ClosEmbedCode();
	 Unpublishvideo();
	 Unpublishvideobtn();
	// Publishvideo();
	// Publishvideobtn();
	 Thread.sleep(3000);
	// Backtomedia();   
	 Dashboardtab();  */
	 
	 
	 
}

}

