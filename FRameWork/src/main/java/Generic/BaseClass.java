package Generic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	@BeforeSuite
	public void  connectionDatabase() {
		System.out.println("data Base Connection");
	}
	@BeforeClass
	public void  launchBrowser() {
		System.out.println("Open Browser");
	}
	@BeforeMethod
	public void login() {
		System.out.println("Login Page ");
	}
	@AfterMethod
	public void  logout()
	{
		System.out.println("Logout page");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
	@AfterSuite
	public  void closeDB() {
		System.out.println("Close Data Base connection");
	}
	
}
