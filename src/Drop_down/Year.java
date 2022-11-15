package Drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Year {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//click on the create an account button
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	//select DD which we need to handle
	Thread.sleep(4000);
	//store list box in refrence variable
	WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
	//create an object of select class
	Select s=new Select(year);
	//select by text
	//s.selectByVisibleText("1998");
	//select by value
	//s.selectByValue("1998");
	//select by index
	s.selectByIndex(24);
	

}
}
