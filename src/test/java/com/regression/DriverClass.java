package com.regression;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;



public class DriverClass {
	
	WebDriver driver;
	Properties prop = new Properties();
	
	@BeforeClass
	public void Initalization() throws IOException
	{
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Properties\\config.properties");
		prop.load(fis);
		ChromeOptions option = new ChromeOptions();
       option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver(option);
		
		driver.get(prop.getProperty("QA_Url"));
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath(prop.getProperty("Allow_Button"))).click();
		
		
		
		
	}
	
	@AfterClass
	public void CleanUp()
	{
		driver.quit();
	}

}
