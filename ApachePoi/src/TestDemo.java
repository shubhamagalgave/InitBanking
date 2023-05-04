import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDemo {

	public static void main(String[] args) throws IOException {
		String epath = ".//dataFolder//Automation.xlsx";
		FileInputStream fm=new FileInputStream(epath);
		XSSFWorkbook work = new XSSFWorkbook(fm);
		Sheet sheet = work.getSheet("Sheet1");
		int sheetNum = sheet.getLastRowNum();
		System.out.println(sheetNum);
		
		Row row= sheet.getRow(1);
		int cellCount  = row.getLastCellNum();
		System.out.println(cellCount);
		Cell cell = row.getCell(1);
		String cellValue = cell.getStringCellValue();
		System.out.println(cellValue);
		for(int i=0;i<cellCount;i++)
		{
			System.out.println(row.getCell(i).getStringCellValue());
		}
		row.createCell(4).setCellValue("Success");
		
		FileOutputStream ostream = new FileOutputStream(epath);
		work.write(ostream);
		ostream.flush();
		ostream.close();
		
		System.out.println("Update Excell");
		
		
		
		
	}
	

}
