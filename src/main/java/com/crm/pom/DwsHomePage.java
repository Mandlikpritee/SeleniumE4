package com.crm.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsHomePage {
public DwsHomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(css = "img[alt=\"Tricentis Demo Web Shop\"]")
private WebElement title;
@FindBy(className = "ico-register")
private WebElement register_btn;
@FindBy(linkText = "Log in")
private WebElement login_btn;
@FindBy(className = "cart-label")
private WebElement shopping_cart;
@FindBy(css = "input[name=\"q\"]")
private WebElement search_field;
@FindBy(css = "input[value=\"Search\"]")

private WebElement click_searchBtn;
@FindBy(xpath = "//a[contains(text(),'Books')]")
private WebElement book;
@FindBy(xpath = "//a[contains(text(),'Computers')]")
private WebElement computer;
@FindBy(xpath = "//a[contains(text(),'Electronics')]")
private WebElement electronic;
@FindBy(xpath = "//a[contains(text(),'Apparel & Shoes')]")
private WebElement shoes;
@FindBy(xpath = "//a[contains(text(),'Digital downloads')]")
private WebElement digital_download;
@FindBy(xpath ="//a[contains(text(),'Jewelry')]")
private WebElement jwelary;
@FindBy(xpath = "//a[contains(text(),'Gift Cards')]")
private WebElement giftcard;
@FindBy(name = "NewsletterEmail")
private WebElement nwsteller;
@FindBy(id = "newsletter-subscribe-button")
private WebElement suscribe;
@FindBy(id = "pollanswers-1")
private WebElement excellent;
@FindBy(id ="pollanswers-2")
private WebElement good;
@FindBy(id = "pollanswers-4")
private WebElement poor;
@FindBy(id = "vote-poll-1")
private WebElement vote;
public void title() {
	title.click();
}
public void register() {
	register_btn.click();
}
public void shopingCart() {
	shopping_cart.click();
}
public void search_field(String data) {
	search_field.sendKeys(data);
}
public void searchBtnClick() {
	click_searchBtn.click();
}
public void book()  {
	book.click();
	}
public void computer()  {
	computer.click();
	}
public void electronic()  {
	electronic.click();
	}
public void shoes()  {
	shoes.click();
	}
public void digital()  {
	digital_download.click();
	}
public void jwelary()  {
	jwelary.click();
	}
public void nwsteller(String data)  {
	nwsteller.sendKeys(data);
	}
public void subscribe() {
	suscribe.click();
}
public void excellent() {
	excellent.click();
}
public void good() {
	good.click();
}
public void vote() {
	vote.click();
}
}



