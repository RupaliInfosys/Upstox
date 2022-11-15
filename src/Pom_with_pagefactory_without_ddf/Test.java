package Pom_with_pagefactory_without_ddf;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com/login.do");
	//Object 1st
	Loginpage l= new Loginpage(driver);
	l.enterUN();
	l.enterPWD();
	l.clickLoginBtn();
	//object 2nd
	Homepage h=new Homepage(driver);
	h.verifytext();
}
}
