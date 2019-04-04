package com.poc.maincontroller;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MainController {
	public static WebDriver driver;
	
  @BeforeClass
  public void init() throws MalformedURLException {
	  DesiredCapabilities caps = new DesiredCapabilities();
	  caps.setBrowserName("chrome");
	   driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),caps);
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
