package TC;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class TC_03_AmountFunction extends TC_BASE
{
	@Test
	public void amountFunction()
	{
		WebElement amount = driver.findElement(By.xpath("//th[@id='amount']"));
		amount.click();
		
	    ((JavascriptExecutor)driver).executeScript("scroll(0,200)");
	    
		
		System.out.println("Clicked On AmountFunction");
		
	} 

}
