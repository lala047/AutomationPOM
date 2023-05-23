package process;

import org.openqa.selenium.WebDriver;

import pageobject.LoginPage;
import utility.Helper;

public class LoginProcess extends Helper{
	
	LoginPage lp  = new LoginPage(driver);

	public LoginProcess(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void CorrectValidateLoginDetails()
	{
		lp.AcceptCookies().click();
		lp.EmailIdBox().sendKeys("abc@gmail.com");
		lp.PasswordTextBox().sendKeys("12345566");
		lp.LoginButton().click();
	}
	public void ValidUserNameandInvalidPassword()
	{
		lp.EmailIdBox().sendKeys("abc@gmail.com");
		lp.PasswordTextBox().sendKeys("12344445566");
		lp.LoginButton().click();
	}

}
