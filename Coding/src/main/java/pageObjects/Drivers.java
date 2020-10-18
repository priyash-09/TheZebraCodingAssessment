package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Drivers {

	public WebDriver driver;

	By gender = By.xpath("//span[contains(text(),'Male')]");
	By maritalStatus = By.xpath("//span[contains(text(),'Single')]");
	By credit = By.xpath("//span[contains(text(),'Excellent (720+)')]");
	By education = By.xpath("//span[contains(text(),'No diploma')]");
	By accidents = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[1]/div[1]/div[2]/label[2]/div[1]");
	By email =By.xpath("//input[@name='email']");
	//By discounts = By.xpath("//span[contains(text(),'Male')]");
	//By hearAboutUs = By.xpath("//span[contains(text(),'Male')]");
	//By anotherDriver = By.xpath("//span[contains(text(),'Male')]");
	By quotes = By.xpath("//span[contains(text(),'Show my quotes')]");
	
	public Drivers(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
		
	}

	public WebElement gender() {
		return driver.findElement(gender);
	}

	public WebElement maritalStatus() {

		return driver.findElement(maritalStatus);

	}

	public WebElement credit() {
		return driver.findElement(credit);
	}

	public WebElement education() {
		return driver.findElement(education);
	}

	public WebElement accidents() {
		return driver.findElement(accidents);
	}
	public WebElement email() {
		return driver.findElement(email);
	}

	/*public WebElement discounts() {
		return driver.findElement(discounts);
	}
	public WebElement hearAboutUs() {
		return driver.findElement(hearAboutUs);
	}
	public WebElement anotherDriver() {
		return driver.findElement(anotherDriver);
	}*/
	public WebElement quotes() {
		return driver.findElement(quotes);
	}
	
	
}
