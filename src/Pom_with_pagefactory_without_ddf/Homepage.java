package Pom_with_pagefactory_without_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
@FindBy(xpath="//td[text()='Enter Time-Track']")private WebElement text;
public Homepage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void verifytext() {
	String expText="Enter Time-Track";
	String actText=text.getText();
	if(actText.equals(expText)) {
		System.out.println("TC is pass");
	}
	else {
		System.out.println("Tc is fail");
	}
}
}
