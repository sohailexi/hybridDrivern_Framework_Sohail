package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.PredefinedActions;

public class LoginPage extends PredefinedActions {
	public void login(String userName, String Password) {

		enterUsername(userName);
		enterPassword(Password);
		clickOnLogin();

	}

	public void enterUsername(String userName) {
		driver.findElement(By.id("txtUsername")).sendKeys(userName);

	}

	public void enterPassword(String Password) {
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
	}

	public void clickOnLogin() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	public boolean isUserNameErrorMessageDisplayed() {
		WebElement userNameErrorMessage=driver.findElement(By.cssSelector("#txtUsername-error"));
		return userNameErrorMessage.isDisplayed();
	}
	public boolean isPasswordErrorMessageDisplayed() {
		WebElement passwordErrorMessage=driver.findElement(By.cssSelector("#txtPassword-error"));
		return passwordErrorMessage.isDisplayed();
	}
	public boolean isLogoDisplayed() {
		WebElement logoDisplayed=driver.findElement(By.xpath("//div[@class='organization-logo shadow']//img"));
		return logoDisplayed.isDisplayed();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}

}
