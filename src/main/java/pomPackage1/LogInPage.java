package pomPackage1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage 
{   
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(xpath="//span[contains(.,'Admin')]")
	private WebElement Admin;

	public LogInPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}

	public void enterUsername(String sendUsername)
	{
		username.sendKeys(sendUsername);
	}
	
	public void enterPassword(String sendPassword)
	{
		password.sendKeys(sendPassword);
	}
	
	public void ClickonLoginButton()
	{
		loginButton.click();
	}
	
	public void handleAlert()
	{
		driver.switchTo().alert();
	}
	
	public void userClick() 
	{
	    username.sendKeys(Keys.DOWN);
		
	}
	public void enterUsername1(String fetchDataFromExcel) 
	{
		// TODO Auto-generated method stub
	}
	public void clickonSelect() 
	{	
		//adminSelect.sendKeys(Keys.ENTER);		
		//adminSelect.click();	
	}
	public boolean CheckVisibilityofAdminTab() 
	{
		// TODO Auto-generated method stub
		return false;
	}

}
