package ReadExcelData;

public class ReadExcelFileData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExcelDataConfig excel=new ExcelDataConfig("/Users/vivek/eclipse-workspace/Selenium_project02/test-data/TestData.xlsx");
		
		System.out.println(excel.getData(1, 0, 1));
		
		
	}

}
