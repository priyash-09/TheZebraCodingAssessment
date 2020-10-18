package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {


public WebDriver driver;
	
	By zipcode=By.xpath("//div[@class='input-wrapper']//input");
	By submit = By.xpath("//div[@class='input-group-append']//button");
	
By carRadioButton =By.xpath("//label[@data-track-label='Car insurance']//span");
	
	By header = By.xpath("//body/div[3]/div/h1");
	
	
	By links		= By.tagName("a");
	By headline =By.xpath("//span[contains(text(),'Compare')]");
	
	
	public  HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}


	public WebElement zipCode()
	{
		return driver.findElement(zipcode);
	}
	
	public WebElement submit()
	{
		
		return driver.findElement(submit);
		
	}
	
	public WebElement carRadioButton()
	{
		return driver.findElement(carRadioButton);
	}
	
	public WebElement header()
	{
		return driver.findElement(header);
	}
	
	public WebElement links()
	{
		return driver.findElement(links);
	}
	
	
	
	public WebElement headline()
	{
		return driver.findElement(headline);
	}
}
