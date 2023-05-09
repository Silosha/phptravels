package com.phptravels.steps;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseStep {

	private Properties prop;
	private WebDriver webDriver;

	private void loadProperties() {
		if (prop == null) {
			String projectDir = System.getProperty("user.dir");

			prop = new Properties();

			try (FileInputStream inputStream = new FileInputStream(
					projectDir + File.separator + "src/test/resources/app-config.properties")) {
				prop.load(inputStream);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void setupWebDriver() {
		loadProperties();

		String browser = prop.getProperty("browser");

		if ("chrome".equals(browser)) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			webDriver = new ChromeDriver(options);
		}
	}

	public WebDriver getWebDriver() {
		return webDriver;
	}
	
	public Properties ofProperties() {
		return prop;
	}
}
