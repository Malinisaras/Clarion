package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonFunctions.BaseClass;

public class Login extends BaseClass {
	
	public Login() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(className="input_box")
	private WebElement username;
	@FindBy(xpath="//input[@type='text']")
	private WebElement password;
	@FindBy(xpath="//input[@type='Submit']")
	private WebElement enter;
	@FindBy(xpath="//font[text()='Invalid Username/password']")
	private WebElement errormesg;
	
	
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getEnter() {
		return enter;
	}
	public WebElement geterrormesg() {
		return errormesg;
	}
	

}
