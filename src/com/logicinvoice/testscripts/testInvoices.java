package com.logicinvoice.testscripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.logicinvoic.pompages.DashboardPage;
import com.logicinvoic.pompages.InvoicesPage;
import com.logicinvoice.generics.BaseTest;
import com.logicinvoice.generics.Utility;

public class testInvoices extends BaseTest 
{

	
	@Test(priority=3)
	public void addInvoices() throws InterruptedException
	{
		DashboardPage dp = new DashboardPage(driver);
		dp.mousehover(driver);
		dp.invoicesClick();
		
		InvoicesPage ip = new InvoicesPage(driver);
		ip.addInvoice();
		String cus = Utility.getCellValue("Inv-General", 1, 0);
		ip.setCustomer(cus);
		String fn = Utility.getCellValue("Inv-General", 1, 1);
		ip.setFirstName(fn);
		String ln = Utility.getCellValue("Inv-General", 1, 2);
		ip.setLastName(ln);
		String cn = Utility.getCellValue("Inv-General", 1, 3);
		ip.setCompanyName(cn);
		String wn = Utility.getCellValue("Inv-General", 1, 4);
		ip.setWebsite(wn);
		String en = Utility.getCellValue("Inv-General", 1, 5);
		ip.setEmail(en);
		String status = Utility.getCellValue("Inv-General", 1, 6);
		ip.setInvoiceStatus(status);
		String dd = Utility.getCellValue("Inv-General", 1, 7);
		ip.setDueDate(dd);
		ip.clickNext();
 
		Thread.sleep(3000);
		String pfn = Utility.getCellValue("Inv-Payment", 1, 0);
		ip.setPayFirstName(pfn);
		
		String pln = Utility.getCellValue("Inv-Payment", 1, 1);
		ip.setPayLastName(pln);
		
		String pcmpy = Utility.getCellValue("Inv-Payment", 1, 2);
		ip.setPayCompany(pcmpy);
		
		String padd1 = Utility.getCellValue("Inv-Payment", 1, 3);
		ip.setPayAddress1(padd1);
		
		String padd2 = Utility.getCellValue("Inv-Payment", 1, 4);
		ip.setPayAddress2(padd2);
		
		String pcity = Utility.getCellValue("Inv-Payment", 1, 5);
		ip.setPayCity(pcity);
		
		String ppc = Utility.getCellValue("Inv-Payment", 1, 6);
		ip.setPayPostcode(ppc);
		
		String pcon = Utility.getCellValue("Inv-Payment", 1, 7);
		ip.setPayCountry(pcon);
		
		String pzone = Utility.getCellValue("Inv-Payment", 1, 8);
		ip.setPayZone(pzone);
		
		ip.clickNext1();
		
		Thread.sleep(3000);
		String paymode = Utility.getCellValue("Inv-PaymentMethod", 1, 0);
		ip.setPaymentMode(paymode);
		
		String payname = Utility.getCellValue("Inv-PaymentMethod", 1, 1);
		ip.setPaymentName(payname);
	
		String desc = Utility.getCellValue("Inv-PaymentMethod", 1, 2);
		ip.setPaymentDescription(desc);
		
		String curr = Utility.getCellValue("Inv-PaymentMethod", 1, 3);
		ip.setCurrency(curr);
		
		String cv = Utility.getCellValue("Inv-PaymentMethod", 1, 4);
		ip.setCurrencyValue(cv);
		
		ip.clickNext2();
	}
}
