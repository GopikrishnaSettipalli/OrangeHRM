package com.module.utils.myinfo;

import org.openqa.selenium.support.PageFactory;

import com.company.base.BaseClass;
import com.company.utils.SeleniumCore;
import com.company.utils.SeleniumUtils;
import com.company.utils.WaitTime;

public class MyInfoUtils extends BaseClass {
	
	public SeleniumCore seleniumCore;
	public SeleniumUtils seleniumUtils;
	public WaitTime waitTime;
	
	public MyInfoUtils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtils=PageFactory.initElements(driver, SeleniumUtils.class);
		waitTime=PageFactory.initElements(driver, WaitTime.class);
	}

}
