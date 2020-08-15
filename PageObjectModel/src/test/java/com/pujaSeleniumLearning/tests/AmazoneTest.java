package com.pujaSeleniumLearning.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.pujaSeleniumLearning.pages.LoginPage;
import com.pujaSeleniumLearning.testBase.BaseClass;

public class AmazoneTest extends BaseClass
{
LoginPage login;
	
	
	@BeforeClass
	public void intialization()
	{
		login=new LoginPage();
	}
	
	
	@Test(priority =1)
	public void amazonLogin() throws Exception
	{
		login.clickSignInButton();
		login.clickCreateAccountButton();
		login.enterYourName("Puja");
		login.enterPhoneNumber("6294065132");
		login.enterPassword("@Abcd1234");
		
		//login.enterEmailId("seleniumlearningpuja123@gmail.com");
		
		login.clickContinueButton();
		login.enterPassword("@Abcd1234");
		Thread.sleep(50000);
		
		login.clickContinueButton();
		Thread.sleep(120000);
		login.clickCreateAccountButton();
	}

		
}
