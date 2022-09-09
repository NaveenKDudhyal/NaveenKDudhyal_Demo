package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM 
{
	WebDriver driver;
	public LoginPagePOM (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='username']")
	WebElement user;
	public void user()
	{
		user.sendKeys("naveendudhyal777@gmail.com");
	}
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement pass;
	public void pass()
	{
		pass.sendKeys("Danceislife66");
	}
	
	@FindBy(xpath = "//button[@id='log-in']")
	WebElement log;
	public void log()
	{
		log.click();
	}
	
	

}
