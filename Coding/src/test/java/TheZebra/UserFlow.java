package TheZebra;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import pageObjects.HomePage;

import pageObjects.XpathLocators;
import pageObjects.prefillDriver;
import pageObjects.startDriver;
import resources.BaseScript;

public class UserFlow extends BaseScript {

	public WebDriver driver;
	private WebDriverWait wait;

	@BeforeTest
	public void initialize() throws IOException, InterruptedException {

		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();

	}

	@Test
	public void landingPage() throws InterruptedException {
		wait = new WebDriverWait(driver, 100);

		HomePage hp = new HomePage(driver);
		Assert.assertTrue(true, "hp.carRadioButton().isEnabled()");
		hp.zipCode().sendKeys("78704"); // Enter the zipcode
		hp.submit().click();// Click on Start button
		Thread.sleep(1000);
	}

	//method which performs all the actions on the startPage
	@Test(dataProvider = "questionsPage", dependsOnMethods = { "landingPage" })
	private void startPage(XpathLocators loc) throws InterruptedException {

		wait = new WebDriverWait(driver, 100);
		WebElement insured = wait.until(ExpectedConditions.elementToBeClickable(loc.insured(driver)));
		insured.click();
		WebElement rent = wait.until(ExpectedConditions.elementToBeClickable(loc.rent(driver)));
		rent.click();
		Thread.sleep(1000);
		WebElement shopping = wait.until(ExpectedConditions.elementToBeClickable(loc.shopping(driver)));
		shopping.click();
		Thread.sleep(1000);
		WebElement save = wait.until(ExpectedConditions.elementToBeClickable(loc.save(driver)));
		save.click();
		Thread.sleep(3000);
		WebElement address = wait.until(ExpectedConditions.elementToBeClickable(loc.address(driver)));
		address.sendKeys("900 East 11th Street");
		address.sendKeys(Keys.DOWN);
		address.click();

		WebElement unit = wait.until(ExpectedConditions.elementToBeClickable(loc.unit(driver)));
		unit.sendKeys("216");
		WebElement firstName = wait.until(ExpectedConditions.elementToBeClickable(loc.firstName(driver)));
		firstName.sendKeys("Priyanka");
		WebElement lastName = wait.until(ExpectedConditions.elementToBeClickable(loc.lastName(driver)));
		lastName.sendKeys("Srinivas");
		WebElement dob = wait.until(ExpectedConditions.elementToBeClickable(loc.dob(driver)));
		dob.sendKeys("01/01/1999");
		WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(loc.saveButton(driver)));
		saveButton.click();
	}
	//method which performs all the actions related to the vehicle
	@Test(dataProvider = "questionsPage", dependsOnMethods = { "landingPage", "startPage" })
	private void vehiclesPage(XpathLocators loc) throws InterruptedException {
		Thread.sleep(3000);
		wait = new WebDriverWait(driver, 100);
		WebElement year = wait.until(ExpectedConditions.elementToBeClickable(loc.year(driver)));
		year.sendKeys("2019");
		year.sendKeys(Keys.ENTER);

		WebElement make = wait.until(ExpectedConditions.elementToBeClickable(loc.make(driver)));
		make.sendKeys("Audi");
		Thread.sleep(1000);
		make.sendKeys(Keys.ENTER);

		WebElement model = wait.until(ExpectedConditions.elementToBeClickable(loc.model(driver)));
		model.sendKeys("A3");
		Thread.sleep(1000);
		model.sendKeys(Keys.ENTER);

		WebElement submodel = wait.until(ExpectedConditions.elementToBeClickable(loc.submodel(driver)));
		submodel.sendKeys("2.0T Premium 2dr Convertible");
		submodel.sendKeys(Keys.ENTER);

		WebElement saveVehicle = wait.until(ExpectedConditions.elementToBeClickable(loc.saveVehicle(driver)));
		saveVehicle.click();
		Thread.sleep(1000);

		WebElement own = wait.until(ExpectedConditions.elementToBeClickable(loc.own(driver)));
		own.click();
		WebElement commute = wait.until(ExpectedConditions.elementToBeClickable(loc.commute(driver)));
		commute.click();
		WebElement miles = wait.until(ExpectedConditions.elementToBeClickable(loc.miles(driver)));
		miles.sendKeys("1000");
		Thread.sleep(3000);
		WebElement continuebtn = wait.until(ExpectedConditions.elementToBeClickable(loc.continuebtn(driver)));
		continuebtn.click();

	}
	//method which performs all the actions related to the driver
	@Test(dataProvider = "questionsPage", dependsOnMethods = { "landingPage", "startPage", "vehiclesPage" })
	private void driversPage(XpathLocators loc) throws InterruptedException {
		Thread.sleep(3000);
		WebElement gender = wait.until(ExpectedConditions.elementToBeClickable(loc.gender(driver)));
		gender.click();
		WebElement maritalStatus = wait.until(ExpectedConditions.elementToBeClickable(loc.maritalStatus(driver)));
		maritalStatus.click();
		Thread.sleep(1000);
		WebElement credit = wait.until(ExpectedConditions.elementToBeClickable(loc.credit(driver)));
		credit.click();
		Thread.sleep(1000);
		WebElement education = wait.until(ExpectedConditions.elementToBeClickable(loc.education(driver)));
		education.click();
		Thread.sleep(1000);
		WebElement accidents = wait.until(ExpectedConditions.elementToBeClickable(loc.accidents(driver)));
		accidents.click();
		WebElement email = wait.until(ExpectedConditions.elementToBeClickable(loc.email(driver)));
		email.sendKeys("priyankasrinivas37@gmail.com");
		Thread.sleep(1000);
		WebElement quotes = wait.until(ExpectedConditions.elementToBeClickable(loc.quotes(driver)));
		quotes.click();
		Thread.sleep(5000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.thezebra.com/z/rate-select/");

	}

	@DataProvider(name = "questionsPage")
	public Object[][] questionsPage() {

		startDriver sq1 = new startDriver();
		prefillDriver sq2 = new prefillDriver();

		if (driver.getCurrentUrl().contains("prefill")) {

			System.out.println("Prefill:" + driver.getCurrentUrl());
			return new Object[][] { new Object[] { sq2 } };

		} else {
			System.out.println(driver.getCurrentUrl());
			return new Object[][] { new Object[] { sq1 } };

		}

	}

	@AfterTest
	public void teardown() {

		driver.close();
	}

}
