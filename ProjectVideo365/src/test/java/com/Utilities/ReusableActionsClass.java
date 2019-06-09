package com.Utilities;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableActionsClass {
	


	 WebDriver driver;
	
	public static WebElement waitforElementToBeLocated(WebDriver driver, WebElement e1){
		WebDriverWait wait=new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.elementToBeClickable(e1));
		return e1;
	}
	
	public static WebElement waitforElementToBeVisbile(WebDriver driver, WebElement e1) {
		WebDriverWait wait=new WebDriverWait(driver, 5000);
		wait.until(ExpectedConditions.visibilityOf(e1));
		return e1;
	}
	
	public static void clickByJS(WebDriver driver, WebElement e1) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
    	executor.executeScript("arguments[0].click();", e1);
	}

public static void screenShot(String str, WebDriver driver) throws Exception{
	SimpleDateFormat df=new SimpleDateFormat("dd_MM_yyyy hh_mm_ss a");
	Date d=new Date();
	String time=df.format(d);
	
	System.out.println("Time: " + time);
	
	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(f,new File(".\\ScreenshotsFolder\\"+str+" "+time+".png"));
	
}



}