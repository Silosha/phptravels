package com.phptravels.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonPageActions {
	
	private WebDriver webDriver;
	
	public CommonPageActions(WebDriver driver) {
		this.webDriver = driver;
	}
	
	public WebDriver getWebDriver() {
		return webDriver;
	}
	
	public void navigateTo(String url) {
		getWebDriver().get(url);
	}
	
	public void maximize() {
		getWebDriver().manage().window().maximize();
	}
	
	public String getPageTitle() {
		return getWebDriver().getTitle();
	}
	
	public String getCurrentUrl() {
		return getWebDriver().getCurrentUrl();
	}
	
	public WebDriverWait ofWebDriverWait(long duration) {
		return new WebDriverWait(getWebDriver(), Duration.ofSeconds(duration));
	}

}
