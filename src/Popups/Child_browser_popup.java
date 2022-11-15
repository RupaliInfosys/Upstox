package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browser_popup {
public static void main(String[] args) throws Throwable{
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver ();
	//open the application
	driver.get("https://www.flipkart.com/");
	//click on cancel button
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	
	Thread.sleep(3000);
	//search for mobiles
	driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
	//by default selenium control ids on main window we need take all windows
	
	Thread.sleep(3000);
	Set<String>allwindows=driver.getWindowHandles();
	driver.getWindowHandles();
	//using arraylist we can store all windows sequentially
	Thread.sleep(4000);
	ArrayList<String>al=new ArrayList<String>(allwindows);
	//i want to print address of main window
	String mainwin=al.get(0);
	Thread.sleep(3000);
	System.out.println(mainwin);
	////i want to print session id of child window
	String childwin=al.get(1);
	System.out.println(childwin);
	
	
	

	
}
}
