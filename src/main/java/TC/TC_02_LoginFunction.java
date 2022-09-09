package TC;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;




public class TC_02_LoginFunction extends TC_BASE
{
	@Test
	public void loginFunction() throws IOException
	{
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys("NaveenDudhyal");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("danceislife");
		
		WebElement log = driver.findElement(By.xpath("//button[@id='log-in']"));
		log.click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File SFile = ts.getScreenshotAs(OutputType.FILE);
		File DFile = new File("F:\\JAVA Program\\NaveenK_DEMO\\ScreenShots\\HomePage.jpg");
		FileHandler.copy(SFile, DFile);
		
		String Expectedtext = "DEMO";
		String Actualtext = driver.findElement(By.xpath("")).getText();
		
		Assert.assertEquals(Actualtext, Expectedtext);
	}

}
