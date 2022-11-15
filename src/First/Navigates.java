package First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigates {
public static void main(String[] args) throws Throwable{
System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.co.in/");
Thread.sleep(3000);
driver.get("https://www.amazon.in/");
Thread.sleep(3000);
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
driver.navigate().refresh();




}
}
