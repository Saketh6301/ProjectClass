package com.logicinvoice.generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility implements IAutoConst
{
	public static Workbook wb;
public static String getCellValue(String sheet,int row,int col)
{
	String cellvalue = " ";
	try {
		wb = WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
		cellvalue = wb.getSheet(sheet).getRow(row).getCell(col).toString();
	} catch (Exception e) 
	{
	}
	return cellvalue;
}

public static int getRowCount(String sheet)
{
	int rowcount = 0;
	try {
		wb = WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
		rowcount = wb.getSheet(sheet).getLastRowNum();
		
	} catch (Exception e) {
	}
	return rowcount;
}

public static String getPropertyValue(String propertyName)
{
	String propertyValue= " ";
	Properties p = new Properties();
	try {
		p.load(new FileInputStream(CONFIG_PATH));
		propertyValue = p.getProperty(propertyName);
	} catch (IOException e) {
	}
	return propertyValue;
}

public static void mouseHover(WebDriver driver, WebElement element)
{
	
	Actions action = new Actions(driver);
	action.moveToElement(element).perform();
}

public static void selectByVisisbleText(WebElement element,String status)
{
	Select s = new Select(element);
	s.selectByVisibleText(status);
}
}
