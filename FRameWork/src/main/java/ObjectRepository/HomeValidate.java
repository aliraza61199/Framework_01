package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeValidate {
    
	@FindBy(xpath="//a[text()='Create a Page']")
	private WebElement Create;
	
	public HomeValidate(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	public String create() {
	
		String create=Create.getText();
		return create;
	}
}
