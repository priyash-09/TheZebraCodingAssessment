package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.BaseScript;

public class startDriver implements XpathLocators  {
	


	public WebElement insured(WebDriver driver) {
		 WebElement insured = driver.findElement(By.xpath("//label[@data-cy='currently_insuredstart-No-Radiobutton']"));

		 return  insured;
	}

	public WebElement rent(WebDriver driver) {
		 WebElement rent = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/label[3]/div[1]"));

		 return  rent;
	}

	@Override
	public WebElement shopping(WebDriver driver) {
		 WebElement shopping = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/label[1]/div[1]/div[1]/span[1]"));

		 return  shopping;
	}

	@Override
	public WebElement save(WebDriver driver) {
		 WebElement save = driver.findElement(By.xpath("//span[contains(text(),'Save & continue')]"));

		 return  save;
	}

	@Override
	public WebElement address(WebDriver driver) {
		 WebElement address = driver.findElement(By.xpath("//input[@id='garaging_addressInput']"));

		 return  address;
	}

	@Override
	public WebElement unit(WebDriver driver) {
		 WebElement unit = driver.findElement(By.xpath("//input[@id='unitstart']"));

		 return  unit;
	}

	@Override
	public WebElement firstName(WebDriver driver) {
		 WebElement firstName = driver.findElement(By.xpath("//input[@id='first_namestart']"));

		 return  firstName;
	}

	@Override
	public WebElement lastName(WebDriver driver) {
		 WebElement lastName = driver.findElement(By.xpath("//input[@id='last_namestart']"));

		 return  lastName;
	}
	@Override
	public WebElement dob(WebDriver driver) {
		 WebElement dob = driver.findElement(By.xpath("//input[@id='date_of_birthstart']"));

		 return  dob;
	}

	@Override
	public WebElement saveButton(WebDriver driver) {
		 WebElement saveButton = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/button[2]"));

		 return  saveButton;
	}

	@Override
	public WebElement year(WebDriver driver) {
		 WebElement year = driver.findElement(By.cssSelector("#yearYear-0Input-0"));

		 return  year;
	}

	@Override
	public WebElement make(WebDriver driver) {
		 WebElement make = driver.findElement(By.cssSelector("#makeMake-0Input-0"));

		 return  make;
	}

	@Override
	public WebElement model(WebDriver driver) {
		 WebElement model = driver.findElement(By.cssSelector("#modelModel-0Input-0"));

		 return  model;
	}

	@Override
	public WebElement submodel(WebDriver driver) {
		 WebElement submodel = driver.findElement(By.cssSelector("#submodelSubmodel-0Input-0"));

		 return  submodel;
	}

	@Override
	public WebElement saveVehicle(WebDriver driver) {
		 WebElement saveVehicle = driver.findElement(By.xpath("//span[contains(text(),'Save & continue')]"));

		 return  saveVehicle;
	}

	@Override
	public WebElement own(WebDriver driver) {
		 WebElement own = driver.findElement(By.xpath("//span[contains(text(),'Own - paid in full')]"));

		 return  own;
	}

	@Override
	public WebElement commute(WebDriver driver) {
		 WebElement commute = driver.findElement(By.xpath("//span[contains(text(),'Personal/Commuting')]"));

		 return  commute;
	}

	@Override
	public WebElement miles(WebDriver driver) {
		 WebElement miles = driver.findElement(By.xpath("//input[@id='miles-input-0']"));

		 return  miles;
	}

	@Override
	public WebElement frequency(WebDriver driver) {
		 WebElement frequency = driver.findElement(By.xpath("//span[contains(text(),'Select frequency]"));

		 return  frequency;
	}
	@Override
	public WebElement continuebtn(WebDriver driver) {
		 WebElement continuebtn = driver.findElement(By.xpath("//span[contains(text(),'Save & continue')]"));

		 return  continuebtn;
	}

	@Override
	public WebElement gender(WebDriver driver) {
		 WebElement gender = driver.findElement(By.xpath("//span[contains(text(),'Male')]"));

		 return  gender;
	}

	@Override
	public WebElement maritalStatus(WebDriver driver) {
		 WebElement maritalStatus = driver.findElement(By.xpath("//span[contains(text(),'Single')]"));

		 return  maritalStatus;
	}

	@Override
	public WebElement credit(WebDriver driver) {
		 WebElement credit = driver.findElement(By.xpath("//span[contains(text(),'Excellent (720+)')]"));

		 return  credit;
	}

	@Override
	public WebElement education(WebDriver driver) {
		 WebElement education = driver.findElement(By.xpath("//span[contains(text(),'No diploma')]"));

		 return  education;
	}

	@Override
	public WebElement accidents(WebDriver driver) {
		 WebElement accidents = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[1]/div[1]/div[2]/label[2]/div[1]"));

		 return  accidents;
	}

	@Override
	public WebElement email(WebDriver driver) {
		 WebElement email = driver.findElement(By.xpath("//input[@name='email']"));

		 return  email;
	}

	@Override
	public WebElement quotes(WebDriver driver) {
		 WebElement quotes = driver.findElement(By.xpath("//span[contains(text(),'Show my quotes')]"));

		 return  quotes;
	}
	
	
	
	
	

}
