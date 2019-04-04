package com.poc.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import framework.utils.Waiting;
import com.poc.pageinitializer.PageInitializer;

public class LoginPageObjects extends PageInitializer {
  
	Waiting wait = new Waiting(getDriver());
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement userNameField;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordField;
	
	@FindBy(xpath="//div[span='Login']")
	private WebElement loginButton;
	
	public LoginPageObjects enterUserName(String userName) {
		wait.explicitWaitVisibilityOfElement(userNameField, 10);
		userNameField.sendKeys(userName);
		return this;
	}
	
	public LoginPageObjects enterPassword(String password) {
		wait.explicitWaitVisibilityOfElement(passwordField, 10);
		passwordField.sendKeys(password);
		return this;
	}
	
	public void clickOnLoginButton() {
		wait.explicitWaitElementToBeClickable(loginButton, 10);
		loginButton.click();
	}
}
