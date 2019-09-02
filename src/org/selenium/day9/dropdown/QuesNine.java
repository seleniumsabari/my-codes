package org.selenium.day9.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class QuesNine {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sindhu\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://adactin.com/HotelApp/");
		WebElement uname = dr.findElement(By.id("username"));
		uname.sendKeys("Sabari2525");
		WebElement pass = dr.findElement(By.id("password"));
		pass.sendKeys("sabari123");
		WebElement login = dr.findElement(By.id("login"));
		login.click();
		WebElement loc = dr.findElement(By.id("location"));
		Select dd=new Select(loc);
		dd.selectByIndex(5);
		WebElement hotel = dr.findElement(By.id("hotels"));
		Select dd1=new Select(hotel);
		dd1.selectByIndex(2);
		WebElement room = dr.findElement(By.id("room_type"));
		Select dd2=new Select(room);
		dd2.selectByIndex(4);
		WebElement nor = dr.findElement(By.id("room_nos"));
		Select dd3=new Select(nor);
		dd3.selectByIndex(2);
		WebElement indate = dr.findElement(By.id("datepick_in"));
		indate.sendKeys("25/08/2019");
		WebElement outdate = dr.findElement(By.id("datepick_out"));
		outdate.sendKeys("29/08/2019");
		WebElement persons = dr.findElement(By.id("adult_room"));
		Select dd4=new Select(persons);
		dd4.selectByIndex(2);
		WebElement children = dr.findElement(By.id("child_room"));
		Select dd5=new Select(children);
		dd5.selectByIndex(2);
		WebElement submit = dr.findElement(By.id("Submit"));
		submit.click();
		WebElement radio = dr.findElement(By.id("radiobutton_0"));
		radio.click();
		WebElement con = dr.findElement(By.id("continue"));
		con.click();
		WebElement fname = dr.findElement(By.id("first_name"));
		fname.sendKeys("Sabari");
		WebElement lname = dr.findElement(By.id("last_name"));
		lname.sendKeys("Balamurugan");
		WebElement add = dr.findElement(By.id("address"));
		add.sendKeys("Saligramam");
		WebElement cc = dr.findElement(By.id("cc_num"));
		cc.sendKeys("4596202089562325");
		WebElement type = dr.findElement(By.id("cc_type"));
		Select dd6=new Select(type);
		dd6.selectByIndex(2);
		WebElement mon = dr.findElement(By.id("cc_exp_month"));
		Select dd7=new Select(mon);
		dd7.selectByIndex(3);
		WebElement year = dr.findElement(By.id("cc_exp_year"));
		Select dd8=new Select(year);
		dd8.selectByVisibleText("2020");
		WebElement cvv = dr.findElement(By.id("cc_cvv"));
		cvv.sendKeys("252");
		WebElement book = dr.findElement(By.id("book_now"));
		book.click();
		

		
		
		
		
		
		
	}
}
