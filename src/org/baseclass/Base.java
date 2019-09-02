package org.baseclass;

import java.sql.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	static WebDriver driver;
	public static WebDriver launch(){ 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sindhu\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}
	public static void loadurl(String Url) {
		driver.get(Url);
	}
	public static void type(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void btnClick(WebElement element) {
	element.click();
}
}
