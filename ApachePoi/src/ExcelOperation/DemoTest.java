package ExcelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoTest {

	public static void main(String[] args) throws IOException   {
		String epath =".//dataFolder//Automation.xlsx";
		FileInputStream inputStream =new FileInputStream(epath);
		
		XSSFWorkbook workbook1 = new XSSFWorkbook(inputStream);
		
		int sheet = workbook1.getNumberOfSheets();
		//System.out.println(sheet);
		
		for(int i=0;i<=sheet;i++)
		{
			System.out.println(workbook1.getSheetName(i));
			
		}

	}

}
