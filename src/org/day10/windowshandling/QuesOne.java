package org.day10.windowshandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuesOne {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sindhu\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.amazon.com/");
		WebElement txtbox = dr.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		txtbox.sendKeys("iphone x");
		WebElement gobtn = dr.findElement(By.xpath("(//input[@class='nav-input'])[1]"));
		gobtn.click();
		WebElement mob = dr.findElement(By.xpath("(//span[text()='Simple Mobile Prepaid - Apple iPhone X (64GB) - Silver'])[1]"));
		mob.click();
		Thread.sleep(3000);
		WebElement shop = dr.findElement(By.xpath("//input[@id='add-to-wishlist-button-submit']"));
		shop.click();
		WebElement txt = dr.findElement(By.xpath("//h1[contains(text(),'Sign-In')]"));
		String text = txt.getText();
		System.out.println(text);
		
	}
}
