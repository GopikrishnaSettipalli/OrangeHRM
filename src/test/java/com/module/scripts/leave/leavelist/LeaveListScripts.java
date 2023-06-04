package com.module.scripts.leave.leavelist;

import org.testng.annotations.Test;

import com.company.base.BaseClass;
import com.module.utils.loginlogout.LoginLogoutUtils;

public class LeaveListScripts extends BaseClass {

	LoginLogoutUtils loginUtils=new LoginLogoutUtils();

	@Test
	public void loginApplication() {
		loginUtils.loginCredentilas(pro.getProperty("username"),pro.getProperty("password"));
	}

}
