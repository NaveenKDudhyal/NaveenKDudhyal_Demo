package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOM 
{
	WebDriver driver;
	Actions act;
	public HomePagePOM (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
	}
	
	@FindBy(xpath = "//th[@id='amount']")
	WebElement amount;
	public void amount()
	{
		act.click(amount).perform();
	}

}
