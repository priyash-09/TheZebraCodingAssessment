package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StartQuestions {

	public WebDriver driver;

	//By insured = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/label[2]/div[1]");
	//By insured =By.xpath("//label[contains(@data-cy='currently_insuredstart-No-Radiobutton')]");
	
	//By insured =By.xpath("//div[@data-cy='radio_form'] //label[2] ");
	

/*	By insured = By.xpath("//label[@class ='custom-radio d-block'] ");
			
			
	///html[1]/body[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/label[1]/div[1]
	      
	By rent = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/label[3]/div[1]");
	                 
	By shopping = By.xpath(
			"/html[1]/body[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/label[1]/div[1]/div[1]/span[1]");

	By save = By.xpath("//span[contains(text(),'Save & continue')]");
	By address = By.xpath("//input[@id='garaging_addressInput']");
	By unit = By.xpath("//input[@id='unitstart']");
	By firstName = By.xpath("//input[@id='first_namestart']");
	By lastName = By.xpath("//input[@id='last_namestart']");
	By dob = By.xpath("//input[@id='date_of_birthstart']");
	By saveButton = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/button[2]");*/

	public StartQuestions(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;

	}

	

/*	public WebElement insured() {
		return  driver.findElement(insured);
	}

	public WebElement rent() {
		return driver.findElement(rent);
	}

	public WebElement shopping() {
		return driver.findElement(shopping);
	}

	public WebElement save() {
		return driver.findElement(save);
	}

	public WebElement address() {
		return driver.findElement(address);
	}

	public WebElement unit() {
		return driver.findElement(unit);
	}

	public WebElement firstName() {
		return driver.findElement(firstName);
	}

	public WebElement lastName() {
		return driver.findElement(lastName);
	}

	public WebElement dob() {
		return driver.findElement(dob);
	}

	public WebElement saveButton() {
		return driver.findElement(saveButton);
	}*/

}
