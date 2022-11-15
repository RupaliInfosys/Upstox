package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_div {
public static void main(String[] args)throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver ();
	driver.get("https://www.flipkart.com");
	//click on cancel button of popup

	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(4000);
	
}
}
