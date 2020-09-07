package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonFunctions.BaseClass;

public class AddPromise extends BaseClass  {
	
	public AddPromise() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='Log Promise']")
	private WebElement loglink;
	@FindBy(xpath="//select[@name='cboEmp']")
	private WebElement sonalitest;
	@FindBy(id="txtPromise")
	private WebElement promise;
	@FindBy(xpath="//input[@type='Submit']")
	private WebElement logon;
	
	
	

	public WebElement getLoglink() {
		return loglink;
	}
	public WebElement getSonalitest() {
		return sonalitest;
	}
	public WebElement getPromise() {
		return promise;
	}
	public WebElement getLogon() {
		return logon;
	}
	
	}
	
	
	

