package com.logicinvoice.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.logicinvoic.pompages.AdministrationLoginPage;
import com.logicinvoic.pompages.DashboardPage;


public class BaseTest implements IAutoConst
{
	public static WebDriver driver;
static
{
	System.setProperty(GECKO_KEY,GECKO_VALUE);
}

@BeforeMethod(alwaysRun=true)
public void openApp()
{
	
	driver = new FirefoxDriver();
	String url = Utility.getPropertyValue("URL");
	String ito = Utility.getPropertyValue("ITO");
	driver.manage().timeouts().implicitlyWait(Long.parseLong(ito),TimeUnit.SECONDS);
	driver.get(url);
	AdministrationLoginPage alp = new AdministrationLoginPage(driver);
	String un = Utility.getCellValue("ValidLogin", 1, 0);
	alp.setUserName(un);
	String pw = Utility.getCellValue("ValidLogin", 1, 1);
	alp.setPassword(pw);
	alp.clickLogin();
}

/*@AfterMethod(alwaysRun=true)
public void closeApp()
{
	DashboardPage dp = new DashboardPage(driver);
	dp.clickLogout();
	driver.close();
}*/
}
