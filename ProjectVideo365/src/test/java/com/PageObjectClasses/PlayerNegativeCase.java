package com.PageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Utilities.ReusableActionsClass;

public class PlayerNegativeCase {
	WebDriver driver;
	
	@FindBy(how=How.XPATH, using="//a[@title='Players']")
	 WebElement player;
	
	@FindBy(how=How.XPATH, using="//a[@href='/Player/Create']")
	WebElement createNew;
	
	@FindBy(how=How.XPATH, using="//input[@id='name']")
	WebElement playerName;
	
	@FindBy(how=How.XPATH, using="//a[@href='#profile1']")
	WebElement display;
	
	@FindBy(how=How.XPATH, using="//input[@id='logoUrl']")
	WebElement logourl;
	
	@FindBy(how=How.XPATH, using="//a[@href='#']")
	WebElement logo;
	
	@FindBy(how=How.XPATH, using="//button[text()='Upload']")
	WebElement upload;
	
	@FindBy(how=How.XPATH, using="//div[@class='bootstrap-dialog-header']//button")
	WebElement closex;
	
	@FindBy(how=How.XPATH, using="//button[@id='playerSettingsChange']")
	WebElement saveplayer;
	
	@FindBy(how=How.XPATH, using="//tr[@id='no-result']/td//following::input[1]")
	WebElement selectplayer;

	@FindBy(how=How.XPATH, using="//button[@id='editPlayer']")
	WebElement editplayer;
	
	@FindBy(how=How.XPATH, using="//input[@id='Name']")
	WebElement addplayerName;
	
	@FindBy(how=How.XPATH, using="//button[@id='playerSettingsChange']")
	WebElement updateplayer;
	
	@FindBy(how=How.XPATH, using="//button[@id='deletePlayer']")
	WebElement deleteplayer;


	public PlayerNegativeCase(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void player1() {
		ReusableActionsClass.waitforElementToBeLocated(driver, player);
		player.click();
	}

	public void create_new() {
		ReusableActionsClass.waitforElementToBeLocated(driver, createNew);
		createNew.click();
		
	}
	
	public void Removeplayer_name() {
		ReusableActionsClass.waitforElementToBeLocated(driver, playerName);
		playerName.sendKeys("");
		System.out.println("PlayerName field is required Field");
	      
		
	}
	
	public void player_nameLength() {
		ReusableActionsClass.waitforElementToBeLocated(driver, playerName);
		playerName.sendKeys("as");
		System.out.println("PlayerName Should be 3-40 Length");
	      
		
	}

	public void player_nameType() {
		ReusableActionsClass.waitforElementToBeLocated(driver, playerName);
		playerName.sendKeys("@");
		System.out.println("PlayerName can be only alphanumeric");
	      
		
	}
	
	  public void displayTab() {
		 	
	    	ReusableActionsClass.waitforElementToBeLocated(driver, display);
		 	display.click();
		}
	  
	  public void AddLogoUrl() {
		 	
		   	 ReusableActionsClass.waitforElementToBeLocated(driver, logourl);	
		   	 logourl.sendKeys("dfdccdc");
		   	 
		   	 System.out.println("Enter Valid URL");
		       }
	  
	  public void Logo() {
		 	
			 ReusableActionsClass.waitforElementToBeLocated(driver, logo);	
			 logo.click();
		    }
	
	  public void uploadLogo() {
			 
			
			 ReusableActionsClass.waitforElementToBeLocated(driver, upload);
			 upload.click();
			 
			 }
		 
			 public void Close() {
				 	
				 ReusableActionsClass.waitforElementToBeLocated(driver, closex);	
				 closex.click();
			 }
			 
			 public void savePlayer() {
				 
			     ReusableActionsClass.waitforElementToBeLocated(driver, saveplayer);
			     saveplayer.click();
		     }
			 
		      public void SelectPlayer() {
		    		 
			      ReusableActionsClass.waitforElementToBeLocated(driver, selectplayer);
			      selectplayer.click();
			      
			      System.out.println("Select the player to edit");
		      }
		 
		      public void EditPlayer() {
			 
			      ReusableActionsClass.waitforElementToBeLocated(driver, editplayer);
			      editplayer.click();
		      }
		      
		      public void addPlayernameRemove() {
			       ReusableActionsClass.waitforElementToBeLocated(driver, addplayerName);
			       addplayerName.clear();
			       addplayerName.sendKeys("");
			       
			       System.out.println("Player_name field is required field");
		}
		      
		      public void Updateplayer() {
		        	 
		    	  	ReusableActionsClass.waitforElementToBeLocated(driver, updateplayer);
		    	  	updateplayer.click();
		         }
		      
		      public void DisplayTab() {
		    	 	
			       ReusableActionsClass.waitforElementToBeLocated(driver, display);
			 	   display.click();
		       }

		      public void deletePlayer() {
		    		 
		        	 ReusableActionsClass.waitforElementToBeLocated(driver, deleteplayer);
		        	 deleteplayer.click();
		           System.out.println("Select Player to delete");
		         }

			 public void playerNgDetails() throws Exception {
				 
				 player1();
				 create_new();
				 Removeplayer_name();
				 //player_nameLength();
				// player_nameType();
				 displayTab();
				 AddLogoUrl();
				 Thread.sleep(2000);
				 Logo();
				 uploadLogo();
				 Thread.sleep(2000);
				 Close();
				 Thread.sleep(2000);
				 //savePlayer();
				 Thread.sleep(2000);
				 
				 player1();
				 EditPlayer();
				 Thread.sleep(2000);
				 SelectPlayer();
				 EditPlayer();
				 Thread.sleep(2000);
				 addPlayernameRemove();
				 Updateplayer();
				 DisplayTab();
				 Thread.sleep(2000);
				 AddLogoUrl();
				 Logo();
				 uploadLogo();
				 Thread.sleep(2000);
				 Close();
				 Thread.sleep(2000);
				 
				 player1();
				 deletePlayer();
				 
				 
			 }
}

