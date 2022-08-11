package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {

	//public static void main(String[] args) {
	//FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet1;

		
		public ExcelDataConfig(String excelPath)
		{
		
			try {
				File src = new File(excelPath); 
				FileInputStream fis  = new FileInputStream(src);
				
				 wb = new XSSFWorkbook(fis);
				 
				 
			
			} catch (Exception e) {
				System.out.println(e.getMessage());
				
			}
		}
		
		public String getData(int sheetnumber, int row, int column)
		{
			sheet1= wb.getSheetAt(sheetnumber);
		
			String data = sheet1.getRow(row).getCell(column).getStringCellValue();
			
			return data;
		}
	
		public int getRowCount(int sheetIndex)
		{
			int row = wb.getSheetAt(sheetIndex).getLastRowNum();
			
			row = row + 1;
			return row;
		}
}
