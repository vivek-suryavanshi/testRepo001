package ReadExcelData;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Lib.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDriven {
	

	
	WebDriver driver;
	
	@Test(dataProvider = "LoginData")
	public void dataMethod(String username, String password) throws Exception {
		
		//input[@name='uname']
		
		//input[@name='pass']
		
		//input[@value='login']
		
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//WebDriverManager.edgedriver().setup();
		//driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://testphp.vulnweb.com/login.php");
		
		Utility.captureScreenshot(driver, "website loaded");
		
		driver.findElement(By.xpath("//input[@name='uname']")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='login']")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		Assert.assertTrue(driver.getTitle().contains("user info"), "Unable to login, invalid credentials");
		
		
		//driver.quit();
		
		
	}
	
	@AfterMethod
	public void teardown()
	{
	driver.quit();	
	}
		@DataProvider(name="LoginData")
		public Object[][] passData(){
			
			///Users/vivek/eclipse-workspace/Selenium_project02
			ExcelDataConfig config = new ExcelDataConfig("./test-data/TestData.xlsx");
			
			/*Object[][] data = new Object[2][2];
			data[0][0]= "test1";
			data[0][1]= "test";
			
			data[1][0]= "test";
			data[1][1]= "test";
			
			return data;*/
			
			int Rows = config.getRowCount(0);
			
			Object[][] data = new Object[Rows][2];
			for(int i =0; i<Rows; i++)
			{
				data[i][0] = config.getData(0, i, 0);
				data[i][1] = config.getData(0, i, 1);
			}
			
			return data;
			
			
		}
		
		
		
	
	
	
	
}
