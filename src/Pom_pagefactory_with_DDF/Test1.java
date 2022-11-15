package Pom_pagefactory_with_DDF;

    import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.time.Duration;

	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Test1 {
		public static void main(String[] args) throws Throwable {
			
		

		//Fetch the data from Excel sheet
				FileInputStream file=new FileInputStream("C:\\Users\\hp\\Downloads\\actitime.xlsx");
				//Navigate to sheet
			Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
			//Set the properties
				System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
						
				
				
				WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://demo.actitime.com/login.do");
				//1st object
				String username = sh.getRow(0).getCell(0).getStringCellValue();
				Login1page l1=new Login1page(driver);
				l1.enterUN(username);
				
				String password = sh.getRow(0).getCell(1).getStringCellValue();
				l1.enterPWD(password);
				
				l1.clickLoginBtn();
	           //2nd object
				String expText = sh.getRow(0).getCell(2).getStringCellValue();
				Home1page h=new Home1page(driver);
					h.verifytext(expText);

}
}