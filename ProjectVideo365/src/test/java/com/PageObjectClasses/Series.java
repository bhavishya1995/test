package com.PageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Utilities.ReusableActionsClass;

public class Series {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH, using="//a[@title='Content Organization']")
	WebElement contentOraganization;

    @FindBy(how=How.XPATH,using="//a[@href='/Series/Index']")
    WebElement series;
    
    @FindBy(how=How.XPATH,using="//a[@href='/Series/Create']")
    WebElement createseries;
    
    @FindBy(how=How.XPATH,using="//input[@id='seriesName']")
    WebElement seriesname;
    
    @FindBy(how=How.XPATH,using="//input[@id='currentTag_tag']")
    WebElement addCategory;
    
    @FindBy(how=How.XPATH,using="//textarea[@id='seriesDescription']")
    WebElement seriesDescription;
    
    @FindBy(how=How.XPATH,using="//a[@href='#add-video']")
    WebElement seriesTrailertab;
    
    @FindBy(how=How.XPATH,using="//div[@id='add-video']//div[@id='forSearch'][1]//button")
    WebElement seriesTrailer;

    @FindBy(how=How.XPATH,using="//a[@href='#add-seasons']")
    WebElement seriesSeasontab;
    
    @FindBy(how=How.XPATH,using="//button[@id='addSeason']")
    WebElement addseriesSeason;
    
    @FindBy(how=How.XPATH,using="//input[@id='seasonModalTitle']")
    WebElement seasonTitle;
    
    @FindBy(how=How.XPATH,using="//textarea[@id='seasonModalDescription']")
    WebElement seasonDescription;
    
    @FindBy(how=How.XPATH,using="//button[@class='btn btn-primary']")
    WebElement addSeasonbtn;
    
    @FindBy(how=How.XPATH,using="//button[@id='createSeriesBtn']")
    WebElement createSeriesbtn;
    
    @FindBy(how=How.XPATH,using="//td//input[@name='New_Series']//preceding-sibling::input")
    WebElement selectSeries;
    
    @FindBy(how=How.XPATH,using="//button[@id='manageSeries']")
    WebElement editSeries;
    
    @FindBy(how=How.XPATH,using="//a[@title='Removing tag']")
    WebElement removeTag;
    
    @FindBy(how=How.XPATH,using="//a[@href='#latest-Available-Code']")
    WebElement editseriesTrailertab;
    
    @FindBy(how=How.XPATH, using="//div[@class='thumb-customcheckbox']//ancestor::li[@id='0']//button")
	WebElement removeTrailer;
    
    @FindBy(how=How.XPATH,using="//a[@href='#add-seasons']")
    WebElement addSeasonstab;
    
    @FindBy(how=How.XPATH,using="//button[@class='btn btn-sm btn-primary']")
    WebElement manageSeason;
    
    @FindBy(how=How.XPATH,using="//button[text()='Confirm']")
    WebElement info;
    
    @FindBy(how=How.XPATH,using="//a[@href='#Trailer-Videos-Tab']")
    WebElement seasonTrailertab;
    
    @FindBy(how=How.XPATH,using="//input[@id='seasonName']")
    WebElement seasnName;
    
    @FindBy(how=How.XPATH,using="//div[@id='latestVideos']//div[@id='forSearch']//div[1]//button")
    WebElement addseasonTrailer;
    
    @FindBy(how=How.XPATH,using="//a[@href='#Seasons-Videos-Tab']")
    WebElement seasonEpisodestab;
    
    @FindBy(how=How.XPATH,using="//div[contains(@class,'create-new-playlist')]//ancestor::div[@id='Seasons-Videos-Tab']//div[@id='latestVideos']//div[@id='forSearch'][1]/div/span/following-sibling::button")
    WebElement addseasonEpisodes;
    
    @FindBy(how=How.XPATH,using="//div[@class='thumb-customcheckbox']//ancestor::li[@id='1']//button")
    WebElement removeseasonEpisodes;
    
    @FindBy(how=How.XPATH,using="//button[@id='editSeasonBtn']")
    WebElement seasnepisodebtn;
    
    @FindBy(how=How.XPATH,using="//button[@id='editSeriesBtn']")
    WebElement serieseditbtn;
    
    @FindBy(how=How.XPATH,using="//button[@id='deleteSeries']")
    WebElement deleteseries;
    
    @FindBy(how=How.XPATH,using="//button[text()='Delete']")
    WebElement confirmdltseries;
    
    @FindBy(how=How.XPATH,using="//button[text()='Close']")
    WebElement closeSeasnbtn;
    
    @FindBy(how=How.XPATH,using="//a[text()='CANCEL']")
    WebElement cancelSeriesbtn;
    
    @FindBy(how=How.XPATH,using="//tr//input[@value='31']")
    WebElement seriesSelect;

    
    
    
public Series(WebDriver driver) {
	
	this.driver=driver;
	
}

public void ContentOragtab() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver, contentOraganization);
	contentOraganization.click();	
	
}

public void SeriesTab() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,series);
	series.click();
	
}

public void CreateSeries() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,createseries);
	createseries.click();
	
}

public void SeriesName() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver, seriesname);
	seriesname.sendKeys("New_Series");
	
}

//negative case
	public void BlankSeriesName() {

		ReusableActionsClass.waitforElementToBeLocated(driver, seriesname);
		seriesname.sendKeys("");

	}
	public void AlphanumSeriesName() {
	
		ReusableActionsClass.waitforElementToBeLocated(driver, seriesname);
		seriesname.sendKeys("@@@@");

	}
	public void SeriesNameLength() {
	
		ReusableActionsClass.waitforElementToBeLocated(driver, seriesname);
		seriesname.clear();
		seriesname.sendKeys("sd");

	}

public void AddCategory() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,addCategory);
	addCategory.sendKeys("cartoon");
	addCategory.click();
	
}

public void SeriesDescription() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,seriesDescription);
	seriesDescription.sendKeys("Cartoon Series");
	
}

public void SeriesTrailerTab() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,seriesTrailertab);
	seriesTrailertab.click();
	
}

public void SeriesTrailer() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,seriesTrailer);
	seriesTrailer.click();
	
}

public void SeriesSeasonsTab() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,seriesSeasontab);
	seriesSeasontab.click();
}

public void AddSeriesSeasons() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,addseriesSeason);
	addseriesSeason.click();
}

public void SeasonTitle() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver, seasonTitle);
	seasonTitle.sendKeys("Season 1");
	
}

public void SeasonDescription() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,seasonDescription);
	seasonDescription.sendKeys("first season of this series");
	
}

public void AddSeasonBtn() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,addSeasonbtn);
	addSeasonbtn.click();
}

	public void CloseSeasonBtn() {
	
		ReusableActionsClass.waitforElementToBeLocated(driver,closeSeasnbtn);
		closeSeasnbtn.click();
	}
	
	public void CancelSeriesBtn() {
		
		ReusableActionsClass.waitforElementToBeLocated(driver,cancelSeriesbtn);
		cancelSeriesbtn.click();
	}
	
	


public void CreateSeriesBtn() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,createSeriesbtn);
	createSeriesbtn.click();
}

public void SelectSeries() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,selectSeries);
	selectSeries.click();
}

public void EditSeries() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,editSeries);
	editSeries.click();
}

public void EditSeriesName() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver, seriesname);
	seriesname.clear();
	seriesname.sendKeys("V365_Series");
	
}

//negative case
	public void BlnkEdtSeriesName() {

		ReusableActionsClass.waitforElementToBeLocated(driver, seriesname);
		seriesname.clear();
		seriesname.sendKeys("");

	}
	public void AlphanumEdtSName() {
		
		ReusableActionsClass.waitforElementToBeLocated(driver, seriesname);
		seriesname.sendKeys("@@@@");

	}
	public void EdtSNameLength() {
	
		ReusableActionsClass.waitforElementToBeLocated(driver, seriesname);
		seriesname.clear();
		seriesname.sendKeys("sd");

	}
public void CancelCollectionBtn() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver, seriesname);
	seriesname.click();

}

public void RemoveTag() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,removeTag);
	removeTag.click();
}

public void EdtSeriesTrailrTab() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,editseriesTrailertab);
	editseriesTrailertab.click();
}

public void RemoveTrailer() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,removeTrailer);
	removeTrailer.click();
}

public void AddSeasonsTab() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,addSeasonstab);
	addSeasonstab.click();
}

public void ManageSeason(){
	
	ReusableActionsClass.waitforElementToBeLocated(driver,manageSeason);
	manageSeason.click();
	
}

public void Information(){
	
	ReusableActionsClass.waitforElementToBeLocated(driver,info);
	info.click();
	
}

	public void BlankSeasnName(){
	
		ReusableActionsClass.waitforElementToBeLocated(driver,seasnName);
		seasnName.clear();
		seasnName.sendKeys("");
	
	}
	
	public void SeasnName(){
		
		ReusableActionsClass.waitforElementToBeLocated(driver,seasnName);
		seasnName.sendKeys("Season 2");
	
}

public void SeasonTrailerTab(){
	
	ReusableActionsClass.waitforElementToBeLocated(driver,seasonTrailertab);
	seasonTrailertab.click();
	
}

public void AddSeasonTrailer(){
	
	ReusableActionsClass.waitforElementToBeLocated(driver,addseasonTrailer);
	addseasonTrailer.click();
	
}

public void SeasonEpisodesTab(){
	
	ReusableActionsClass.waitforElementToBeLocated(driver,seasonEpisodestab);
	seasonEpisodestab.click();
	
}

public void AddSeasonEpisodes(){
	
	ReusableActionsClass.waitforElementToBeLocated(driver,addseasonEpisodes);
	addseasonEpisodes.click();
	
}

public void RemoveSeasonEpisodes(){
	
	ReusableActionsClass.waitforElementToBeLocated(driver,removeseasonEpisodes);
	removeseasonEpisodes.click();
	
}

public void SaveSeasnEpisode(){
	
	ReusableActionsClass.waitforElementToBeLocated(driver,seasnepisodebtn);
	seasnepisodebtn.click();
	
}

public void EditSeriesbtn(){
	
	ReusableActionsClass.waitforElementToBeLocated(driver,serieseditbtn);
	serieseditbtn.click();
	
}


public void DeleteSeries(){
	
	ReusableActionsClass.waitforElementToBeLocated(driver,deleteseries);
	deleteseries.click();
	
}

public void ConfrmDeleteSeries(){
	
	ReusableActionsClass.waitforElementToBeLocated(driver,confirmdltseries);
	confirmdltseries.click();
	
}

	public void SeriesSelect2(){
	
		ReusableActionsClass.waitforElementToBeLocated(driver,seriesSelect);
		seriesSelect.click();
	
	}

public void SeriesDetails() throws Exception {
							/*
								//Negative Cases
								ContentOragtab();
								SeriesTab();
								CreateSeries();
								BlankSeriesName();
								CreateSeriesBtn();  
								 Thread.sleep(2000);
								AlphanumSeriesName();
								CreateSeriesBtn();  
								 Thread.sleep(2000);
								SeriesNameLength();
								CreateSeriesBtn();  
								 Thread.sleep(2000);
								 SeriesSeasonsTab();
								 AddSeriesSeasons();
								 AddSeasonBtn();
								 CloseSeasonBtn();
								 Thread.sleep(2000);
								 CancelSeriesBtn();
								 Thread.sleep(2000);
								 
								 EditSeries();
								 Thread.sleep(2000);
								 SeriesSelect2();
								 EditSeries();
								 BlnkEdtSeriesName();
								 EditSeriesbtn();  
								 Thread.sleep(2000);
								 AlphanumEdtSName();
								 EditSeriesbtn();  
								 Thread.sleep(2000);
								 EdtSNameLength();
								 EditSeriesbtn();
								 Thread.sleep(2000);
								 AddSeasonsTab();
								 ManageSeason();
								 Information();
								 BlankSeasnName();
								 SaveSeasnEpisode();
								 Thread.sleep(2000); 
								 SeasnName();
								 Thread.sleep(2000); 
								 SeasonEpisodesTab();
								 RemoveSeasonEpisodes();
								 Thread.sleep(2000); 
								 SaveSeasnEpisode();
								 Thread.sleep(2000); 
								 SeriesTab();
								 DeleteSeries();
								 Thread.sleep(2000); 		 */
	
	
	ContentOragtab();
	SeriesTab();
	CreateSeries();
	SeriesName();
	AddCategory();
	SeriesDescription();
	SeriesTrailerTab();
	SeriesTrailer();
	SeriesTrailer();
	 Thread.sleep(2000);
	SeriesSeasonsTab();
	AddSeriesSeasons();
	SeasonTitle();
	SeasonDescription();
	 Thread.sleep(2000);
	AddSeasonBtn();
	 Thread.sleep(2000);
    CreateSeriesBtn();  
     Thread.sleep(2000);
	
     SelectSeries();
    EditSeries();
    EditSeriesName();
    RemoveTag();
    EdtSeriesTrailrTab();
    RemoveTrailer();
    AddSeasonsTab();
    ManageSeason();
    Information();
    SeasonTrailerTab();
    AddSeasonTrailer();
    AddSeasonTrailer();
    SeasonEpisodesTab();
    AddSeasonEpisodes();
    AddSeasonEpisodes();
    SaveSeasnEpisode();
    EditSeriesbtn();
    
    SelectSeries();
    DeleteSeries();
    ConfrmDeleteSeries();
    Thread.sleep(2000);  
    
    
}

}
