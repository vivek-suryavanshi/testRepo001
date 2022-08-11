package Test01;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitle {

	WebDriver driver;
	
	@Test
	
	public void testerw3() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://testphp.vulnweb.com/login.php");
		
		String get_title=driver.getTitle();
		
		String title="login page";
		
		//assert.assertTrue((get_title==title), "Title doeest match");
		
		AssertJUnit.assertEquals(get_title, title);
		System.out.println("Title matches, test case passed");
		
		driver.quit();
	}
		@Test
		
		public void tester22() {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		
			
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("http://testphp.vulnweb.com/login.php");
			
			String get_title=driver.getTitle();
			
			String title="login page";
			
			//assert.assertTrue((get_title==title), "Title doeest match");
			
			AssertJUnit.assertEquals(get_title, title);
			System.out.println("Title matches, test case passed");
			
			driver.quit();
				
			
	}
	
	
}
