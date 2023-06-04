package com.company.utils;

import com.company.base.BaseClass;

public class WaitTime extends BaseClass {
	
	public void waitForSec(long millisecs) {
		try {
			Thread.sleep(millisecs);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
