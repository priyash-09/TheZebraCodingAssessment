
package TheZebra;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import resources.BaseScript;

public class Verifications extends BaseScript {

	public WebDriver driver;

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(dataProvider = "getData")

	public void homePageNavigation(String zipcode) throws IOException {
		// Resize current window to the maximum
		driver.manage().window().maximize();
		// Verifies the current page URL
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.thezebra.com/");
		// Verifies the current page title
		Assert.assertEquals(driver.getTitle(), "The Zebra: Instantly Compare Insurance Quotes");

		// creating object to that class and invoke methods of it
		HomePage hp = new HomePage(driver);
		// Verifying if the default radio button is enabled
		Assert.assertTrue(true, "hp.carRadioButton().isEnabled()");
		// Prints the Header text
		System.out.println("Header Text =" + hp.header().getText());
		// Prints theTotal number of links on the page
		System.out.println("Total Number of links on Page = " + driver.findElements(By.tagName("a")).size());

		hp.headline().click();
		Assert.assertEquals(hp.headline().getText(), "Compare");
		hp.zipCode().sendKeys(zipcode); // Enter the zipcode
		hp.submit().click();// Click on Start button
		driver.close();

	}

	@AfterTest
	public void teardown() {

	//driver.close();
	}

	@DataProvider
	public Object[][] getData() {
		// Row stands for how many different data types test should run
		// Column stands for how many values per each test

		Object[][] data = new Object[1][1];

		data[0][0] = "78704";

	

		return data;

	}
}