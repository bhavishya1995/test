package com.PageObjectClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Utilities.ReusableActionsClass;

public class PlayList {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH, using="//a[@title='PlayList']")
	 WebElement playlist;
	
	@FindBy(how=How.XPATH, using="//a[@href='/PlayList/Create']")
	 WebElement createplaylist;
	
	@FindBy(how=How.XPATH, using="//input[@id='playListName']")
	 WebElement nameplaylist;
	
	@FindBy(how=How.XPATH, using="//textarea[@id='playListDescription']")
	 WebElement playlistdescriptn;
	
	@FindBy(how=How.XPATH, using="//a[@href='#add-video']")
	 WebElement addvideotab;

	@FindBy(how=How.XPATH, using="//*[@id=\"forSearch\"]/div[1]/button/i")
	 WebElement addvideo;
	
	@FindBy(how=How.XPATH, using="//a[@href='#pl-details']")
	 WebElement playlistdetailtab;
	
	
	@FindBy(how=How.XPATH, using="//button[text()='CREATE']")
	 WebElement createpl;
	
	@FindBy(how=How.XPATH, using="//tr[@id='no-result']/td//following::input[1]")
	WebElement selectplaylist;
	
	@FindBy(how=How.XPATH, using="//button[@id='managePlayList']")
	WebElement editplaylist;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"selectedVideoList\"]/div[1]/button/i")
	WebElement removevideo;
	
	@FindBy(how=How.XPATH, using="//a[@href='#latest-Available-Code']")
	WebElement latestvideotab;

	@FindBy(how=How.XPATH, using="//button[@type='button']")
	WebElement saveplaylist;
	
	@FindBy(how=How.XPATH, using="//input[@id='searchPlayListTbl']")
	WebElement searchvideo;
	
	@FindBy(how=How.XPATH, using="//button[@id='editPlayList']")
	WebElement settingbtn;
	
	@FindBy(how=How.XPATH, using="//select[@id='PlayerList']")
	 WebElement playerlist;
	
	@FindBy(how=How.XPATH, using="//select[@id='PlayerList']/option[@value='247']")
	 WebElement selectplayer;
	
	@FindBy(how=How.XPATH, using="//input[@id='responsive']")
	 WebElement responsivechkbx;
	
	@FindBy(how=How.XPATH, using="//button[@id='updatePlayerBtn']")
	WebElement updateplaylist;
	
	@FindBy(how=How.XPATH, using="//div[contains(@class,'playlistScroll')]//input[@id='cmn-toggle-1']//ancestor::div[1]/label")
	WebElement whtplayingnxt;
	
	@FindBy(how=How.XPATH, using="//button[@id='but']")
	WebElement code;
	
	@FindBy(how=How.XPATH, using="//div[@id='playerDropDown']//select[@id='PlayerListEmbedCode']//following::option[@value='246']")
	WebElement codeplayer;
	
	@FindBy(how=How.XPATH, using="//a[@href='https://qavideo365storage.blob.core.windows.net/embedplaylist/2619a35b-279bdf84.html']")
	WebElement prevwpge;
	
	@FindBy(how=How.XPATH, using="//div[@class='bootstrap-dialog-close-button']//button[@class='close']")
	WebElement closecode;
	
	@FindBy(how=How.XPATH, using="//a[@href='/PlayList/Index']//i[@class='fa fa-times']")
	WebElement bcktoplaylist;
	
	@FindBy(how=How.XPATH, using="//button[@id='deletePlayList']")
	WebElement deleteplaylist;
	
	@FindBy(how=How.XPATH, using="//button[text()='Delete']")
	WebElement deletebtn;
	
	@FindBy(how=How.XPATH, using="//a[text()='CANCEL']")
	WebElement cancelbtn;
	
	
	public PlayList(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void Playlist(){
 
		ReusableActionsClass.waitforElementToBeLocated(driver, playlist);
		playlist.click();
		
	}
	
	public void CreatePlaylist(){
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, createplaylist);
		createplaylist.click();
		
	}
	
	public void NamePlaylist(){
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, nameplaylist);
		nameplaylist.sendKeys("new_Playlist");
		
	}
	
public void EmptyNamePlaylist(){
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, nameplaylist);
		nameplaylist.sendKeys("");
		
		System.out.println("Enter playlistName to create playlist");
}
	
	public void PlaylistDescriptn(){
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, playlistdescriptn);
		playlistdescriptn.sendKeys("All about Videos");
		
	}
	
	public void AddvideoTab(){
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, addvideotab);
		addvideotab.click();
		
	}
	
	public void Addvideos(){
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, addvideo);
		addvideo.click();	
		
	}
	
	public void Scrollup() {
		
		((JavascriptExecutor)driver).executeScript("scroll(0,0)");
	}
	
public void Scrolldown() {
		
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
	}
	
	public void PlaylistDetailTab(){
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, playlistdetailtab);
		playlistdetailtab.click();
		
	}
	
	public void CreatePL(){
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, createpl);
		createpl.click();
		
	}
	
	public void CancelBtn(){
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, cancelbtn);
		cancelbtn.click();
		
	}
	
	
	
	public void SelectPlaylist(){
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, selectplaylist);
		selectplaylist.click();
		
	}
	
	public void EditPlaylist(){
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, editplaylist);
		editplaylist.click();
		
	}
	
	public void EditNamePlaylist(){
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, nameplaylist);
		nameplaylist.clear();
		nameplaylist.sendKeys("Video365_Playlist");
		
	}
	
	public void RemoveNamePlaylist(){
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, nameplaylist);
		nameplaylist.clear();
		nameplaylist.sendKeys("");
		
		System.out.println("Enter playlistName to edit playlist");
}
	
	public void EditVideo(){
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, removevideo);
		removevideo.click();
		
	}
	
	public void LatestVideoTab(){
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, latestvideotab);
		latestvideotab.click();
		
	}
	
	public void SavePlaylist(){
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, saveplaylist);
		saveplaylist.click();
		
	}
	
	public void SearchVideo() throws Exception{
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, searchvideo);
		searchvideo.sendKeys("quibic");
		Thread.sleep(2000);
		searchvideo.clear();
		
	}
	
	public void SettingBtn(){
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, settingbtn);
		settingbtn.click();
		
	}
	
	public void ChangePlayer(){
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, playerlist);
		playerlist.click();
		
	}
	
	public void SelectPlayer(){
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, selectplayer);
		selectplayer.click();
		
	}
	
	public void ResponsiveCheckbx(){
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, responsivechkbx);
		responsivechkbx.click();
		
	}
	
	public void UpdatePlaylist(){
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, updateplaylist);
		updateplaylist.click();

	}
	
	public void WhtplayNxtbtn(){
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, whtplayingnxt);
		whtplayingnxt.click();

	}
	
	public void PlaylistCode(){
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, code);
		code.click();

	}
	
	public void CodePlayer(){
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, codeplayer);
		codeplayer.click();

	}
	
	public void PlaylistPrevwpage(){
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, prevwpge);
		prevwpge.click();

	}
	
	public void CloseTab() {
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"w");
	}
	
	public void CloseEmbedCode(){
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, closecode);
		closecode.click();

	}
	
	public void BacktoPL(){
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, bcktoplaylist);
		bcktoplaylist.click();

	}
	
	public void DeletePL(){
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, deleteplaylist);
		deleteplaylist.click();

	}
	
	public void DeleteBtn(){
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, deletebtn);
		deletebtn.click();

	}
	

	public void SearchPlaylist() throws Exception{
		 
		ReusableActionsClass.waitforElementToBeLocated(driver, searchvideo);
		searchvideo.sendKeys("Priya");
		Thread.sleep(2000);
		searchvideo.clear();
		
	}
	
	public void playListDetails() throws Exception  {
		
								/*						//Negative Cases
										Playlist();	
										Thread.sleep(2000);
										CreatePlaylist();
										EmptyNamePlaylist();	
										 CreatePL();
										 Thread.sleep(2000);
										 AddvideoTab();
										 Thread.sleep(2000);
										 Addvideos();
										 Scrollup();
										 Thread.sleep(2000);
										 PlaylistDetailTab();
										 NamePlaylist();
										 Thread.sleep(2000);
										 CreatePL();
										 Scrollup();
										 CancelBtn();
										 Thread.sleep(2000);
										 EditPlaylist();
										 Thread.sleep(3000);
										 
										 
										 SelectPlaylist();
										 EditPlaylist();
										 RemoveNamePlaylist();
										 Thread.sleep(2000);
										 SavePlaylist();
										 Thread.sleep(2000);
										 EditVideo();
										 EditVideo();
										 Thread.sleep(2000);
										 SavePlaylist();
										 Thread.sleep(2000);
										 Scrollup();
										 CancelBtn();
										 SettingBtn();
										 Thread.sleep(2000);
										 DeletePL();
										 Thread.sleep(2000);
									 */
		 Playlist();	
	     Thread.sleep(2000);
	     CreatePlaylist();
		NamePlaylist();
		PlaylistDescriptn();
		AddvideoTab();
		 Thread.sleep(2000);
		Addvideos();
		Addvideos();
		Addvideos();
		Scrollup();
		  Thread.sleep(2000);
		Scrolldown();
		PlaylistDetailTab();
	    CreatePL();
	      Thread.sleep(2000);
	    SelectPlaylist();
	    EditPlaylist();
	    EditVideo();
	    SearchVideo();
	      Thread.sleep(2000);
	    EditNamePlaylist();
	    LatestVideoTab();
	    Addvideos();
	    Scrollup();
	    PlaylistDetailTab();
	    SavePlaylist();
	      Thread.sleep(2000);   
	      
	    SelectPlaylist();
	    SettingBtn();
	    ChangePlayer();
	  //  SelectPlayer();
	//    ResponsiveCheckbx();
	       Thread.sleep(2000);
	    UpdatePlaylist();
	    WhtplayNxtbtn();
	    Scrolldown();
	       Thread.sleep(2000);
	    PlaylistCode();
	 //   CodePlayer();
	   // PlaylistPrevwpage();
	       Thread.sleep(2000);
	    //CloseTab();
	      // Thread.sleep(2000);
	       CloseEmbedCode();
	       Thread.sleep(2000);
	    BacktoPL();     
	    SelectPlaylist();
	    DeletePL();
	    DeleteBtn();
	       Thread.sleep(2000);
	    SearchPlaylist();
	       Thread.sleep(2000);   
		
	}
	
}
