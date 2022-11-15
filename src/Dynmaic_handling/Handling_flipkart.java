package Dynmaic_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_flipkart {
	public static void main(String[] args)throws Throwable {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	driver.get("https://www.flipkart.com/");
	//click on cancel button
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	//serach for mobiles
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles under 20000",Keys.ENTER);
		//print the price of first mobile
		String price=driver.findElement(By.xpath("(//div[@class='col col-5-12 nlI3QM']/descendant::div)[2]")).getText();
	System.out.println(price);
	//print rating and reviews
	String r = driver.findElement(By.xpath("(//span[@class='_2_R_DZ']/descendant::span)[1]")).getText();
System.out.println(r);	
}
}
