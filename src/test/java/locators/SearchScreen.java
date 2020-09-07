package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonFunctions.BaseClass;

public class SearchScreen extends BaseClass{
	public SearchScreen() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//font[text()='Promise added successfully']")
	private WebElement added;
	@FindBy(xpath="//select[@name='cboEmp']")
	private WebElement search_sonalitest;
	@FindBy(xpath="(//a[@class='lightgrey'])[3]")
	private WebElement loggoff;
	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement clicksearch;
	
	public WebElement getadded() {
		return added;
	}
	public WebElement getSearch_sonalitest() {
		return search_sonalitest;
	}
	public WebElement getClicksearch() {
		return clicksearch;
	}
	public WebElement getLoggoff() {
		return loggoff;
}
}
