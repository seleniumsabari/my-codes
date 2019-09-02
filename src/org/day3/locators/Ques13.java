package org.day3.locators;


import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Ques13 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sindhu\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.snapdeal.com/");
		WebElement sin = dr.findElement(By.xpath("//span[text()='Sign In']"));
		Actions act=new Actions(dr);
		act.moveToElement(sin).perform();
		WebElement reg = dr.findElement(By.xpath("(//span[text()='Register'])[1]"));
		reg.click();
		WebElement uname = dr.findElement(By.xpath("(//input[@type='text'])[8]"));
		uname.sendKeys("9791161154");
		WebElement con = dr.findElement(By.xpath("//button[@id='checkUser']"));
		con.click();
		
		
	}
}
