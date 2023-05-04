package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataDrivenTest {
	@Test
	public void getSheetCount() throws IOException
	{
		FileInputStream file = new FileInputStream(".\\TestData\\Automation.xlsx");
		
		Workbook workbook = new XSSFWorkbook(file);
		
		int sheetCount = workbook.getNumberOfSheets();
		
		System.out.println(sheetCount);
		
	}

}
