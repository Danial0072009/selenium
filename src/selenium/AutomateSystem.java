package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomateSystem {
	
	private WebDriver driver;
	private String url;
	
	public AutomateSystem(String _driver, String url) {
		setDriver(_driver);
		setUrlToDriver(url);
	}

	public void setDriver(String _driver) {
		switch(_driver) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "C:/tools/chromedriver.exe");
				driver = new ChromeDriver();
				break;
			case "firefox":
				driver = new FirefoxDriver();
				break;
			case "default":
				driver = new FirefoxDriver();
				break;
		}
	}
	
	public void setUrlToDriver(String _url) {
		driver.get(_url);
	}
	
	public void writeToElement(By element, String text) {
		WebElement webElement = driver.findElement(element);
		webElement.sendKeys(text);
	}
	
	public void submitElement(By element) {
		WebElement webElement = driver.findElement(element);
		webElement.click();
	}
}
