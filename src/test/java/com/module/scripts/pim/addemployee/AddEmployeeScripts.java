package com.module.scripts.pim.addemployee;

import org.testng.annotations.Test;

import com.company.base.BaseClass;
import com.module.utils.loginlogout.LoginLogoutUtils;
import com.module.utils.pim.addemployee.AddEmployeeUtils;

public class AddEmployeeScripts extends BaseClass {

	LoginLogoutUtils loginUtils=new LoginLogoutUtils();
	AddEmployeeUtils addEmployeeUtils=new AddEmployeeUtils();

	@Test
	public void loginApplication() {
		loginUtils.loginCredentilas(pro.getProperty("username"),pro.getProperty("password"));
		addEmployeeUtils.clickOnPIM();
		addEmployeeUtils.clickOnAddEmployee();
	}

}
