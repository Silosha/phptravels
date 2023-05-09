package com.phptravels.steps;

import java.util.Properties;

import com.phptravels.pages.CommonPageActions;
import com.phptravels.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerLoginStep {

	private LoginPage loginPage;
	private CommonPageActions pageActions;
	private Properties prop;

	public CustomerLoginStep(CommonStep commonStep) {
		prop = commonStep.ofProperties();
		loginPage = new LoginPage(commonStep.getWebDriver());
		pageActions = new CommonPageActions(commonStep.getWebDriver());
	}

	@Given("a customer username and password")
	public void a_customer_username_and_password(String userName, String password) {
		String url = prop.getProperty("url-home") + prop.getProperty("url-login");
		System.out.println("User Name : "+userName);
		System.out.println("User  : "+password);
		System.out.println("URL : "+url);
		pageActions.navigateTo(url);
		loginPage.sendUserName("user@phptravels.com");
		loginPage.sendPassword("demouser");
	}

	@When("I click the login button")
	public void i_click_the_login_button() {
		loginPage.clickLoginButton();
	}

	@Then("the customer should be navigate to dashboard")
	public void the_customer_should_be_navigate_to_dashboard() {
		String currentUrl = pageActions.getCurrentUrl();
		System.out.println("Current Url : "+currentUrl);
	}
	
	@Then("the customer should not be navigate to dashboard")
	public void the_customer_should_not_be_navigate_to_dashboard() {
		String currentUrl = pageActions.getCurrentUrl();
		System.out.println("Current Url : "+currentUrl);
	}
}
