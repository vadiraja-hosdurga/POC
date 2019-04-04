package com.poc.modules;

import org.testng.annotations.Test;

import com.poc.pageinitializer.PageInitializer;

public class LoginPage extends PageInitializer {
 
  @Test
  public void login() {
	  loginPage().enterUserName("mighdoge+nzowner@gmail.com")
	  .enterPassword("1234")
	  .clickOnLoginButton();
  }
  
}
