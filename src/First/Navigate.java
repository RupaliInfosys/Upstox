package First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
public static void main(String[] args) throws Throwable{
System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
Thread.sleep(5000);
driver.get("https://mail.google.com/mail/u/0/#inbox");
Thread.sleep(4000);
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
driver.navigate().refresh();
}
}
