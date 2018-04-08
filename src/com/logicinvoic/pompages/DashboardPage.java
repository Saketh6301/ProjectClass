package com.logicinvoic.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.logicinvoice.generics.Utility;



public class DashboardPage extends Utility 
{
	//DECLARE THE ELEMENTS
	@FindBy(xpath="//a[.='admin']")
	WebElement loggedInUser;
	
	@FindBy(xpath="//a[.=' Logout']")
	WebElement Logout;
	
	@FindBy(xpath="//i[contains(@class,'usd')]")
	WebElement dollarMenu;
	
	@FindBy(xpath="//span[.='Customers']")
	WebElement customersmenu;
	
	@FindBy(xpath="//span[.='Invoices']")
	WebElement invoicesmenu;

	//INITIALIZE THE ELEMENTS
	public DashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//UTILIZE THE ELEMENTS
		
	public void customerClick()
	{
		customersmenu.click();
	}
	
	public void invoicesClick()
	{
		invoicesmenu.click();
	}
	
	public void clickLogout()
	{
		loggedInUser.click();
		Logout.click();
	}
	
	public void mousehover(WebDriver driver)
	{
		mouseHover(driver, dollarMenu);
	}
	public void verifyHomePageIsDisplayed(WebDriver driver)
	{
		String actTitle = driver.getTitle();
		String eTitle = "Dashboard";
		
		if(actTitle.equals(eTitle))
		{
			System.out.println("Home Page is Displayed");
		}
		
		else
		{
			System.out.println("Home Page is Not Displayed");
		}
		
	}
}

