package Parameterization;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Num_as_String{
public static void main(String[]args) throws Throwable {
	//Create object of Fileinputstream class
		FileInputStream fis =new FileInputStream("C:\\Users\\hp\\Documents\\practice..xlsx");
		//use create method to open excel sheet
		String value=WorkbookFactory.create(fis).getSheet("Sheet1").getRow(5).getCell(2).getStringCellValue();
		System.out.println(value);
	}
	

}

