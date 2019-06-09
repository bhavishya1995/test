package com.PageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.Utilities.ReusableActionsClass;

public class PlayerList {
	
	WebDriver driver;
	
	//SoftAssert softAssert = new SoftAssert();
	
	@FindBy(how=How.XPATH, using="//a[@title='Players']")
	 WebElement player;
	
	@FindBy(how=How.XPATH, using="//a[@href='/Player/Create']")
	WebElement createNew;
	
	@FindBy(how=How.XPATH, using="//input[@id='name']")
	WebElement playerName;
	
	@FindBy(how=How.XPATH, using="//input[@id='width']")
	WebElement playerWidth;
	
	@FindBy(how=How.XPATH, using="//input[@id='height']")
	WebElement playerHeight;
	
	@FindBy(how=How.XPATH, using="//div[contains(@class,' switches-holder')]//input[@id='autoPlay']//ancestor::div[1]//span//small")
	WebElement autoplay;
	
	@FindBy(how=How.XPATH, using="//div[contains(@class,' switches-holder')]//input[@id='mute']//ancestor::div[1]//span//small")
	WebElement mute;
	
	@FindBy(how=How.XPATH, using="//div[contains(@class,' switches-holder')]//input[@id='responsive']//ancestor::div[1]//span//small")
	WebElement responsive;
	
	@FindBy(how=How.XPATH, using="//div[contains(@class,' switches-holder')]//input[@id='zoom']//ancestor::div[1]//span//small")
	WebElement zoom;
	
	@FindBy(how=How.XPATH, using="//div[contains(@class,' switches-holder')]//input[@id='playbackSpeed']//ancestor::div[1]//span//small")
	WebElement playback;
	
	@FindBy(how=How.XPATH, using="//a[@href='#profile1']")
	WebElement display;
	
	@FindBy(how=How.XPATH, using="//input[@id='titleOverlay']")
	WebElement titleOverlay;
		
	@FindBy(how=How.XPATH, using="//a[@href='#']")
	WebElement logo;
	
	@FindBy(how=How.XPATH, using="//input[@id='logoUpload']")
	WebElement chooseFile;
	
	@FindBy(how=How.XPATH, using="//buttton[@id='selectLogo']")
	WebElement searchLogo;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"customLogoModal\"]/div/div/div[2]/div/div/div[10]/a/img")
	WebElement logoSearch;
	
	@FindBy(how=How.XPATH, using="//select[@id='logoPosition']/option//following::option[4]")
	WebElement logoposition;
	
	@FindBy(how=How.XPATH, using="//div[@id='profile1']//input[@id='hideLogo']//ancestor::div[1]//span//small")
	WebElement showlogo;
	

	@FindBy(how=How.XPATH, using="//button[text()='Upload']")
	WebElement upload;
	
	@FindBy(how=How.XPATH, using="//div[@class='bootstrap-dialog-header']//button")
	WebElement closex;
	
	@FindBy(how=How.XPATH, using="//a[@href='#sharing1']")
	WebElement share;
	
	@FindBy(how=How.XPATH, using="//div[contains(@class,'switches-holder')]//input[@id='share']//ancestor::div[1]//span//small")
	WebElement socialshare;
	
	@FindBy(how=How.XPATH, using="//button[@id='playerSettingsChange']")
	WebElement saveplayer;
	
	@FindBy(how=How.XPATH, using="//tr[@id='no-result']/td//following::input[1]")
	WebElement selectplayer;

	@FindBy(how=How.XPATH, using="//button[@id='editPlayer']")
	WebElement editplayer;
	
	@FindBy(how=How.XPATH, using="//input[@id='Name']")
	WebElement addplayerName;
	
	@FindBy(how=How.XPATH, using="//div[contains(@class,'switches-holder')]//input[@id='Responsive']//ancestor::div[1]//span//small")
	WebElement Responsive;
	
	@FindBy(how=How.XPATH, using="//div[contains(@class,' switches-holder')]//input[@id='Zoom']//ancestor::div[1]//span//small")
	WebElement Zoom;
	
	@FindBy(how=How.XPATH, using="//input[@id='TitleOverlay']")
	WebElement edittitle;
	
	@FindBy(how=How.XPATH, using="//select[@id='logoPosition']/option//following::option[text()='Top,Center']")
	WebElement EditlogoPosition;
	
    @FindBy(how=How.XPATH, using="//div[@id='profile1']//input[@id='ShowLogo']//ancestor::div[1]//span//small")
	WebElement hidelogo;
	
	@FindBy(how=How.XPATH, using="//div[contains(@class,' switches-holder')]//input[@id='ShareIt']//ancestor::div[1]//span//small")
	WebElement socialshareit;
	
	@FindBy(how=How.XPATH, using="//button[@id='playerSettingsChange']")
	WebElement updateplayer;
	
	@FindBy(how=How.XPATH, using="//button[@id='deletePlayer']")
	WebElement deleteplayer;
	
	@FindBy(how=How.XPATH, using="//button[text()='Delete']")
	WebElement deletePlayer;
	
	
	public PlayerList(WebDriver driver) {
		
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
	
	public void player_name() {
		ReusableActionsClass.waitforElementToBeLocated(driver, playerName);
      playerName.sendKeys("new_Player");
      
	
	}

	public void player_width() {
		ReusableActionsClass.waitforElementToBeLocated(driver, playerWidth);
	      playerWidth.clear();
	      playerWidth.sendKeys("720");
		  
		}
	
	public void player_height() {
		ReusableActionsClass.waitforElementToBeLocated(driver, playerHeight);
	      playerHeight.clear();
	      playerHeight.sendKeys("600");
		
		}
	
    public void Autoplay() {
    	ReusableActionsClass.waitforElementToBeLocated(driver, autoplay);
    	//autoplay.click();
    	
    	ReusableActionsClass.clickByJS(driver, autoplay);
    	
    	
    }	
    
    public void Mute() {
    	
    	ReusableActionsClass.waitforElementToBeLocated(driver, mute);
    	ReusableActionsClass.clickByJS(driver, mute);
    	
    	
    }	
	
    public void Responsive() {
    	ReusableActionsClass.waitforElementToBeLocated(driver, responsive);	
    	ReusableActionsClass.clickByJS(driver, responsive);
 	
    }	
    
    public void Zoom() {
	 	
    	ReusableActionsClass.waitforElementToBeLocated(driver, zoom);
	 	ReusableActionsClass.clickByJS(driver, zoom);
	 	 	
	 }	
 
    public void playbackSpeed() {
	 	
    	ReusableActionsClass.waitforElementToBeLocated(driver, playback);
	 	ReusableActionsClass.clickByJS(driver, playback);
	 	
    }
 
    public void displayTab() {
	 	
    	ReusableActionsClass.waitforElementToBeLocated(driver, display);
	 	//ReusableActionsClass.clickByJS(driver, display);
	 	display.click();
	}
 
    public void title_overlay() {
	 	
    	ReusableActionsClass.waitforElementToBeLocated(driver, titleOverlay);	
    	titleOverlay.sendKeys("Monocept");
	 
    }
    
  
 
    public void Logo() {
	 	
	 ReusableActionsClass.waitforElementToBeLocated(driver, logo);	
	 logo.click();
    }
 
	 public void choosefile() {
	 ReusableActionsClass.waitforElementToBeLocated(driver, chooseFile);
	 //chooseFile.click();
	 
	 chooseFile.sendKeys("F:\\Video365AzureDevops\\ProjectVideo365\\logo.jpg");
	 

	 
	 }
	 
	 public void uploadLogo() {
		 
		
	 ReusableActionsClass.waitforElementToBeLocated(driver, upload);
	 upload.click();
	 
	 }
 
	 public void Close() {
		 	
		 ReusableActionsClass.waitforElementToBeLocated(driver, closex);	
		 closex.click();
	 }
	 
	 public void SearchLogo() {
		 
		 
		 ReusableActionsClass.waitforElementToBeLocated(driver, searchLogo);	
         searchLogo.click();
		 
	 }
	 
	
	  public void Logo_search() {
		 
		 ReusableActionsClass.waitforElementToBeLocated(driver, logoSearch);
		 logoSearch.click();
	 }
	 
	  public void logoPosition() {
			
			 ReusableActionsClass.waitforElementToBeLocated(driver, logoposition);
			 logoposition.click();
		 }
	 
	 public void showLogo() {
	    	
		    ReusableActionsClass.waitforElementToBeLocated(driver, showlogo);
	    	ReusableActionsClass.clickByJS(driver, showlogo);
	    	//Assert.assertTrue(showlogo.isDisplayed());
	    	//System.out.println("Logo is displaying");
	 }
	 
	
	 public void shareOption() {
		 
		 ReusableActionsClass.waitforElementToBeLocated(driver, share);
		 share.click();
	 }
	 
      public void socialShare() {
		 
		 ReusableActionsClass.waitforElementToBeLocated(driver, socialshare);
		 socialshare.click();
	 }
	 
      public void savePlayer() {
	 
	     ReusableActionsClass.waitforElementToBeLocated(driver, saveplayer);
	     saveplayer.click();
     }
 
      public void SelectPlayer() {
	 
	      ReusableActionsClass.waitforElementToBeLocated(driver, selectplayer);
	      selectplayer.click();
      }
 
      public void EditPlayer() {
	 
	      ReusableActionsClass.waitforElementToBeLocated(driver, editplayer);
	      editplayer.click();
      }

       public void addPlayername() {
	       ReusableActionsClass.waitforElementToBeLocated(driver, addplayerName);
	       addplayerName.clear();
	       addplayerName.sendKeys("Player123");
      }

       public void editResponsive() {
	    
    	   ReusableActionsClass.waitforElementToBeLocated(driver, Responsive);
	       ReusableActionsClass.clickByJS(driver, Responsive);
	
       }	

       public void editZoom() {
	      
    	   ReusableActionsClass.waitforElementToBeLocated(driver, Zoom);
	       ReusableActionsClass.clickByJS(driver, Zoom);
	
       }

        public void DisplayTab() {
 	
	       ReusableActionsClass.waitforElementToBeLocated(driver, display);
	 	   //ReusableActionsClass.clickByJS(driver, display);
	 	   display.click();
       }


         public void EditTitleoverlay() {
	 	
	        ReusableActionsClass.waitforElementToBeLocated(driver, edittitle);
	        edittitle.clear();
	        edittitle.sendKeys("Video365");
       }

         public void EditLogoPosition() {
	 
	        ReusableActionsClass.waitforElementToBeLocated(driver, EditlogoPosition);
	        EditlogoPosition.click();
	 
        }

         public void hideLogo() {
	
        	 ReusableActionsClass.waitforElementToBeLocated(driver, hidelogo);
        	 ReusableActionsClass.clickByJS(driver, hidelogo);
         }


         public void socialShareIt() {
	 
        	 ReusableActionsClass.waitforElementToBeLocated(driver, socialshareit);
        	 socialshareit.click();
         }

         public void Updateplayer() {
	 
        	 ReusableActionsClass.waitforElementToBeLocated(driver, updateplayer);
        	 updateplayer.click();
         }

         public void deletePlayer() {
	 
        	 ReusableActionsClass.waitforElementToBeLocated(driver, deleteplayer);
        	 deleteplayer.click();
         }

         public void ConfirmDeletePlayer() {
	 
        	 ReusableActionsClass.waitforElementToBeLocated(driver, deletePlayer);
        	 deletePlayer.click();
         }


	 
 public void setDetails() throws Exception{
        	 player1();
       	 create_new();
        
        player_name();
        player_width();
        player_height();
        Autoplay();
        Mute();
        Responsive();
        Zoom();
        playbackSpeed();
          Thread.sleep(2000);
        displayTab();
        title_overlay(); 									
   /* 	 Logo();
        choosefile();
        uploadLogo();
        Close();
        Thread.sleep(2000); 
       	SearchLogo();
  		Logo_search();
       	Thread.sleep(2000);
       	logoPosition();
        Thread.sleep(2000);
       	showLogo();
       */
       shareOption();
       socialShare();
       Thread.sleep(2000);
       savePlayer();
         Thread.sleep(2000);   
      
       
       SelectPlayer();
         Thread.sleep(2000);
       
     
       EditPlayer();
         Thread.sleep(2000);
       editZoom();
       Thread.sleep(2000);
       editResponsive();
       
       
       DisplayTab();
       EditTitleoverlay();
         Thread.sleep(2000);
       EditLogoPosition();
       hideLogo();
         Thread.sleep(2000);
      
       shareOption();
       socialShareIt(); 
       Updateplayer();
       
       SelectPlayer();
       deletePlayer();
       ConfirmDeletePlayer();
         Thread.sleep(3000);       
       
    }
 
}