package ExcelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoTest1 {

	public static void main(String[] args) throws IOException  {
	
		String epath =".//dataFolder//Automation.xlsx";
		FileInputStream inputStream =new FileInputStream(epath);
		XSSFWorkbook workbook10 = new XSSFWorkbook(inputStream);
		Sheet sheet =workbook10.getSheet("Sheet1");
	
		int sheetCount = sheet.getLastRowNum();
		System.out.println(sheetCount);
		
		Row row =sheet.getRow(1);
		
		//int cellCount = row.getLastCellNum();
	//	System.out.println(cellCount);
		
	//	Cell cell=row.getCell(1);
		//get cell value frome cell
		
	//	String cellValue = cell.getStringCellValue();
	//	System.out.println(cellValue);
		
		//for(int i=0;i<=cellCount;i++)
	//	{
	//		 	System.out.println(row.getCell(i).getStringCellValue());
	//	}
		
		
		
		row.createCell(4).setCellValue("Success");
		FileOutputStream outputStream = new FileOutputStream(epath);
		
		workbook10.write(outputStream);
		outputStream.flush();
		
		outputStream.close();
		
		System.out.println("Update Excell");
		
		
		
		

	}

}
