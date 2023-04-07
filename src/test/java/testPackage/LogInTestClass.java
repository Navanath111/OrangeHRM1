package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomPackage1.LogInPage;
import testUtility.ReadFileData;

public class LogInTestClass extends BaseClass
{
	ReadFileData r;
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod of Class1");
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void VerifyLoginFunctionalityWithCorrectData() throws InterruptedException, EncryptedDocumentException, IOException
	{
		//logger=report.createTest("Verify login functionality correct data");
		LogInPage login = new LogInPage(driver);
		SoftAssert s = new SoftAssert();
		login.enterUsername("Admin");              
		login.enterUsername("admin123");
		login.ClickonLoginButton();
		Thread.sleep(2000);
		
		boolean result=login.CheckVisibilityofAdminTab();
		System.out.println("Soft assert is executed");
		Assert.assertTrue(result);//Pass
		System.out.println("Test Case is Ended");
	    s.assertAll();
	}
	
	@Test
	public static void verifyLoginFunctionalitiesWithInCorrectData ()
	{
		//logger=report.createTest("Verify login functionality incorrect data");
		System.out.println("verifyLoginFunctionalitiesWithCorrectData");	
		Assert.fail();		
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass");
	}	
}
