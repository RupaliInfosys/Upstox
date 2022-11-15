package Pom_with_pagefactory_without_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
//declaration
	@FindBy(xpath="//input[@id='username")private RemoteWebElement UN;
	@FindBy(xpath="//input[@name='pwd'")private RemoteWebElement PWD;
	@FindBy(xpath="//div[text()='Login '")private RemoteWebElement loginBTN;
	//Initialization
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void enterUN() {
		UN.sendKeys("admin");
	}
	public void enterPWD() {
		PWD.sendKeys("manager");
	}
	public void clickLoginBtn() {
		loginBTN.click();
	}
}
