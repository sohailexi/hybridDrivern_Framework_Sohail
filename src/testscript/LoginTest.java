package testscript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.PredefinedActions;
import pages.LoginPage;

public class LoginTest {
	WebDriver driver;

	@Test
	public void TC1() {
		System.out.println("Launch Orange HRM");
		PredefinedActions.start("https://smujawar-trials77.orangehrmlive.com/");
		
		System.out.println("Login to Orange HRM");
		LoginPage loginpage = new LoginPage();
		loginpage.login("Admin", "nXYH3A4pg@");
		
		System.out.println("Verify Home Page is Displayed");
		String actual=loginpage.getPageTitle();
		String expected="Employee Management";
		
		Assert.assertEquals("actual", "expected","Incorrect Title");
		
		PredefinedActions.close();

	}

}
