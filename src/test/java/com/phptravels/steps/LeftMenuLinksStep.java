package com.phptravels.steps;

import java.util.Properties;

import com.phptravels.pages.CommonPageActions;
import com.phptravels.pages.LeftMenuAction;
import com.phptravels.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeftMenuLinksStep {
	
	private LoginPage loginPage;
	private CommonPageActions pageActions;
	private Properties prop;
	private LeftMenuAction leftMenuAction;

	public LeftMenuLinksStep(CommonStep commonStep) {
		prop = commonStep.ofProperties();
		loginPage = new LoginPage(commonStep.getWebDriver());
		pageActions = new CommonPageActions(commonStep.getWebDriver());
		leftMenuAction = new LeftMenuAction(commonStep.getWebDriver());
		
	}
	
	/**
	@Given("a URL and load it in the browser")
	public void a_url_and_load_it_in_the_browser() {
		String url = prop.getProperty("url-home") + prop.getProperty("url-login");
		pageActions.navigateTo(url);
		
	} */
	
	@Given("a user name and password")
	public void a_user_name_and_password() {
		loginPage.sendUserName("user@phptravels.com");
		loginPage.sendPassword("demouser");
	}
	
	@Then("the dashboard page should be rendered")
	public void the_dashboard_page_should_be_rendered() {
		String currentUrl = pageActions.getCurrentUrl();
		System.out.println("Current Url : "+currentUrl);
	}
	
	@When("I click My Bookings link")
	public void i_click_my_bookings_link() {
		leftMenuAction.clickMyBookingsMenu();
	}
	
	@Then("the My Bookings page should be rendered")
	public void the_my_bookings_page_should_be_rendered() {
		String currentUrl = pageActions.getCurrentUrl();
		System.out.println("Current Url : "+currentUrl);
	}
	
	@Given("open browser and navigate to {string}")
	public void open_browser_and_navigate_to(String path) {
		String url = prop.getProperty("url-home")  +path;
		pageActions.navigateTo(url);
	}
	
	@Given("a {string} and {string} are entered")
	public void a_and_are_entered(String username, String pwd) {
		loginPage.sendUserName(username);
		loginPage.sendPassword(pwd);
	}
	
	@Then("the {string} page should be rendered")
	public void the_page_should_be_rendered(String string) {
		String currentUrl = pageActions.getCurrentUrl();
		System.out.println("Current Url : "+currentUrl);
	}
	
	@When("I click left menu {string} link")
	public void i_click_a_link(String menuName) {
		leftMenuAction.clickMenuByName(menuName);
	}

	




}
