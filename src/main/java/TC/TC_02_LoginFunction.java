package TC;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM.LoginPagePOM;



public class TC_02_LoginFunction extends TC_BASE
{
	@Test
	public void loginFunction() throws IOException
	{
		LoginPagePOM hp = new LoginPagePOM(driver);
		hp.user();
		hp.pass();
		hp.log();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File SFile = ts.getScreenshotAs(OutputType.FILE);
		File DFile = new File("F:\\JAVA Program\\NaveenK_DEMO\\ScreenShots\\HomePage.jpg");
		FileHandler.copy(SFile, DFile);
		
		String Expectedtext = "DEMO";
		String Actualtext = driver.findElement(By.xpath("")).getText();
		
		Assert.assertEquals(Actualtext, Expectedtext);
	}

}
