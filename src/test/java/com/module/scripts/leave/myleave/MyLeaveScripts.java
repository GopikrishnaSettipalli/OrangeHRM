package com.module.scripts.leave.myleave;

import org.testng.annotations.Test;

import com.company.base.BaseClass;
import com.module.utils.loginlogout.LoginLogoutUtils;

public class MyLeaveScripts extends BaseClass {

	LoginLogoutUtils loginUtils=new LoginLogoutUtils();

	@Test
	public void loginApplication() {
		loginUtils.loginCredentilas(pro.getProperty("username"),pro.getProperty("password"));
	}

}
