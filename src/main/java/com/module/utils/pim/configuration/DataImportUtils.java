package com.module.utils.pim.configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.company.base.BaseClass;
import com.company.genaricutils.ReuseLocators;
import com.company.utils.SeleniumCore;
import com.company.utils.SeleniumUtils;
import com.company.utils.WaitTime;

public class DataImportUtils extends BaseClass {
	
	public SeleniumCore seleniumCore;
	public SeleniumUtils seleniumUtils;
	public WaitTime waitTime;
	
	public DataImportUtils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtils=PageFactory.initElements(driver, SeleniumUtils.class);
		waitTime=PageFactory.initElements(driver, WaitTime.class);
	}
	
	public void clickOnCustomFields() {
		seleniumCore.clickOnSubMenu(driver.findElement(By.xpath(ReuseLocators.menu("Configuration"))),driver.findElement(By.xpath(ReuseLocators.menuLink("Data Import"))));
	}
}
