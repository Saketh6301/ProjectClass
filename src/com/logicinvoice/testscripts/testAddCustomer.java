package com.logicinvoice.testscripts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.logicinvoic.pompages.CustomersPage;
import com.logicinvoic.pompages.DashboardPage;
import com.logicinvoice.generics.BaseTest;
import com.logicinvoice.generics.Utility;


public class testAddCustomer extends BaseTest 
{

	Logger log = LogManager.getLogger(testAddCustomer.class.getName());
	@Test(priority=2)
	public void addCustomers() {
		CustomersPage cp = new CustomersPage(driver);
		
		DashboardPage dp = new DashboardPage(driver);
		dp.mousehover(driver);
		dp.customerClick();
		
		
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
		driver.switchTo().alert().accept();		
		
		
	}

}


