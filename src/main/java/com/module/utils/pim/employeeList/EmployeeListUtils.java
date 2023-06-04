package com.module.utils.pim.employeeList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.company.base.BaseClass;
import com.company.genaricutils.ReuseLocators;
import com.company.utils.SeleniumCore;
import com.company.utils.SeleniumUtils;
import com.company.utils.WaitTime;
import com.module.objects.pim.employeeList.EmployeeListObjects;

public class EmployeeListUtils extends BaseClass {
	
	public SeleniumCore seleniumCore;
	public SeleniumUtils seleniumUtils;
	public WaitTime waitTime;
	
	public EmployeeListUtils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtils=PageFactory.initElements(driver, SeleniumUtils.class);
		waitTime=PageFactory.initElements(driver, WaitTime.class);
	}

	public void clickOnEmployeeList() {
		waitTime.waitForSec(2000);
		seleniumCore.clickOnMenu(driver.findElement(By.xpath(ReuseLocators.menuLink("Employee List"))));
	}
	
	public void employeeInformationSearch(String empName,String empId,String empstatus,String include,String supervisorName,String jobTitle,String subUnit) {
		
		waitTime.waitForSec(2000);
		
		if (!empName.isEmpty()) {
			WebElement element=driver.findElement(By.xpath(ReuseLocators.inputFieldName("Employee Name")));
			seleniumUtils.enterTextOnElement(element, empName);
			List<WebElement> tot=driver.findElements(By.xpath(EmployeeListObjects.AUTOTEXTVALUES));
			waitTime.waitForSec(1000);
			tot.get(0).click();
		}
		
		if (!empId.isEmpty()) {
			WebElement element=driver.findElement(By.xpath(ReuseLocators.inputFieldName("Employee Id")));
			seleniumUtils.enterTextOnElement(element, empId);
		}
		
		if (!empstatus.isEmpty()) {
			WebElement empState=driver.findElement(By.xpath(ReuseLocators.inputFieldName("Employment Status")));
			seleniumUtils.clickOnElement(empState);
			WebElement element=driver.findElement(By.xpath(ReuseLocators.dropdownFieldName(empstatus)));
			seleniumUtils.clickOnElement(element);
		}
		
		if (!include.isEmpty()) {
			WebElement incluse=driver.findElement(By.xpath(ReuseLocators.inputFieldName("Include")));
			seleniumUtils.clickOnElement(incluse);
			WebElement element=driver.findElement(By.xpath(ReuseLocators.dropdownFieldName(include)));
			seleniumUtils.clickOnElement(element);
		}
		
		if (!supervisorName.isEmpty()) {
			WebElement element=driver.findElement(By.xpath(ReuseLocators.inputFieldName("Supervisor Name")));
			seleniumUtils.enterTextOnElement(element, supervisorName);
		}
		
		if (!jobTitle.isEmpty()) {
			WebElement title=driver.findElement(By.xpath(ReuseLocators.inputFieldName("Job Title")));
			seleniumUtils.clickOnElement(title);
			WebElement element=driver.findElement(By.xpath(ReuseLocators.dropdownFieldName(jobTitle)));
			seleniumUtils.clickOnElement(element);
		}
		
		if (!subUnit.isEmpty()) {
			WebElement element=driver.findElement(By.xpath(ReuseLocators.inputFieldName("Sub Unit")));
			seleniumUtils.clickOnElement(element);
			WebElement sub=driver.findElement(By.xpath(ReuseLocators.dropdownFieldName(subUnit)));
			seleniumUtils.clickOnElement(sub);
		}
		
	}

	
}
