package com.module.objects.loginlogout;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLogoutObjects {
	
	@FindBy(name="username")
	public WebElement usernameTextbox;
	
	@FindBy(name="password")
	public WebElement passwordTextbox;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement loginButton;	

}