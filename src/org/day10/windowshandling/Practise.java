package org.day10.windowshandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sindhu\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.snapdeal.com");
		WebElement txtbox = dr.findElement(By.xpath("//input[@id='inputValEnter']"));
		txtbox.sendKeys("iphone 6");
		WebElement srchbtn = dr.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		srchbtn.click();
		WebElement mob = dr.findElement(By.xpath("//p[text()='Apple iPhone 6s ( 32GB , 2 GB ) Silver']"));
		mob.click();
		String parent = dr.getWindowHandle();
		Set<String> all = dr.getWindowHandles();
		System.out.println(parent+"\n"+all);
		for (String str : all) {
			if(!str.equals(parent)) {
				dr.switchTo().window(str);
				
			}
			Thread.sleep(9000);
			WebElement cart = dr.findElement(By.xpath("//span[text()='add to cart']"));
			cart.click();
		}
	}
}
