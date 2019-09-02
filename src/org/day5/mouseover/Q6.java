package org.day5.mouseover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sindhu\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.shopclues.com/wholesale.html");
		WebElement sport = dr.findElement(By.xpath("//a[text()='Sports & More']"));
		Actions act=new Actions(dr);
		act.moveToElement(sport).perform();
		WebElement gain = dr.findElement(By.xpath("//a[text()='Weight Gainers']"));
		gain.click();
		
	}
}
