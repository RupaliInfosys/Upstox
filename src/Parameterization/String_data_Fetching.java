package Parameterization;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;



public class String_data_Fetching {
public static void main(String[] args) throws Throwable{
	//create the object of FileinputStream class
	FileInputStream fis=new FileInputStream("C:\\Users\\hp\\Downloads\\practice.xlsx");
	//use create method to open excel sheet
	String value=WorkbookFactory.create(fis).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	
	System.out.println(value);

}
}