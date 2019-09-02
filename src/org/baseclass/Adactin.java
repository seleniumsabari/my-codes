package org.baseclass;

import org.openqa.selenium.WebElement;

public class Adactin extends Base{
	public static void main(String[] args) {
		launch();
		loadurl("https://adactin.com/HotelApp/");
		Login l=new Login();
		WebElement txtUser=l.getTxtUser();
		type(txtUser, "Sabari");
		type(l.getTxtPass(), "12345");
		
	}

}
