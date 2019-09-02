package org.day10.windowshandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QuesFour {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sindhu\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://www.greenstechnologys.com/");
		WebElement cus = dr.findElement(By.xpath("//a[text()='CONTACT US']"));
		Actions act=new Actions(dr);
			act.contextClick(cus).perform();
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
				WebElement txt = dr.findElement(By.xpath("(//address[contains(text(),'')])[2]"));
				String text = txt.getText();
				System.out.println(text);
				
				
				
				
				
			
	}
}
