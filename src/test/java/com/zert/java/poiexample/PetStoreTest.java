package com.zert.java.poiexample;

import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PetStoreTest extends BaseUi {
	
	
	@BeforeMethod
	public void beforeEachTestCase() {
		initialize(); 
	}

    @Test
	public void LoginTest() throws InterruptedException {
	WebElement webElement = driver.findElement(By.xpath("//a[contains(text(),'Enter the Store')]")); 
	webElement.click(); 
	Assert.assertNotNull(webElement); 
 	webElement = driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")); 
	webElement.click(); 
	webElement = driver.findElement(By.xpath("//input[@name='username']")); 
	webElement.clear();
	webElement.sendKeys("mam123"); 
 	webElement = driver.findElement(By.xpath("//input[@name='password']")); 
 	webElement.clear();
	webElement.sendKeys("Java*09876"); 
	webElement = driver.findElement(By.xpath("//input[@name='signon']")); 
	webElement.click(); 
	webElement = driver.findElement(By.id("WelcomeContent"));
	Assert.assertNotNull(webElement); 																																																																											
	String actual = webElement.getText();
	boolean isMessageExists = actual.contains("Welcome"); 
	Assert.assertTrue(isMessageExists); 
	}
	
    @Test
	public void Registration() {
    	WebElement webElement = driver.findElement(By.xpath("//a[contains (text(),'Enter the Store')]")); 
    	webElement.click(); 
    	webElement = driver.findElement(By.xpath("//a[contains (text(),'Sign In')]")); 
    	webElement.click(); 
	}
    
  
    
    @AfterMethod
	public void afterEachTestCase() {
		//driver.quit();
	}

}
