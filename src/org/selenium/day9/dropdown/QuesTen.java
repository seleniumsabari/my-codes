package org.selenium.day9.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class QuesTen {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sindhu\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://adactin.com/HotelApp/");
		System.out.println("Types Of Rooms Availble :");
		WebElement uname = dr.findElement(By.id("username"));
		uname.sendKeys("Sabari2525");
		WebElement pass = dr.findElement(By.id("password"));
		pass.sendKeys("sabari123");
		WebElement login = dr.findElement(By.id("login"));
		login.click();
		WebElement rooms = dr.findElement(By.id("room_type"));
		Select dd=new Select(rooms);
		List<WebElement> options = dd.getOptions();
		for (WebElement all : options) {
			String text = all.getText();
			System.out.println("\n"+text);
		}
	}
}
