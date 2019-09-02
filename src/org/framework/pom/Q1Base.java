package org.framework.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1Base {

	static WebDriver dr;
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sindhu\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		dr=new ChromeDriver();
		return dr;
	}
	public static void loadurl(String url) {
		dr.get(url);
	}
	public static void type(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void btnClick(WebElement element) {
		element.click();
	}
}