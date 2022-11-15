package First;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Max_min_Browser {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver ()	;
	driver.get("https://www.amazon.com/");
	//Maximize
	driver.manage().window().maximize();
	Thread.sleep(3000);
	//minimize
	driver.manage().window().minimize();
	//setsize
Dimension d=new Dimension (100,200);
driver.manage().window().setSize(d);
	//setPosition
Point p=new Point (300,400);
driver.manage().window().setPosition (p);
driver.manage().window().setPosition(p);	
}
}
