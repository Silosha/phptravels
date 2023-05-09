package com.phptravels.pages;

import org.openqa.selenium.WebDriver;

import com.phptravels.pages.elements.LeftMenuElements;

public class LeftMenuAction {

	private LeftMenuElements leftMenuElements;

	public LeftMenuAction(WebDriver webDriver) {
		leftMenuElements = new LeftMenuElements(webDriver);
	}

	public void clickDashboardMenu() {
		leftMenuElements.getDashboardMenu().click();
	}

	public void clickMyBookingsMenu() {
		leftMenuElements.getMyBookingsMenu().click();
	}

	public void clickAddFundsMenu() {
		leftMenuElements.getAddFundsMenu().click();
	}

	public void clickMyProfileMenu() {
		leftMenuElements.getMyProfileMenu().click();
	}

	public void clickLogoutMenu() {
		leftMenuElements.getLogoutMenu().click();
	}

	public void clickMenuByName(String menuName) {
		if ("My Bookings".equals(menuName)) {
			clickMyBookingsMenu();
		} else if ("Add Funds".equals(menuName)) {
			clickAddFundsMenu();
		} else if ("My Profile".equals(menuName)) {
			clickMyProfileMenu();
		} else if ("Logout".equals(menuName)) {
			clickLogoutMenu();
		}
	}
}
