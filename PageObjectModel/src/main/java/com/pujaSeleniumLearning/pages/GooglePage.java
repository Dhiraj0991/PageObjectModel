package com.pujaSeleniumLearning.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pujaSeleniumLearning.testBase.BaseClass;

public class GooglePage extends BaseClass
{
	@FindBy(xpath = "//input[contains(@name,'q')]")
	WebElement googleSearchBox;

	public GooglePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterText(String text)
	{
		googleSearchBox.sendKeys(text);
		
	}
	
	
	
	
	
	
	
	
}
