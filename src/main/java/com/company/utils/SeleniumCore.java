package com.company.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.company.base.BaseClass;

public class SeleniumCore extends BaseClass{

	public static Actions actions;
	
	public void pressEnterButton() {
		actions =new Actions(driver);
		actions.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void pressTabButton() {
		actions =new Actions(driver);
		actions.sendKeys(Keys.TAB).build().perform();
	}
	
	public void pressEscButton() {
		actions =new Actions(driver);
		actions.sendKeys(Keys.ESCAPE).build().perform();
	}
	
	public void clickOnMenu(WebElement element) {
		actions =new Actions(driver);
		actions.click(element).build().perform();
	}
	
	public void dragAndDropOfElement(String sourceLocator,String targetLocator) {
		actions=new Actions(driver);
		actions.dragAndDrop(driver.findElement(By.xpath(sourceLocator)), driver.findElement(By.xpath(targetLocator))).build().perform();
	}
	
	public void clickOnSubMenu(WebElement menu,WebElement subMenu) {
			actions =new Actions(driver);
			actions.click(menu).build().perform();
			actions.click(subMenu).build().perform();
	}
	
	public void moveToElements(WebElement element) {
		actions =new Actions(driver);
		actions.click(element).build().perform();
	}
	public void mouseOverOnElement(WebElement element) {
    	actions =new Actions(driver);
		actions.click(element).build().perform();
	}
}
