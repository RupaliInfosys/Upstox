package Parameterization;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Numeric_data {
public static void main(String[] args) throws Throwable{
	//Create object of Fileinputstream class
	FileInputStream fis =new FileInputStream("C:\\Users\\hp\\Downloads\\practice.xlsx");
	//use create method to open excel sheet
	double value=WorkbookFactory.create(fis).getSheet("Sheet1").getRow(5).getCell(2).getNumericCellValue();
	System.out.println(value);
}
}
