package com.logicinvoic.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.logicinvoice.generics.Utility;

public class InvoicesPage extends Utility 
{

	//DECLARE THE ELEMENTS
	@FindBy(xpath="//i[contains(@class,'plus')]")
	WebElement addBtn;
	
	@FindBy(id="input-customer")
	WebElement customer;
	
	@FindBy(id="input-firstname")
	WebElement firstName;

	@FindBy(id="input-lastname")
	WebElement lastName;
	
	@FindBy(id="input-company")
	WebElement cmpyName;

	@FindBy(id="input-website")
	WebElement website;
	
	@FindBy(id="input-email")
	WebElement email;

	@FindBy(id="input-status")
	WebElement statusLB;

	@FindBy(id="input-date-due")
	WebElement duedate;
	
	@FindBy(id="button-forward-step-1")
	WebElement nextBtn;

	@FindBy(id="input-payment-firstname")
	WebElement payfirstName;
	
	@FindBy(id="input-payment-lastname")
	WebElement paylastName;
	
	@FindBy(id="input-payment-company")
	WebElement paycompany;
	
	@FindBy(id="input-payment-address-1")
	WebElement payadd1;
	
	@FindBy(id="input-payment-address-2")
	WebElement payadd2;
	
	@FindBy(id="input-payment-city")
	WebElement paycity;
	
	@FindBy(id="input-payment-postcode")
	WebElement paypostcode;
	
	@FindBy(id="input-payment-country")
	WebElement paycountry;
	
	@FindBy(id="input-payment-zone")
	WebElement payzone;
	
	@FindBy(id="button-forward-step-2")
	WebElement nextBtn1;
	
	@FindBy(id="input-payment-code")
	WebElement paymodeLB;
	
	@FindBy(id="input-payment-name")
	WebElement payname;
	
	@FindBy(id="input-payment-description")
	WebElement paydesc;
	
	@FindBy(id="input-currency-code")
	WebElement ccLB;
	
	@FindBy(id="input-currency-value")
	WebElement curval;
	
	@FindBy(id="button-forward-step-3")
	WebElement nextBtn2;
	
	
	
	
	
	
	
	
	
	//INITIALIZE THE ELEMENTS
		public InvoicesPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
				
	//UTILIZE THE ELEMENTS
		public void addInvoice()
		{
			addBtn.click();
		}

		public void setCustomer(String cus) 
		{
			customer.sendKeys(cus);
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
			cmpyName.sendKeys(cn);
		}
		public void setWebsite(String wn) 
		{
			website.sendKeys(wn);
		}
		public void setEmail(String en) 
		{
			email.sendKeys(en);
		}
		
		public void setInvoiceStatus(String status)
		{
			selectByVisisbleText(statusLB, status);
		}
		
		public void setDueDate(String dd)
		{
			duedate.sendKeys(dd);
		}
		
		public void clickNext()
		{
			nextBtn.click();
		}
		
		public void setPayFirstName(String pfn) 
		{
			payfirstName.sendKeys(pfn);
		}
		
		public void setPayLastName(String pln) 
		{
			paylastName.sendKeys(pln);
		}
		
		public void setPayCompany(String pcmpy) 
		{
			paycompany.sendKeys(pcmpy);
		}
		
		public void setPayAddress1(String padd1) 
		{
			payadd1.sendKeys(padd1);
		}
		
		public void setPayAddress2(String padd2) 
		{
			payadd2.sendKeys(padd2);
		}
		
		public void setPayCity(String pcity) 
		{
			paycity.sendKeys(pcity);
		}
		
		public void setPayPostcode(String ppc) 
		{
			paypostcode.sendKeys(ppc);
		}
		
		public void setPayCountry(String pcon) 
		{
			paycountry.sendKeys(pcon);
		}
		
		public void setPayZone(String pzone) 
		{
			payzone.sendKeys(pzone);
		}
		
		public void clickNext1()
		{
			nextBtn1.click();
		}
		
		public void setPaymentMode(String paymode)
		{
			selectByVisisbleText(paymodeLB, paymode);
		}
		
		public void setPaymentName(String name)
		{
			payname.sendKeys(name);
		}
		
		public void setPaymentDescription(String desc)
		{
			paydesc.sendKeys(desc);
		}
		
		public void setCurrency(String curr)
		{
			selectByVisisbleText(ccLB, curr);
		}
		
		public void setCurrencyValue(String cv)
		{
			curval.sendKeys(cv);
		}
		
		public void clickNext2()
		{
			nextBtn2.click();
		}

}
