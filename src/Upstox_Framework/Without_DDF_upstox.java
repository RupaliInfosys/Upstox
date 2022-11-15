package Upstox_Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_DDF_upstox {
public static void main(String[] args) {
	//set properties
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
//implicit wait
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//delete all coockies
driver.manage().deleteAllCookies();
//maximize the browser
driver.manage().window().maximize();
//open the apln
driver.get("https://login-v2.upstox.com/");
//enter username
driver.findElement(By.xpath("//input[@id='userCode']")).sendKeys("2QALQX");
}
}
