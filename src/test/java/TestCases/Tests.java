package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;


import commonFunctions.BaseClass;
import locators.Login;
import locators.SearchScreen;
import locators.AddPromise;

public class Tests extends BaseClass {
  @Test(priority=1)
  public void blankFieldValidation() {
	  Login l = new Login();
	  click(l.getEnter());
	  String value = getValue(l.geterrormesg());
	  Assert.assertEquals("Invalid Username/password", value);
	  
	  
  }
  @Test(priority=2)
  public void login() {
	  Login l = new Login();
	  sendkeys(l.getUsername(), "sanjeetk@clariontechnologies.co.in");
	  sendkeys(l.getPassword(), "clarion");
	  click(l.getEnter());
	  
	  
  }
  @Test(priority=3)
  public void addPromise() {
	  AddPromise p = new AddPromise();
	  click(p.getLoglink());
	  dropDown(p.getSonalitest(), "Sonali test");
	  sendkeys(p.getPromise(), "Promise11aa");
	  click(p.getLogon());
	  
  }
  @Test(priority=4)
  public void verifyPromise() throws Exception {
	  SearchScreen s = new SearchScreen();
	  dropDown(s.getSearch_sonalitest(), "Sonali test");
	  click(s.getClicksearch());
	
  }
  @Test(priority=5)
  public void logout() {
	  SearchScreen s = new SearchScreen();
	  click(s.getLoggoff());
	  
	  
  }
}
