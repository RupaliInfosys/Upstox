package Multibrowsing;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class firefox {
	@Test
	public void TC1() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\Downloads\\Firefox Installer.exe");
	WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in");
	}
	}

