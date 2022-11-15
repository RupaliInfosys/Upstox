package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {
public static void main(String[] args)throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver ();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	//enter customer id
	Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456",Keys.ENTER);
Thread.sleep(4000);
//use alert interface
Alert alt=driver.switchTo().alert();
//want to click on the ok button
alt.accept();//automatically ok button will be clicked
//click on cancel button
alt.dismiss();
//get text on popup
String text =alt.getText();
System.out.println(text);


}
}
