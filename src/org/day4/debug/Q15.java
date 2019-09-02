package org.day4.debug;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q15 {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sindhu\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.shopclues.com/wholesale.html");
		WebElement srch = dr.findElement(By.xpath("//input[@id='autocomplete']"));
		srch.sendKeys("Fasttrack watches for men");
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement watch = dr.findElement(By.xpath("(//h2[text()='29K Analog Round Black Dial Men Watch / Fashionable Men'])[1]"));
		watch.click();
		String parent = dr.getWindowHandle();
		Set<String> all = dr.getWindowHandles();
		for (String x : all) {
			if(!x.equals(parent)) {
				dr.switchTo().window(x);
			}
		}
		WebElement cart = dr.findElement(By.xpath("//button[@id='add_cart']"));
		cart.click();
		WebElement price = dr.findElement(By.xpath("//span[@class='f_price']"));
		String text = price.getText();
		System.out.println(text);
	}
}
