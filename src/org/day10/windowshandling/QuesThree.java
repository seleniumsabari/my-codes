package org.day10.windowshandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuesThree {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sindhu\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.homedepot.com/");
		WebElement txtbox = dr.findElement(By.xpath("//input[@id='headerSearch']"));
		txtbox.sendKeys("Ceiling Fan");
		WebElement srcbtn = dr.findElement(By.id("headerSearchButton"));
		srcbtn.click();
		WebElement fan = dr.findElement(By.xpath("(//span[text()='Home Decorators Collection'])[2]"));
		fan.click();
		WebElement cart = dr.findElement(By.xpath("//button[@id='atc_shipIt']"));
		cart.click();
		WebElement price = dr.findElement(By.xpath("(//span[contains(text(),'299')])[2]"));
		String text = price.getText();
		System.out.println(text);
	}
}
