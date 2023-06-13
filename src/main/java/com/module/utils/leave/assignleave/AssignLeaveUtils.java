package com.module.utils.leave.assignleave;

import org.openqa.selenium.support.PageFactory;

import com.company.base.BaseClass;
import com.company.utils.SeleniumCore;
import com.company.utils.SeleniumUtils;
import com.company.utils.WaitTime;



public class AssignLeaveUtils extends BaseClass {
	
	public SeleniumCore seleniumCore;
	public SeleniumUtils seleniumUtils;
	public WaitTime waitTime;
	
	public AssignLeaveUtils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtils=PageFactory.initElements(driver, SeleniumUtils.class);
		waitTime=PageFactory.initElements(driver, WaitTime.class);
	}


}
