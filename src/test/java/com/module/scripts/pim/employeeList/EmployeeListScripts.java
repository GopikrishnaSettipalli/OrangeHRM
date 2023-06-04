package com.module.scripts.pim.employeeList;

import org.testng.annotations.Test;

import com.company.base.BaseClass;
import com.module.utils.loginlogout.LoginLogoutUtils;
import com.module.utils.pim.addemployee.AddEmployeeUtils;
import com.module.utils.pim.employeeList.EmployeeListUtils;

public class EmployeeListScripts extends BaseClass {

	LoginLogoutUtils loginUtils=new LoginLogoutUtils();
	EmployeeListUtils employeeListUtils=new EmployeeListUtils();
	AddEmployeeUtils addEmployeeUtils=new AddEmployeeUtils();

	@Test
	public void loginApplication() {
		loginUtils.loginCredentilas(pro.getProperty("username"),pro.getProperty("password"));
		addEmployeeUtils.clickOnPIM();
		employeeListUtils.clickOnEmployeeList();
		employeeListUtils.employeeInformationSearch("Auto", "", "", "", "", "", "");
	}
	
	

}
