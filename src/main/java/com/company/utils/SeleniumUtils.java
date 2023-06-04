package com.company.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.company.base.BaseClass;

public class SeleniumUtils extends BaseClass {

	public void enterTextOnElement(WebElement element,String value) {
		element.sendKeys(value);
	}

	public void clickOnElement(WebElement element) {
		element.click();
	}

	Select select;
	public void selectDropdown(String index_Value_text,WebElement element,String dropdownValue) {
		select=new Select(element);
		if (index_Value_text.equalsIgnoreCase("index")) {
			int value=Integer.parseInt(dropdownValue);
			select.selectByIndex(value);
		}else if (index_Value_text.equalsIgnoreCase("value")) {
			select.selectByValue(dropdownValue);
		}else if (index_Value_text.equalsIgnoreCase("text")) {
			select.selectByVisibleText(dropdownValue);
		}else {
			System.out.println("Not available........");
		}
	}


	//............>>>>........ FRAMES{ Window inside another Window}.........<<<<<<......\\


	public void switchToFrameWithCount(String iframe) {
		List<WebElement>frame=driver.findElements(By.xpath(iframe));
		System.out.println("Number of Frame = "+frame.size());

		for (int i = 0; i < frame.size(); i++) {
			try {
				driver.switchTo().frame(i);

			} catch (Exception e) {
				driver.switchTo().defaultContent();
			}
		}
	}

}