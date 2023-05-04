package ExcelOperation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readingExcelFile {

	public static void main(String[] args) throws IOException {

		String excelFilePath =".\\dataFolder\\Automation.xlsx";
		
		FileInputStream inputStream=new FileInputStream(excelFilePath);
		
		XSSFWorkbook workbook1 = new XSSFWorkbook(inputStream);
		
		XSSFSheet sheet = workbook1.getSheetAt(0);
		int row =sheet.getLastRowNum();
		int col = sheet.getRow(1).getLastCellNum();
		
     	//System.out.println(row);
	  //  System.out.println(col);
		
		
		for(int r=0;r<=row;r++)
		{
			XSSFRow row1 = sheet.getRow(r);
			
			for(int c=0;c<=col;c++)
			{
			
				XSSFCell cell =  row1.getCell(c);
					
				switch(cell.getCellType())
				{
				case STRING:System.out.println(cell.getStringCellValue());break;
				case NUMERIC:System.out.println(cell.getNumericCellValue());break;
				case BOOLEAN:System.out.println(cell.getBooleanCellValue());break;
				}
				System.out.println(" ");
			}
			System.out.println();
		}
		

	}

}
