package com.module.utils.time.reports;

import org.openqa.selenium.support.PageFactory;

import com.company.base.BaseClass;
import com.company.utils.SeleniumCore;
import com.company.utils.SeleniumUtils;
import com.company.utils.WaitTime;
import com.module.objects.loginlogout.LoginLogoutObjects;

public class EmployeeReportsUtils extends BaseClass {
	
	public SeleniumCore seleniumCore;
	public SeleniumUtils seleniumUtils;
	public WaitTime waitTime;
	public LoginLogoutObjects loginLogoutObjects;
	
	public EmployeeReportsUtils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtils=PageFactory.initElements(driver, SeleniumUtils.class);
		waitTime=PageFactory.initElements(driver, WaitTime.class);
		loginLogoutObjects=PageFactory.initElements(driver, LoginLogoutObjects.class);
	}

}
