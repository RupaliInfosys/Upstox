package Multibrowsing;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;
	public class B {
		WebDriver driver=null;//runtime polymorphism
		
		@Parameters("browsername")//annotation
		@Test
		public void TC(String browsername) {//paramerized method
				
			
				if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			 driver=new ChromeDriver();
			
		}
				else if(browsername.equals("firefox")) {
					System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
					 driver=new FirefoxDriver();
					 
				}
				driver.get("https://www.amazon.com");//globally
				
		
	}
}
