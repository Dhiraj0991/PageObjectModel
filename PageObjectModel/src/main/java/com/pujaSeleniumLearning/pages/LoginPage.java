package com.pujaSeleniumLearning.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pujaSeleniumLearning.testBase.BaseClass;

public class LoginPage extends BaseClass
{
	@FindBy(xpath = "//span[contains(.,'Account & Lists')]")
	WebElement loginButton;
	
	@FindBy(xpath = "//input[@id='ap_email']")
	WebElement emailId;
	
	@FindBy(xpath = "//input[@id='continue']")
	WebElement continueButton;
	
	@FindBy(xpath = "//a[@id='createAccountSubmit']")
	WebElement createAccountButton;
	
	@FindBy(xpath = "//input[@id='ap_customer_name']")
	WebElement yourName;
	
	@FindBy(xpath = "//input[@id='ap_password']")
	WebElement passward;
	
	@FindBy(xpath = "//input[@id='ap_phone_number']")
	WebElement phoneNumber;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickSignInButton()
	{
		loginButton.click();
		
	}
	
	public void enterEmailId(String text)
	{
		emailId.sendKeys(text);
	}
	
	public void clickContinueButton()
	{
		continueButton.click();
		
	}

	
	public void enteremailId(String text)
	{
		emailId.sendKeys(text);
	}
	
	public void clickCreateAccountButton()
	{
		createAccountButton.click();
		
	}
	
	public void enterYourName(String text)
	{
		yourName.sendKeys(text);
	}
	
	public void enterPassword(String text)
	{
		passward.sendKeys(text);
	}
	
	public void enterPhoneNumber(String text)
	{
		phoneNumber.sendKeys(text);
	}
}
