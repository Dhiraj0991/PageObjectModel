package com.pujaSeleniumLearning.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pujaSeleniumLearning.pages.GooglePage;
import com.pujaSeleniumLearning.testBase.BaseClass;

public class GoogleTest extends BaseClass
{

	GooglePage google;
	
	
	@BeforeClass
	public void intialization()
	{
		google=new GooglePage();
	}
	
	
	@Test(priority =1)
	public void search21() throws Exception
	{

		google.enterText("Selenium");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//span"));

		System.out.println("total number of suggestions in search box:::===>" + list.size());

		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().contains("selenium tutorial"))
			{
				Thread.sleep(2000);
				list.get(i).click();
				break;
			}

		}

	}
	
	@Test(priority=2)
	public void search2() throws Exception
	{

		driver.navigate().back();
		google.enterText("Java");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//span"));

		System.out.println("total number of suggestions in search box:::===>" + list.size());

		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().contains("selenium tutorial"))
			{
				Thread.sleep(2000);
				list.get(i).click();
				break;
			}

		}

	}
	
	
	

}
