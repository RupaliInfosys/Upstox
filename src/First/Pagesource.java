package First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe")	;
WebDriver driver= new ChromeDriver();
driver.get("https://www.amazon.in/");
//pageSource
String allelements=driver.getPageSource();
System.out.println(allelements);	
String title=driver.getTitle();
System.out.println(title);

}
}