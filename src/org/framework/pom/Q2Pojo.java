package org.framework.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Q2Pojo extends Q1Base {
public Q2Pojo() {
	PageFactory.initElements(dr, this);
}
@FindBy(xpath="//input[@id='username']")
private WebElement txtUser;
@FindBy(xpath="//input[@id='password']")
private WebElement txtPass;
@FindBy(xpath="//input[@id='login']")
private WebElement login;
public WebElement getTxtUser() {
	return txtUser;
}
public WebElement getTxtPass() {
	return txtPass;
}
public WebElement getlogin() {
	return login;
}

}
