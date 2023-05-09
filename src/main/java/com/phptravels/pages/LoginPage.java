package com.phptravels.pages;

import org.openqa.selenium.WebDriver;

import com.phptravels.pages.elements.LoginPageElements;

public class LoginPage {

	private LoginPageElements loginPageElements;

	public LoginPage(WebDriver webDriver) {
		loginPageElements = new LoginPageElements(webDriver);
	}

	public void sendUserName(String userName) {
		loginPageElements.getUserName().sendKeys(userName);
	}

	public void sendPassword(String pwd) {
		loginPageElements.getPassword().sendKeys(pwd);
	}

	public void clickLoginButton() {
		loginPageElements.getLoginButton().click();
	}

}
