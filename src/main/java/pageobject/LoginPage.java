package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Helper;

public class LoginPage extends Helper {
	
	public WebElement element = null;
	
	public static final String EmailId_TextBoxName="email";
	
	public static final String Password_TextBoxName="pass";
	
	public static final String LoginButtonName="login";
	
	public static final String AcceptCookies="//button[@data-cookiebanner='accept_button']";
	
	

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement AcceptCookies()
	{
		element = getElementByXpath(AcceptCookies);
		return element;
	}
	public WebElement EmailIdBox()
	{
		element = getElementByName(EmailId_TextBoxName);
		return element;
	}
	
	public WebElement PasswordTextBox()
	{
		element = getElementByName(Password_TextBoxName);
		return element;
	}
	
	public WebElement LoginButton()
	{
		element = getElementByName(LoginButtonName);
		return element;
	}
	
	

}
