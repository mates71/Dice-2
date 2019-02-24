package faceBookPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#email")
	public WebElement emailId;
	
	@FindBy(css="#pass")
	public WebElement passId; 
	
	@FindBy(css="#u_0_r")
	public WebElement login;
	
	
	
}
