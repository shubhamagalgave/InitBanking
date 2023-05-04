
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void Excel() throws IOException {
   FileInputStream fis = new FileInputStream(".src\\test\\resources\\Excel\\Automation.xlsx");
   
   Workbook workbook = new XSSFWorkbook(fis);
  int sheetCount= workbook.getNumberOfSheets();
   
   //Sheet Sheet = workbook.getSheet("sheet1");
  // int rowCount =  Sheet.getLastRowNum();
  // System.out.println(rowCount);
 //  Row row = Sheet.getRow(1);
  // int r=Sheet.getFirstRowNum();
  }
}
