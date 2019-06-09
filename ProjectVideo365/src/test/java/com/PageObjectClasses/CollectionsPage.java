package com.PageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Utilities.ReusableActionsClass;

public class CollectionsPage {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH, using="//a[@title='Content Organization']")
	WebElement collection;
	
	@FindBy(how=How.XPATH, using="//a[@href='/Collections/Create']")
	WebElement createCollection;
	
	@FindBy(how=How.XPATH, using="//input[@id='collectionName']")
	WebElement collectionName;
	
	@FindBy(how=How.XPATH, using="//input[@id='currentTag_tag']")
	WebElement collectionCategory;

	@FindBy(how=How.XPATH, using="//textarea[@id='collectionDescription']")
	WebElement collectionDescription;
	
	@FindBy(how=How.XPATH, using="//a[@href='#add-trailer']")
	WebElement addTrailertab;
	
	@FindBy(how=How.XPATH, using="//div[@id='add-trailer']//div[@id='forSearch'][1]//button")
	WebElement addTrailer;
	
	@FindBy(how=How.XPATH, using="//a[@href='#add-video']")
	WebElement addVideotab;
	
	@FindBy(how=How.XPATH, using="//div[@id='add-video']//div[@id='forSearch'][1]//button")
	WebElement addVideo;
	
	@FindBy(how=How.XPATH, using="//input[@id='searchSelectedVid']")
	WebElement searchVideo;
	
	@FindBy(how=How.XPATH, using="//button[@id='createCollectionBtn']")
	WebElement createColltnbtn;
	
	@FindBy(how=How.XPATH, using="//a[@href='/Collections/Index'][text()='CANCEL']")
	WebElement cancelColltnbtn;
	
	@FindBy(how=How.XPATH, using="//tr[@id='no-result']/td//following::input[1]")
	WebElement selectCollection;
	
	@FindBy(how=How.XPATH, using="//button[@id='manageCollection']")
	WebElement editCollection;
	
	@FindBy(how=How.XPATH, using="//input[@id='collectionName']")
	WebElement editCollectionName;
	
	@FindBy(how=How.XPATH, using="//div[@id='add-video']//button[@class='video-remove']")
	WebElement removeVideo;
	
	@FindBy(how=How.XPATH, using="//button[@id='editCollectionBtn']")
	WebElement updateColltnbtn;
	
	@FindBy(how=How.XPATH, using="//button[@id='deleteCollection']")
	WebElement deleteColltnbtn;
	
	@FindBy(how=How.XPATH, using="//button[text()='Delete']")
	WebElement deleteCollection;
	
	@FindBy(how=How.XPATH, using="//input[@id='searchCollectionTbl']")
	WebElement searchCollection;
	
	
	public  CollectionsPage(WebDriver driver){
		
		this.driver=driver;
		
	}


public void Collection() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver, collection);
	collection.click();	
	
}

public void CreateCollection() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,createCollection);
	createCollection.click();
}

public void CollectionName() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver, collectionName);
	collectionName.sendKeys("New_Collection");
	
}

	//negative case
	public void BlankCollectionName() {
	
		ReusableActionsClass.waitforElementToBeLocated(driver, collectionName);
		collectionName.sendKeys("");
	
	}
	public void AlphanumCollectionName() {
		
		ReusableActionsClass.waitforElementToBeLocated(driver, collectionName);
		collectionName.sendKeys("@@@@");
	
	}
	public void CollectionNameLength() {
		
		ReusableActionsClass.waitforElementToBeLocated(driver, collectionName);
		collectionName.clear();
		collectionName.sendKeys("sd");
	
	}
	public void CancelCollectionBtn() {
		
		ReusableActionsClass.waitforElementToBeLocated(driver, cancelColltnbtn);
		cancelColltnbtn.click();
	
	}
	
public void CollectionCategory() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver, collectionCategory);
	collectionCategory.sendKeys("Cartoon");
	
}

public void CollectionDescription() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver, collectionDescription);
	collectionDescription.sendKeys("Its a collection of cartoons");
	
}

public void AddCollectionTrailerTab() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,addTrailertab);
	addTrailertab.click();
}

public void AddCollectionTrailer() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,addTrailer);
	addTrailer.click();
}

public void AddCollectionVideoTab() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,addVideotab);
	addVideotab.click();
}

public void AddCollectionVideo() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,addVideo);
	addVideo.click();
}

public void SearchCollectionVideo() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,searchVideo);
	searchVideo.sendKeys("Tom");
	searchVideo.clear();
	
}

public void CreateCollectionBtn() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,createColltnbtn);
	createColltnbtn.click();
}

public void SelectCollection() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,selectCollection);
	selectCollection.click();
}

public void EditCollection() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,editCollection);
	editCollection.click();
}

public void EditCollectionName() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,editCollectionName);
	editCollectionName.clear();
	editCollectionName.sendKeys("V365_Collection");
}

	public void BlankEdtColltnName() {
	
		ReusableActionsClass.waitforElementToBeLocated(driver,editCollectionName);
		editCollectionName.clear();
		editCollectionName.sendKeys("");
		System.out.println("This field can't be blank");
	}
	public void AlphanumEdtColltnName() {
		
		ReusableActionsClass.waitforElementToBeLocated(driver,editCollectionName);
		editCollectionName.clear();
		editCollectionName.sendKeys("@@@");
		System.out.println("Only alphanumeric characters are allowed");
	}
	public void EdtColltnNameLength() {
		
		ReusableActionsClass.waitforElementToBeLocated(driver,editCollectionName);
		editCollectionName.clear();
		editCollectionName.sendKeys("cs");
		System.out.println("There should be atleast 3 character");
	}

public void RemoveCollectionVideo() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,removeVideo);
	removeVideo.click();
}

public void UpdateCollectionBtn() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,updateColltnbtn);
	updateColltnbtn.click();
}

public void DeleteCollectionBtn() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,deleteColltnbtn);
	deleteColltnbtn.click();
}

public void DeleteCollection() {
	
	ReusableActionsClass.waitforElementToBeLocated(driver,deleteCollection);
	deleteCollection.click();
}

	public void SearchCollection() {
	
		ReusableActionsClass.waitforElementToBeLocated(driver,searchCollection);
		searchCollection.sendKeys("//");
		System.out.println("No result found while searching for Collection");
		
	}


public void CollectionsDetails() throws Exception {
	
								/*
											Collection();
											Thread.sleep(2000);
											CreateCollection();
											BlankCollectionName();
											CreateCollectionBtn(); 
											Thread.sleep(2000);
											AlphanumCollectionName();
											CreateCollectionBtn(); 
											 Thread.sleep(2000);
											CollectionNameLength();
											CreateCollectionBtn(); 
											AddCollectionVideoTab();
											AddCollectionVideo();
											CreateCollectionBtn();
											Thread.sleep(2000);
											CancelCollectionBtn();
	
											EditCollection();
											Thread.sleep(2000);
											SelectCollection();
											EditCollection();
											BlankEdtColltnName();
											UpdateCollectionBtn();
											Thread.sleep(2000);
											AlphanumEdtColltnName();
											UpdateCollectionBtn();
											Thread.sleep(2000);
											EdtColltnNameLength();
											UpdateCollectionBtn();
											Thread.sleep(2000);
											AddCollectionVideoTab();
											RemoveCollectionVideo();
											Thread.sleep(2000);
											UpdateCollectionBtn();
											Collection();
											 DeleteCollectionBtn();
											 Thread.sleep(2000);
											 SearchCollection();     
											*/
	
	Collection();
	 Thread.sleep(2000);
     CreateCollection();
	CollectionName();
	//CollectionCategory();
	CollectionDescription();
	AddCollectionTrailerTab();
	Thread.sleep(2000);
	AddCollectionTrailer();
	AddCollectionTrailer();
	AddCollectionVideoTab();
	AddCollectionVideo();
	AddCollectionVideo();
	AddCollectionVideo();
	Thread.sleep(2000);
	SearchCollectionVideo();
	CreateCollectionBtn();  
	  Thread.sleep(2000);
	
	  
	  SelectCollection();
	EditCollection();
	EditCollectionName();
	AddCollectionTrailerTab();
	Thread.sleep(2000);
	AddCollectionTrailer();
	AddCollectionVideoTab();
	RemoveCollectionVideo();
	Thread.sleep(2000);
	AddCollectionVideo();
	  Thread.sleep(2000);
    UpdateCollectionBtn();
    SelectCollection();
    DeleteCollectionBtn();
    DeleteCollection();
      Thread.sleep(2000);   
}


}
