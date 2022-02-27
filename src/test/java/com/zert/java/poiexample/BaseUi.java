package com.zert.java.poiexample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseUi {
	
	String baseUrl = "https://petstore.octoperf.com/"; 
	WebDriver driver; 

	
	public void initialize() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(); 
		 driver.get("chrome://settings/clearBrowserData");
		 driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
		 
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5)); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	
	}
	

}
