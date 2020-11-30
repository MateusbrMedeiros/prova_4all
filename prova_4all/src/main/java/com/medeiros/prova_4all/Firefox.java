package com.medeiros.prova_4all;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements Browser {

	@Override
	public WebDriver getDriver() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mateu\\Documents\\Dev\\Gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://shopcart-challenge.4all.com/");
		driver.manage().window().maximize();
		return driver;
	}
	

}
