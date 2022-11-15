package Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args)throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver ();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	//maximize the browser
	driver.manage().window().maximize();
	//switch to first frame
	driver.switchTo().frame("packageListFrame");
	//take any element on first frame and print it
	String text1=driver.findElement(By.xpath("//a[text(='org.openqa.selenium.cli']")).getText();
	System.out.println(text1);
	//now we need to switch from 1st frame to main webpage
	driver.switchTo().defaultContent();//now we came to main webpage
	//switch to 2nd frame
	Thread.sleep(4000);
	driver.switchTo().frame("packageframe");
	
	//take any element on 2nd frame and print it
	Thread.sleep(4000);
	String text2=driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).getText();
	Thread.sleep(4000);
	System.out.println(text2);
	//go to 3rd frame'
	driver.switchTo().defaultContent();
	driver.switchTo().frame("classframe");
//take any element and print
	String text3=driver.findElement(By.xpath("//span[text()='interface Summary']")).getText();
	System.out.println(text3);
	
	
	
	
}
}
