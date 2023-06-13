package com.module.utils.admin.job;

import org.openqa.selenium.support.PageFactory;

import com.company.base.BaseClass;
import com.company.utils.SeleniumCore;
import com.company.utils.SeleniumUtils;
import com.company.utils.WaitTime;

public class JobTitlesUtils extends BaseClass {
	
	public SeleniumCore seleniumCore;
	public SeleniumUtils seleniumUtils;
	public WaitTime waitTime;
	
	public JobTitlesUtils() {
		seleniumCore=PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtils=PageFactory.initElements(driver, SeleniumUtils.class);
		waitTime=PageFactory.initElements(driver, WaitTime.class);
	}

}
