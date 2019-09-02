package org.day10.windowshandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QuesFive {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sindhu\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://www.greenstechnologys.com/");
		WebElement con = dr.findElement(By.xpath("//a[text()='CONTACT US']"));
		Actions act=new Actions(dr);
		act.contextClick(con).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		String parent = dr.getWindowHandle();
		Set<String> all = dr.getWindowHandles();
		for (String x : all) {
			if(!x.equals(parent)) {
				dr.switchTo().window(x);
			}
			
		}
		WebElement courses = dr.findElement(By.xpath("(//a[text()='Courses '])[1]"));
		act.moveToElement(courses).perform();
		WebElement soft = dr.findElement(By.xpath("(//a[text()='Software Testing Training '])[1]"));
		act.moveToElement(soft).perform();
		WebElement sel = dr.findElement(By.xpath("//span[text()='Selenium']"));
		sel.click();
		TakesScreenshot tk=(TakesScreenshot)dr;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Sindhu\\eclipse-workspace\\Selenium\\Screenshot\\Selenium.png");
		FileUtils.copyFile(src, des);
		
		
		
		
		
	}
}
