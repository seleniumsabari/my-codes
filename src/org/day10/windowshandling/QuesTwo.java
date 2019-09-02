package org.day10.windowshandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuesTwo {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sindhu\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.snapdeal.com/");
		WebElement txtbox = dr.findElement(By.xpath("//input[@id='inputValEnter']"));
		txtbox.sendKeys("iphone 7");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement mob = dr.findElement(By.xpath("(//p[text()='Apple iPhone 7 ( 32GB , 2 GB ) Black'])[1]"));
		mob.click();
		String parent = dr.getWindowHandle();
		Set<String> all = dr.getWindowHandles();
		for (String x : all) {
			if(!x.equals(parent)) {
				dr.switchTo().window(x);
			}
		}
			WebElement cart = dr.findElement(By.xpath("//span[text()='add to cart']"));
			cart.click();
			WebElement txt = dr.findElement(By.xpath("(//span[text()='Rs. 39,900'])[1]"));
			String text = txt.getText();
			System.out.println(text);
		}
		
	}
