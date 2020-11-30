package com.medeiros.prova_4all;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome implements Browser {

	@Override
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://shopcart-challenge.4all.com/");
		driver.manage().window().maximize();
		return driver;
		
	}
	
	

}
