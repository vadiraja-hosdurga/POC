package com.poc.pageinitializer;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;

import com.poc.PageObjects.*;
import com.poc.maincontroller.*;

public class PageInitializer extends MainController {

	public LoginPageObjects loginPage() {
        return PageFactory.initElements(getDriver(), LoginPageObjects.class);

    }
}
