package Dynmaic_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
public static void main(String[] args) throws Throwable{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	driver.get("https://www.amazon.com/");
	//click on dont change
	driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]")).click();
	//search for mobiles
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles under 10000",Keys.ENTER);
	Thread.sleep(3000);
	//print price 1st mob
	String price=driver.findElement(By.xpath("(//span[@class='a-price'])[1]")).getText();
	System.out.println(price);
	//Click on mob
	driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
//add to cart
	driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	//proceed to checkout
	driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
	
}
}
