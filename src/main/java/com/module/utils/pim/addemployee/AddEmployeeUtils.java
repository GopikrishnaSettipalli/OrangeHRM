package com.module.utils.pim.addemployee;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.company.base.BaseClass;
import com.company.genaricutils.ReuseLocators;
import com.company.utils.SeleniumCore;
import com.company.utils.SeleniumUtils;
import com.company.utils.WaitTime;

public class AddEmployeeUtils extends BaseClass {
	
	public SeleniumCore seleniumCore;
	public SeleniumUtils seleniumUtils;
	public WaitTime waitTime;
	
	public AddEmployeeUtils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtils=PageFactory.initElements(driver, SeleniumUtils.class);
		waitTime=PageFactory.initElements(driver, WaitTime.class);
	}
	
	public void clickOnPIM() {
		waitTime.waitForSec(5000);
		driver.findElement(By.xpath(ReuseLocators.mainMenu("PIM"))).click();
	}
	
	public void clickOnAddEmployee() {
		waitTime.waitForSec(2000);
		seleniumCore.clickOnMenu(driver.findElement(By.xpath(ReuseLocators.menuLink("Add Employee"))));
	}
	
	

}
