package Screenshots;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot_of_particular_element {
public static void main(String[] args) throws Throwable{
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
//find particular element and store in ref variable
  WebElement particular=driver .findElement(By.xpath("//img[@class='lnXdpd']"));
  File src=particular.getScreenshotAs(OutputType.FILE);
  File dest=new File("C:\\Users\\hp\\Desktop\\logo.jpg");
  Files.copy(src, dest);

}
}
