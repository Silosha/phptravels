package com.phptravels.pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftMenuElements {

	@FindBy(xpath = "//div[@class='sidebar-menu-wrap']//ul//li//a[text() = ' Dashboard']")
	private WebElement dashboardMenu;

	@FindBy(xpath = "//div[@class='sidebar-menu-wrap']//ul//li//a[text() = ' My Bookings']")
	private WebElement myBookingsMenu;

	@FindBy(xpath = "//div[@class='sidebar-menu-wrap']//ul//li//a[text() = ' Add Funds']")
	private WebElement addFundsMenu;

	@FindBy(xpath = "//div[@class='sidebar-menu-wrap']//ul//li//a[text() = ' My Profile']")
	private WebElement myProfileMenu;

	@FindBy(xpath = "//div[@class='sidebar-menu-wrap']//ul//li//a[text() = ' Logout']")
	private WebElement logoutMenu;

	public LeftMenuElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getDashboardMenu() {
		return dashboardMenu;
	}

	public WebElement getMyBookingsMenu() {
		return myBookingsMenu;
	}

	public WebElement getAddFundsMenu() {
		return addFundsMenu;
	}

	public WebElement getMyProfileMenu() {
		return myProfileMenu;
	}

	public WebElement getLogoutMenu() {
		return logoutMenu;
	}
}
