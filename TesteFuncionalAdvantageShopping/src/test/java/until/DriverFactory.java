package until;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	private static WebDriver driver;

	private DriverFactory() {}

	public static WebDriver getDriver(){

		if (driver == null) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Rafael\\Documents\\TesteFuncionalAdvantageOlineShopping\\TesteFuncionalAdvantageShopping\\src\\test\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://advantageonlineshopping.com/#/");

		}
		return driver;
	}

	public static void killDriver() {
		if(driver !=null) {
		driver.quit();
		driver = null;
		}
	}

}
