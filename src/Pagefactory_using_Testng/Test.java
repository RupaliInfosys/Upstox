package Pagefactory_using_Testng;
   import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.time.Duration;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.Reporter;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;

	public class Test {
		//globally declare some values
		Sheet sh;
		WebDriver driver;
		LoginPage lp;
		HomePage hp;
		
		@BeforeClass
		public void  openBrowser() throws Throwable {
			FileInputStream fis=new FileInputStream("C:\\Users\\hp\\Downloads\\actitime.xlsx");
			 sh = WorkbookFactory.create(fis).getSheet("Sheet1");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demo.actitime.com/login.do");
			//all objects
			 lp=new LoginPage(driver);
			 hp=new HomePage(driver);
		}
		@BeforeMethod
		public void openApp(){
			//enter UN
			String username = sh.getRow(0).getCell(0).getStringCellValue();
			lp.enterUN(username);
			//enter PWD
			String password = sh.getRow(0).getCell(1).getStringCellValue();
			lp.enterPWD(password);
			//click Login Btn
			lp.clickLoginBtn();
		}
		@org.testng.annotations.Test
		public void verifyText() {
			Reporter.log("running VerifyText",true);
			String expText = sh.getRow(0).getCell(2).getStringCellValue();
			String actText=hp.verifyText();
			Assert.assertEquals(expText,actText,"Failed both are different");
		}
		@AfterMethod
		public void closeApp() {
			Reporter.log("logout from app",true);
		}
		@AfterClass
		public void closeBrow() {
			Reporter.log("close the browser",true);
		}
		
		
		

	
	
	
	}

