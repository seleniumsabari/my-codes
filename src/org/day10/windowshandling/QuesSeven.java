package org.day10.windowshandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuesSeven {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sindhu\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.amazon.com/");
		WebElement txtbox = dr.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		txtbox.sendKeys("iphone 8");
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		WebElement mob = dr.findElement(By.xpath("(//span[text()='Simple Mobile Prepaid - Apple iPhone 8 (64GB) - Silver'])[1]"));
		mob.click();
		Thread.sleep(2000);
		WebElement list = dr.findElement(By.xpath("//input[@id='add-to-wishlist-button-submit']"));
		list.click();
		WebElement cout = dr.findElement(By.xpath("//h1[contains(text(),' ')]"));
		String text = cout.getText();
		System.out.println(text);
	}
}
