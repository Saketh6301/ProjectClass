package com.logicinvoic.pompages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.logicinvoice.generics.Utility;

public class CustomersPage extends Utility
{
@FindBy(xpath="//i[contains(@class,'plus')]")
WebElement addBtn;

@FindBy(id="input-firstname")
WebElement firstName;

@FindBy(id="input-lastname")
WebElement lastName;

@FindBy(id="input-company")
WebElement companyName;

@FindBy(id="input-website")
WebElement websiteName;

@FindBy(id="input-email")
WebElement emailName;

@FindBy(id="input-password")
WebElement password;

@FindBy(id="input-confirm")
WebElement confirmpassword;

@FindBy(id="input-status")
WebElement statusLB;

@FindBy(xpath="//i[contains(@class,'save')]")
WebElement saveBtn;

@FindBy(xpath="//input[@type='checkbox']")
WebElement checkBox;

@FindBy(xpath="//i[contains(@class,'trash')]")
WebElement deleteBtn;



public CustomersPage(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}

public void addCustomer()
{
	addBtn.click();
}

public void setFirstName(String fn) 
{
	firstName.sendKeys(fn);
}

public void setLastName(String ln) 
{
	lastName.sendKeys(ln);
}

public void setCompanyName(String cn) 
{
	companyName.sendKeys(cn);
}
public void setWebsiteName(String wn) 
{
	websiteName.sendKeys(wn);
}
public void setEmailName(String en) 
{
	emailName.sendKeys(en);
}
public void setPassword(String pwd) 
{
	password.sendKeys(pwd);
}

public void setConfirmPassword(String cpwd) 
{
	confirmpassword.sendKeys(cpwd);
}

public void setCustomerStatus(String status)
{
	selectByVisisbleText(statusLB, status);
}

public void saveCustomer()
{
	saveBtn.click();
}

public void clickCheckbox()
{
	checkBox.click();
}

public void deleteCustomer()
{
	deleteBtn.click();
}

}

