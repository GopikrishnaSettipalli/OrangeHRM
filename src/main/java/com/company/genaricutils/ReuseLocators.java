package com.company.genaricutils;

public class ReuseLocators {

	public static String inputFieldName(String textboxName) {
		String xpath="//label[text()='"+textboxName+"']//parent::div//following-sibling::div//input";
		return xpath;
	}

	public static String dropdownFieldName(String dropdownName) {
		String xpath="//label[text()='"+dropdownName+"']//parent::div//following-sibling::div//div[@class='oxd-select-text-input']";
		return xpath;
	}

	public static String textAreaFieldName(String textAreaName) {
		String xpath="//label[text()='"+textAreaName+"']//parent::div//following-sibling::div//textarea";
		return xpath;
	}
	
	public static String menuLink(String menuName) {
		String xpath="//a[text()='"+menuName+"']";
		return xpath;
	}
	
	public static String menu(String menuName) {
		String xpath="//span[normalize-space(text())='"+menuName+"']";
		return xpath;
	}
	
	public static String mainMenu(String mainMenuName) {
		String xpath="//span[text()='"+mainMenuName+"']/parent::a";
		return xpath;
	}
	
}
