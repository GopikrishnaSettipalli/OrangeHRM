package com.module.scripts.leave.entitlements;

import org.testng.annotations.Test;

import com.company.base.BaseClass;
import com.module.utils.loginlogout.LoginLogoutUtils;

public class AddEntitlementsScripts extends BaseClass {

	LoginLogoutUtils loginUtils=new LoginLogoutUtils();

	@Test
	public void loginApplication() {
		loginUtils.loginCredentilas(pro.getProperty("username"),pro.getProperty("password"));
	}

}
