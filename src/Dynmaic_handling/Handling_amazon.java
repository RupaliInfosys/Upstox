package Dynmaic_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_amazon {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	driver.get("https://www.amazon.com/");
	//handle popup
	driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]")).click();
	//search for iphone
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone mobiles under 50000",Keys.ENTER);
	//print 1st mobile price
	String price=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none a-spacing-top-small s-price-instructions-style'])[1]")).getText();
	System.out.println(price);
	//click on iphone
	driver.findElement(By.xpath("")).click();
	
}
}
