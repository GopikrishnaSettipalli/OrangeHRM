package com.module.utils.pim.configuration;

import org.openqa.selenium.By;

import com.company.base.BaseClass;
import com.company.genaricutils.ReuseLocators;
import com.company.utils.SeleniumCore;
import com.company.utils.SeleniumUtils;

public class DataImportUtils extends BaseClass {
	
	SeleniumCore seleniumCore=new SeleniumCore();
	SeleniumUtils seleniumUtils=new SeleniumUtils();
	
	public void clickOnCustomFields() {
		seleniumCore.clickOnSubMenu(driver.findElement(By.xpath(ReuseLocators.menu("Configuration"))),driver.findElement(By.xpath(ReuseLocators.menuLink("Data Import"))));
	}
}
