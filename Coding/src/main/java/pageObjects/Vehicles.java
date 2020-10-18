package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Vehicles {
	
	public WebDriver driver;

	By year = By.cssSelector("#yearYear-0Input-0");
	By make = By.cssSelector("#makeMake-0Input-0");
	
	By model = By.cssSelector("#modelModel-0Input-0");
	By submodel = By.cssSelector("#submodelSubmodel-0Input-0");
	By save = By.cssSelector("#vehiclesSelectSaveBtn");
	By own = By.xpath("//span[contains(text(),'Own - paid in full')]");
	By commute = By.xpath("//span[contains(text(),'Personal/Commuting')]");
	By miles = By.xpath("//input[@id='miles-input-0']");
	By frequency = By.xpath("//span[contains(text(),'Select frequency]");
	By continuebtn = By.xpath("//button[@id='vehiclesDetailsSaveBtn']");
	
	

	public Vehicles(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement year() {
		return driver.findElement(year);
	}
	public WebElement make() {
		return driver.findElement(make);
	}
	public WebElement model() {
		return driver.findElement(model);
	}
	public WebElement submodel() {
		return driver.findElement(submodel);
	}
	public WebElement save() {
		return driver.findElement(save);
	}
	public WebElement own() {
		return driver.findElement(own);
	}
	public WebElement commute() {
		return driver.findElement(commute);
	}
	public WebElement miles() {
		return driver.findElement(miles);
	}public WebElement frequency() {
		return driver.findElement(frequency);
	}
	public WebElement continuebtn() {
		return driver.findElement(continuebtn);
	}
}






	