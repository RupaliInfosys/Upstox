package Screenshots;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Flipkart {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
//how to take screenshot
TakesScreenshot ts=(TakesScreenshot)driver;//typecast here
//use gets screenshot method and store in src
File src=ts.getScreenshotAs(OutputType.FILE);
//create folder where we need to store screenshot and give the path of folder with proper name and extension
File dest=new File("C:\\Users\\hp\\Desktop\\Flipkart.jpg");
//copy screenshot src to dest
Files.copy(src, dest);

}
}
