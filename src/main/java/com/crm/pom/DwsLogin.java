package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsLogin {
public DwsLogin(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
@FindBy(className = "ico-login")
public WebElement login_link;
@FindBy(id = "Email")
public WebElement email;
@FindBy(name = "Password")
public WebElement password;
@FindBy(css =   "input[id='RememberMe']")
public WebElement remeberMe;
@FindBy(xpath =  "//input[@value='Log in']")
public WebElement login_btn;
/*public void loginLink() {
	login_link.click();
	}
public void email(String data) {
	email.sendKeys(data);
	}
public void password(String data) {
	password.sendKeys(data);
	}
public void rememberMe() {
	remeberMe.click();
	}
public void LoginBtn() {
	login_btn.click();
	}*/
public void login(String email1,String password2) {
	login_link.click();
	email.sendKeys(email1);
	password.sendKeys(password2);
	remeberMe.click();
	login_btn.click();
	
}













}
