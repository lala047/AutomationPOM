package utility;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Helper {
	
	public static WebDriver driver;
	
	public static Wait<WebDriver> wait;
	
	public Helper(WebDriver driver)
	{
		this.driver = driver;
		
		wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
	}
	
	protected static WebElement getElementById(String ElementLocator)
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(ElementLocator)));
	}
	
	protected static WebElement getElementByName(String ElementLocator)
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(ElementLocator)));
	}
	
	protected static WebElement getElementByXpath(String ElementLocator)
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ElementLocator)));
	}
	
	protected static WebElement getElementByCss(String ElementLocator)
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(ElementLocator)));
	}
	
	protected static WebElement getElementByClassName(String ElementLocator)
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(ElementLocator)));
	}

}
