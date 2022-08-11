package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File src = new File("/Users/vivek/eclipse-workspace/Selenium_project02/test-data/TestData.xlsx");
		
		FileInputStream fis  = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1= wb.getSheetAt(0);
		
		//String data0= sheet1.getRow(0).getCell(0).getStringCellValue();
		
		//System.out.println("Data from excel is : " + data0);
		
		sheet1.getRow(0).createCell(2).setCellValue("Pass");
		
		FileOutputStream fout= new FileOutputStream(src);
		
		wb.write(fout);
		
				
				
		
		
		
		int rowcount = sheet1.getLastRowNum();
		
		System.out.println("Total Row is :" + (rowcount+1));
		
		for (int i=0; i<=rowcount; i++)
		{
			String data0= sheet1.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println("Data from row "+i+" is " + data0);
			
		}
		
		wb.close();
		
		

	}

}
