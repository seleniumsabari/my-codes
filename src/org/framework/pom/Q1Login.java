package org.framework.pom;

import org.openqa.selenium.WebElement;

public class Q1Login extends Q1Base{
   public static void main(String[] args) {
	getDriver();
	loadurl("https://www.facebook.com/");
	Q1Pojo l =new Q1Pojo();
	WebElement txtUser=l.getTxtUser();
	type(txtUser,"sabari@gmail.com");
	type(l.getTxtPass(),"12345");
}
	
}
