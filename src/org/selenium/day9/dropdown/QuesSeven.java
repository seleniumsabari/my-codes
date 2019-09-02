package org.selenium.day9.dropdown;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class QuesSeven {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sindhu\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		
		searchBox.sendKeys("iphone 6");
		
		WebElement searchIcon = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
	
		searchIcon.click();
		
		WebElement iphone = driver.findElement(By.xpath("//p[text()='Apple iPhone 6s ( 32GB , 2 GB ) Silver']"));
	
	iphone.click();
	
	String par = driver.getWindowHandle();
	
	Set<String> All = driver.getWindowHandles();
	
	System.out.println(par +"\n"+All);
	
	for (String x : All) {
		
		if(!x.equals(par)) {
			driver.switchTo().window(x);
		}
	}
	
	WebElement add = driver.findElement(By.xpath("//span[text()='add to cart']"));
	
	add.click();
	
	
	
	}
}
