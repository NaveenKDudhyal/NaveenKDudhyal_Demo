package TC;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_01_LunckingWebSite extends TC_BASE
{ 
	@Test
	public void lunckingWebSite()
	{
		System.out.println("Lunched");
		
		String Etitle = "Demo App";
		String Atitle = driver.getTitle();
	
		Assert.assertEquals(Atitle, Etitle);
	}

}
