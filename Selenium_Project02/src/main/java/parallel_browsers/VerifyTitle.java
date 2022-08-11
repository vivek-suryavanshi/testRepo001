package parallel_browsers;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitle {

	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void verifyPageTitle(String browserName) throws InterruptedException
	{
		if(browserName.equalsIgnoreCase("Chrome"))
		{	WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}
		
		else if (browserName.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://testphp.vulnweb.com/login.php");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
			
	}
	
	

}