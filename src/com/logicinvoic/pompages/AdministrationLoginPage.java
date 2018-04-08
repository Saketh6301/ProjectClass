package com.logicinvoic.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdministrationLoginPage 
{

	//DECLARE THE ELEMENTS
	@FindBy(id="input-username")
	private WebElement unTB;
	
	@FindBy(id="input-password")
	private WebElement pwTB;
	
	@FindBy(xpath="//button[.='Login']")
	private WebElement loginBTN;
	
	//INITIALIZE THE ELEMENTS
	public AdministrationLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//UTILIZE THE ELEMENTS
	public void setUserName(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void setPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void clickLogin()
	{
		loginBTN.click();
	}
	
	
}
