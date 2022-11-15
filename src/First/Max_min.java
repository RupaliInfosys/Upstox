package First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Max_min {
public static void main(String[] args) throws Throwable{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://www.google.co.in/");
//maximize the browser
driver.manage().window().maximize();
Thread.sleep(5000);
driver.manage().window().minimize();
Thread.sleep(4000);
}
}
;