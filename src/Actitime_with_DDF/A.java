package Actitime_with_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) throws Throwable {
	//excel fetching
	FileInputStream fis= new FileInputStream("C:\\Users\\hp\\Downloads\\actitime.xlsx");
	Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
	//set the propeties
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	//Enter UN
	String UN = sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(UN);
	//Enter PWD
	String PWD=sh.getRow(0).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(PWD);
	//click
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	//verify the text
	String expText = sh.getRow(0).getCell(2).getStringCellValue();
String actText=driver.findElement(By.xpath("//td[text()='Enter Time-Track']")).getText();
if(actText.equals(expText)){
	
	System.out.println("TC is pass");
	
}
else {
	System.out.println("Tc is fail");
}

}
}


