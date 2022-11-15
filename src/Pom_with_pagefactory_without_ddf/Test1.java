package Pom_with_pagefactory_without_ddf;


	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class Test1 {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Ankush\\\\Downloads\\\\chromedriver_win32 (11)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		//object 1st 
		LoginPage1 l=new LoginPage1(driver);
		l.enterUN();
		l.enterPWD();
		l.clickLoginBtn();
		//object 2nd
		HomePage1 h=new HomePage1(driver);
		h.verifytext();
		
	}
		
}

