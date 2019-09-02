package org.selenium.day9.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class QuesEight {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sindhu\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://tspsc.gov.in/TSPSCOTR2015/oneTimeRegistration.tspsc");
		System.out.println("Options of Community :");
		WebElement com = dr.findElement(By.id("community"));
		Select dd=new Select(com);
		List<WebElement> options = dd.getOptions();
		for (WebElement all : options) {
			String text = all.getText();
			System.out.println("\n"+text);
		}
	}
}
