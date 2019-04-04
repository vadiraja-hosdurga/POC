package com.poc.maincontroller;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MainController {
	public static ChromeDriver driver;
	
  @BeforeClass
  public void init() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://app.mighway.com/signin");
	  driver.manage().window().maximize();
  }

  
  public WebDriver getDriver() {
	  return this.driver;
  }
  @AfterClass
  public void close() {
	  driver.quit();
  }
  
  
}
