package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login {
    
	@FindBy(id = "email")
	private WebElement username;
	
	@FindBy(id = "pass")
	private WebElement userpwd;
	@FindBy(name="login")
	private WebElement click;
	
	public Login(WebDriver driver) {
	 PageFactory.initElements(driver, this); 
	}
	
	public void setterloging(String user,String pwd) {
		username.sendKeys(user);
		userpwd.sendKeys(pwd);
	}
	
}
