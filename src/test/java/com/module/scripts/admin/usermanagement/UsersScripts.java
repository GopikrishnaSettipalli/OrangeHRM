package com.module.scripts.admin.usermanagement;

import org.testng.annotations.Test;

import com.company.base.BaseClass;
import com.module.utils.admin.usermanagement.UsersUtils;
import com.module.utils.loginlogout.LoginLogoutUtils;

public class UsersScripts extends BaseClass {

	LoginLogoutUtils loginUtils=new LoginLogoutUtils();
	UsersUtils usersUtils=new UsersUtils();

	@Test
	public void loginApplication() {
		loginUtils.loginCredentilas(pro.getProperty("username"),pro.getProperty("password"));
		loginUtils.loginCredentilas(pro.getProperty("xpath"), pro.getProperty("//button[@type='submit']"));
	}



}
