package com.module.scripts.loginlogout;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.company.base.BaseClass;
import com.module.utils.loginlogout.LoginLogoutUtils;

public class LoginLogutScript extends BaseClass {

	public LoginLogoutUtils loginUtils;
	
	@BeforeClass
	public void loadFiles() {
		loginUtils=PageFactory.initElements(driver, LoginLogoutUtils.class);
	}

	@Test
	public void loginApplication() {
		loginUtils.loginCredentilas(pro.getProperty("username"),pro.getProperty("password"));
	}
	
	@Test
	public void emptyCredentials() {
		loginUtils.loginCredentilas("","");
	}
	
	@Test
	public void invalidpasswordCredentials() {
		loginUtils.loginCredentilas(pro.getProperty("username"),"adgasjgasdfads");
	}
	
	@Test
	public void invalidUsernameCredentials() {
		loginUtils.loginCredentilas("ajsgdjsagd",pro.getProperty("password"));
	}
	
	@Test
	public void invalidCredentials() {
		loginUtils.loginCredentilas("ajsgdjsagd","ajgdsysadsa");
	}
	
	
}
