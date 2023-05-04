package DDTByShaileshSir;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcellReadByYouTube {
  @Test
  public void ExcelRead() throws IOException {
	  String epath=".\\dataFolder\\Automation.xlsx";
	  FileInputStream inputstream =new FileInputStream(epath);
	  
	  XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
	  
	  Sheet sheet=workbook.getSheetAt(0);
	  String value = sheet.getRow(1).getCell(1).getStringCellValue();
	  System.out.println(value);
  
	  
	  
	  
  }
}
