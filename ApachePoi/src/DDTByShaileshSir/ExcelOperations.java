package DDTByShaileshSir;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations {

	public static void main(String[] args) throws IOException, InterruptedException {
		/**
		 * 1. Get sheet count 2. All sheet name 3. Add new sheet 4. Delete existing
		 * sheet
		 * 
		 * @throws IOException
		 */
		/* Identify the path and name of excel file */

		FileInputStream fl = new FileInputStream(".\\dataFolder\\Automation.xlsx");
		/* Create an instance of required workbook class */
		Workbook workbook=new XSSFWorkbook(fl);
		/* Perform required operation on sheet */
		/**
		 * 1. get sheet count
		 */
		int sheetCount = workbook.getNumberOfSheets();
		System.out.println(sheetCount);
		/**
		 * 2. get sheet names
		 */
		for(int i=0;i<sheetCount;i++)
		{
			System.out.println(workbook.getSheetName(i));
		}
		/**
		 * 3. create new sheet
		 */
		Thread.sleep(2000);
		workbook.createSheet("TestSheet");
		/**
		 * 4. Delete sheet
		 */
		//workbook.removeSheetAt(3);


		


		

	}

}
