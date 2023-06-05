package com.module.objects.admin.usermanagement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersObjects {
	
	@FindBy(xpath="//span[text()='Admin']")
	public WebElement adminMenu;

}
