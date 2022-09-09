package TC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TC_BASE 
{
	public WebDriver driver;
	
	@BeforeTest
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA NOTES\\chromedriver_win32\\New folder\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://sakshingp.github.io/assignment/login.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
