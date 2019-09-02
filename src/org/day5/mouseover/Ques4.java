package org.day5.mouseover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sindhu\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.gettyimages.in/");
		WebElement edit = dr.findElement(By.xpath("(//a[@class='text-link--sly action--with-emphasis'])[1]"));
		edit.click();
		WebElement enter = dr.findElement(By.xpath("//a[text()='Entertainment']"));
		enter.click();
		
	}
}
