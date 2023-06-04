package com.module.utils.loginlogout;

import org.openqa.selenium.support.PageFactory;

import com.company.base.BaseClass;
import com.company.utils.SeleniumCore;
import com.company.utils.SeleniumUtils;
import com.company.utils.WaitTime;
import com.module.objects.loginlogout.LoginLogoutObjects;

public class LoginLogoutUtils extends BaseClass {
	
	public SeleniumCore seleniumCore;
	public SeleniumUtils seleniumUtils;
	public WaitTime waitTime;
	public LoginLogoutObjects loginLogoutObjects;
	
	public LoginLogoutUtils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtils=PageFactory.initElements(driver, SeleniumUtils.class);
		waitTime=PageFactory.initElements(driver, WaitTime.class);
		loginLogoutObjects=PageFactory.initElements(driver, LoginLogoutObjects.class);
	}
	
	public void loginCredentilas(String username,String password) {
		waitTime.waitForSec(3000);
		seleniumUtils.enterTextOnElement(loginLogoutObjects.usernameTextbox, username);
		seleniumUtils.enterTextOnElement(loginLogoutObjects.passwordTextbox, password);
		seleniumUtils.clickOnElement(loginLogoutObjects.loginButton);
	}

}
