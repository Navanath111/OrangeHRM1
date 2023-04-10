package pomPackage1;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class HomePage 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver(); 
	    driver.manage().window().maximize();	  
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 
	    LogInPage login = new LogInPage(driver);
			            login.enterUsername("Admin");
			            login.enterPassword("admin123");
			            login.ClickonLoginButton();
			            
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.quit();
		
    }
}
