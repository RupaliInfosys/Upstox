package Dynmaic_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_for_India {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
    WebDriver driver=new ChromeDriver();
	
    driver.get("https://www.worldometers.info/coronavirus/country/india/");
    
  //print active Cases
    String s=driver.findElement(By.xpath("(//div[@class=\"maincounter-number\"])[1]")).getText();
    System.out.println(s);
    //print death cases
    String a=driver.findElement(By.xpath("(//div[@class='maincounter-number'])[2]")).getText();
    System.out.println(a); 
}
}
