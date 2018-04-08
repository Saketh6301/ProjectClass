package com.logicinvoice.testscripts;

import org.testng.annotations.Test;

import com.logicinvoic.pompages.AdministrationLoginPage;
import com.logicinvoic.pompages.CustomersPage;
import com.logicinvoic.pompages.DashboardPage;
import com.logicinvoice.generics.BaseTest;
import com.logicinvoice.generics.Utility;

public class testLogin extends BaseTest
{

@Test(priority=1)
public void validLogin() throws InterruptedException
{
	/*AdministrationLoginPage alp = new AdministrationLoginPage(driver);
	String un = Utility.getCellValue("ValidLogin", 1, 0);
	alp.setUserName(un);
	String pw = Utility.getCellValue("ValidLogin", 1, 1);
	alp.setPassword(pw);
	alp.clickLogin();*/
	
	DashboardPage dp = new DashboardPage(driver);
	dp.verifyHomePageIsDisplayed(driver);
	/*dp.mousehover(driver);
	dp.customerClick();
	*/
	/*CustomersPage cp = new CustomersPage(driver);
	
	
	int rc = Utility.getRowCount("CustomerList");
	for(int i=1;i<=rc;i++)
	{
		cp.addCustomer();
		String fn = Utility.getCellValue("CustomerList", i, 0);
		cp.setFirstName(fn);
		String ln = Utility.getCellValue("CustomerList", i, 1);
		cp.setLastName(ln);
		String cn = Utility.getCellValue("CustomerList", i, 2);
		cp.setCompanyName(cn);
		String wn = Utility.getCellValue("CustomerList", i, 3);
		cp.setWebsiteName(wn);
		String en = Utility.getCellValue("CustomerList", i, 4);
		cp.setEmailName(en);
		String pwd = Utility.getCellValue("CustomerList", i, 5);
		cp.setPassword(pwd);
		String cpwd = Utility.getCellValue("CustomerList", i, 6);
		cp.setConfirmPassword(cpwd);
		String status = Utility.getCellValue("CustomerList", i, 7);
		cp.setCustomerStatus(status);
		cp.saveCustomer();
	}
	
	cp.clickCheckbox();
	cp.deleteCustomer();
	driver.switchTo().alert().accept();*/
	
//		dp.clickLogout();
}
}
