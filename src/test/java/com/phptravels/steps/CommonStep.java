package com.phptravels.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class CommonStep extends BaseStep{
	
	@BeforeStep
	public void init() {
		System.out.println("Before Step...");
	}
	
	@Before
	public void setup() {
		System.out.println("Setpup webdriver before each scenarios....");
		setupWebDriver();
	}
	
	@After
	public void tearDown() {
		System.out.println("Closing browser after execution of each scenario..");
		getWebDriver().close();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
