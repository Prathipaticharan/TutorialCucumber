package com.ecom.automation.Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Register {

	WebDriver driver;
	@Test	
	public void excuteTest(){
	
       System.setProperty("webdriver.gecko.driver", "C://Users//Charan//Downloads//geckodriver-v0.14.0-win64//geckodriver.exe");
		driver= new FirefoxDriver();
			
		driver.get("http://www.google.com");	
	}
	
	
	
	
	
	
	
}
