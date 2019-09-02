package org.framework.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Q1Pojo extends Q1Base {
	public Q1Pojo() {

	PageFactory.initElements(dr,this);
}
@FindBy(id="email")
private WebElement txtUser;
@FindBy(id="pass")
private WebElement txtPass;
public WebElement getTxtUser() {
	return txtUser;
}
public WebElement getTxtPass() {
	return txtPass;
}

	
}
