package FrameWork;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDataFromProperties_File {

	public static void main(String[] args) throws Throwable {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		//NormalApproach
	/*	driver.get("https://www.saucedemo.com/v1/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    driver.findElement(By.name("password")).sendKeys("secret_sauce");
	    driver.findElement(By.className("btn_action")).click();*/
		
	 //step:-connect the file to the testscript
	//FileInputStream fis = new FileInputStream("C:\\Users\\Shobha\\Downloads\\Properties_File2pm.properties");
	
    FileInputStream fis = new FileInputStream("./Properties_File2pm.properties");
	Properties pro = new Properties();
	pro.load(fis);
	String URL = pro.getProperty("url");
	String USERNAME = pro.getProperty("username");
	String PASSWORD = pro.getProperty("password");
	
	driver.get(URL);
	driver.findElement(By.id("user-name")).sendKeys(USERNAME);
	driver.findElement(By.name("password")).sendKeys(PASSWORD);
	driver.findElement(By.className("btn_action")).click();
	
	}

}
