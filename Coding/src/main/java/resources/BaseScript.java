package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BaseScript {

	public WebDriver driver;
	public Properties prop;
	String path = "C:\\Users\\Aswin\\eclipse-workspace\\CodingAssessment\\src\\main\\java\\resources";

	public WebDriver initializeDriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(path + "\\data.properties");

		prop.load(fis);
		String browserName = prop.getProperty("browser");

		// execute in chrome driver
		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", path + "\\chromedriver.exe");

			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("disable-infobars");
			options.addArguments("--incognito");
			driver = new ChromeDriver(options);
		}
			
		// execute in firefox driver
		else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", path + "\\geckodriver.exe");
			driver = new FirefoxDriver();

		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}

}
