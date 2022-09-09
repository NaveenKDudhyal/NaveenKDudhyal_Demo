package TC;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import POM.HomePagePOM;
import POM.LoginPagePOM;

public class TC_03_AmountFunction extends TC_BASE
{
	@Test
	public void amountFunction()
	{
		LoginPagePOM lp = new LoginPagePOM(driver);
		lp.user();
		lp.pass();
		lp.log();
		
		HomePagePOM hp = new HomePagePOM(driver);
		hp.amount();
		
	    ((JavascriptExecutor)driver).executeScript("scroll(0,200)");
	    
		
		System.out.println("Clicked On AmountFunction");
		
	} 

}
