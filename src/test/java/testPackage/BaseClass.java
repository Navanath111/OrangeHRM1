package testPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import testUtility.Screenshot;
import testUtility.StaticBrowser;
public class BaseClass {
	
	static WebDriver driver;
	@Parameters({"browser"})
	@BeforeTest
	
	public void beforeTest(String browser)//for launching browser
	{	
		if(browser.equals("chrome"))
		{
			//WebDriverManager.chromedriver().setup();
			//driver=new ChromeDriver();
			//driver.manage().window().maximize();
			//driver.get("");
		
		WebDriver driver =StaticBrowser.openBrowser(browser, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	}
    @AfterMethod
	public void aftermethod(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Screenshot.CapturePageScreenshot(driver);
		}
	} 
    @AfterTest
     public void aftertest()
	{
		driver.quit();
	}
}
