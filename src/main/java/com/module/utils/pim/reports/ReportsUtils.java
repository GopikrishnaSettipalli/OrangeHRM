package com.module.utils.pim.reports;

import org.openqa.selenium.By;

import com.company.base.BaseClass;
import com.company.genaricutils.ReuseLocators;
import com.company.utils.SeleniumCore;
import com.company.utils.SeleniumUtils;

public class ReportsUtils extends BaseClass {
	
	SeleniumCore seleniumCore=new SeleniumCore();
	SeleniumUtils seleniumUtils=new SeleniumUtils();

	public void clickOnReports() {
		seleniumCore.clickOnMenu(driver.findElement(By.xpath(ReuseLocators.menuLink("Reports"))));
	}
	
}
