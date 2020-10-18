package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.BaseScript;

public class prefillDriver implements XpathLocators {

	public WebElement insured(WebDriver driver) {
		WebElement insured = driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/main[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/label[1]"));
				 return  insured;
	}
	
	
	public WebElement rent(WebDriver driver) {
		 WebElement rent = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/main[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/label[1]/div[1]/div[2]"));

		 return  rent;
	}

	@Override
	public WebElement shopping(WebDriver driver) {
		 WebElement shopping = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/main[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]"));

		 return  shopping;
	}

	@Override
	public WebElement save(WebDriver driver) {
		 WebElement save = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/main[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[1]"));

		 return  save;
	}

	@Override
	public WebElement address(WebDriver driver) {
		 WebElement address = driver.findElement(By.xpath("//input[@id='garaging_address']"));

		 return  address;
	}

	@Override
	public WebElement unit(WebDriver driver) {
		 WebElement unit = driver.findElement(By.xpath("//input[@id='unit']"));

		 return  unit;
	}

	@Override
	public WebElement firstName(WebDriver driver) {
		 WebElement firstName = driver.findElement(By.xpath("//input[@id='first_name-0']"));

		 return  firstName;
	}

	@Override
	public WebElement lastName(WebDriver driver) {
		 WebElement lastName = driver.findElement(By.xpath("//input[@id='last_name-0']"));

		 return  lastName;
	}
	@Override
	public WebElement dob(WebDriver driver) {
		 WebElement dob = driver.findElement(By.xpath("//input[@id='date_of_birth-0']"));

		 return  dob;
	}

	@Override
	public WebElement saveButton(WebDriver driver) {
		 WebElement saveButton = driver.findElement(By.linkText("Save & continue"));
				 
			

		 return  saveButton;
	}
	


	@Override
	public WebElement year(WebDriver driver) {
		 WebElement year = driver.findElement(By.xpath("//input[@id='dropdown-input-vehicle-year-0']"));
		 
		 return  year;
	}

	@Override
	public WebElement make(WebDriver driver) {
		 WebElement make = driver.findElement(By.xpath("//input[@id='dropdown-input-vehicle-make-0']"));

		 return  make;
	}

	@Override
	public WebElement model(WebDriver driver) {
		 WebElement model = driver.findElement(By.xpath("//input[@id='dropdown-input-vehicle-model-0']"));

		 return  model;
	}

	@Override
	public WebElement submodel(WebDriver driver) {
		 WebElement submodel = driver.findElement(By.xpath("//input[@id='dropdown-input-vehicle-submodel-0']"));

		 return  submodel;
	}

	@Override
	public WebElement saveVehicle(WebDriver driver) {
		 WebElement saveVehicle = driver.findElement(By.linkText("Save & continue"));

		 return  saveVehicle;
	}

	@Override
	public WebElement own(WebDriver driver) {
		 WebElement own = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/main[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/label[1]/div[1]"));

		 return  own;
	}

	@Override
	public WebElement commute(WebDriver driver) {
		 WebElement commute = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/main[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/label[1]/div[1]/div[2]"));

		 return  commute;
	}

	@Override
	public WebElement miles(WebDriver driver) {
		 WebElement miles = driver.findElement(By.xpath("//input[@id='miles-0']"));

		 return  miles;
	}

	@Override
	public WebElement frequency(WebDriver driver) {
		 WebElement frequency = driver.findElement(By.xpath("//span[contains(text(),'Select frequency]"));

		 return  frequency;
	}
	@Override
	public WebElement continuebtn(WebDriver driver) {
		 WebElement continuebtn = driver.findElement(By.linkText("Save & continue"));

		 return  continuebtn;
	}

	@Override
	public WebElement gender(WebDriver driver) {
		 WebElement gender = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/main[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/div[1]"));

		 return  gender;
	}

	@Override
	public WebElement maritalStatus(WebDriver driver) {
		 WebElement maritalStatus = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/main[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/label[1]/div[1]"));

		 return  maritalStatus;
	}

	@Override
	public WebElement credit(WebDriver driver) {
		 WebElement credit = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/main[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[2]/label[1]/div[1]"));

		 return  credit;
	}

	@Override
	public WebElement education(WebDriver driver) {
		 WebElement education = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/main[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[2]/label[5]/div[1]"));

		 return  education;
	}

	@Override
	public WebElement accidents(WebDriver driver) {
		 WebElement accidents = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/main[1]/div[1]/div[2]/form[1]/div[5]/div[1]/div[2]/div[1]/div[2]/label[1]/div[1]"));

		 return  accidents;
	}

	@Override
	public WebElement email(WebDriver driver) {
		 WebElement email = driver.findElement(By.xpath("//input[@name='email-0']"));

		 return  email;
	}

	@Override
	public WebElement quotes(WebDriver driver) {
		 WebElement quotes = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/main[1]/div[1]/div[2]/form[1]/div[10]/div[1]/div[2]/button[1]"));

		 return  quotes;
	}
	


	
}
