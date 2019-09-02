package org.day3.locators;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ques12 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sindhu\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement reg = dr.findElement(By.xpath("//a[text()=' REGISTER ']"));
		reg.click();
		WebElement uname = dr.findElement(By.id("userName"));
		uname.sendKeys("Sabari562");
		WebElement pwd = dr.findElement(By.xpath("//input[@id='usrPwd']"));
		pwd.sendKeys("Saba1234");
		WebElement cpwd = dr.findElement(By.id("cnfUsrPwd"));
		cpwd.sendKeys("Saba1234");
		WebElement sq = dr.findElement(By.xpath("//label[text()='Select Security Question']"));
		sq.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement ans = dr.findElement(By.xpath("(//input[@class='form-control ng-untouched ng-pristine ng-invalid'])[1]"));
		ans.sendKeys("Chinku");
		WebElement lang = dr.findElement(By.xpath("//label[text()='Select Preferred Language']"));
		lang.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement fname = dr.findElement(By.id("firstName"));
		fname.sendKeys("Sabari");
		WebElement mname = dr.findElement(By.id("middleName"));
		mname.sendKeys("Sundhara");
		WebElement lname = dr.findElement(By.id("lastname"));
		lname.sendKeys("Moorthi");
		WebElement gender = dr.findElement(By.xpath("//input[@id='M']"));
		gender.click();
		WebElement dob = dr.findElement(By.xpath("//input[@class='ng-tns-c14-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']"));
		dob.sendKeys("25-03-1998");
		WebElement occ = dr.findElement(By.xpath("//label[text()='Select Occupation']"));
		occ.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement mar = dr.findElement(By.xpath("(//input[@class='ng-untouched ng-pristine ng-valid'])[2]"));
		mar.click();
		WebElement mail = dr.findElement(By.xpath("//input[@id='email']"));
		mail.sendKeys("Sabari@gmail.com");
		WebElement mob = dr.findElement(By.xpath("//input[@id='mobile']"));
		mob.sendKeys("9791161178");
		WebElement nation = dr.findElement(By.xpath("(//select[@class='form-control ng-untouched ng-pristine ng-invalid'])[1]"));
		Select dd=new Select(nation);
		dd.selectByVisibleText("India");
		WebElement add = dr.findElement(By.id("resAddress1"));
		add.sendKeys("225");
		WebElement add2 = dr.findElement(By.id("resAddress2"));
		add2.sendKeys("Sabari Street");
		WebElement add3 = dr.findElement(By.id("resAddress3"));
		add3.sendKeys("Saligramam");
		WebElement add4 = dr.findElement(By.xpath("(//input[@name='resPinCode'])[1]"));
		add4.sendKeys("600092");
		WebElement state = dr.findElement(By.id("resState"));
		state.sendKeys("Tamilnadu");
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		WebElement phone = dr.findElement(By.xpath("//input[@id='resPhone']"));
		phone.sendKeys("04423775242");
		WebElement yes = dr.findElement(By.xpath("(//input[@class='ng-untouched ng-pristine ng-invalid'])[1]"));
		yes.click();
		//WebElement agree = dr.findElement(By.xpath("(//input[@type='checkbox'])[16]"));
		//agree.click();
		WebElement regis = dr.findElement(By.xpath("//button[@class='btn btn-primary pull-left']"));
		regis.click();
		
		
		
		
	}
}
