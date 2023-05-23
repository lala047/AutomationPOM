package com.regression;

import org.testng.annotations.Test;

import process.LoginProcess;

public class LoginTest extends DriverClass{
	
	LoginProcess lp;
	
	
	
	@Test
	
	public void ValidateLoginPagewithCorrectDetails()
	{
		 lp = new LoginProcess(driver);
		 lp.CorrectValidateLoginDetails();
		
		
	}

}
