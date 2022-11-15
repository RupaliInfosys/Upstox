package Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_popup {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	
	//create object of browser setting class
ChromeOptions c= new ChromeOptions();
c.addArguments("--disable-notifications");
Thread.sleep(3000);
c.addArguments("start-maximized");
//open the browser
WebDriver driver=new ChromeDriver();
Thread.sleep(4000);
driver.get("https://www.hdfcbank.com/");
driver.manage().window().maximize();
driver.get("https://www.hdfcbank.com/");
}

}
