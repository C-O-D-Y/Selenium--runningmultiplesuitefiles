package com.atmecs.testBase;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

import com.atmecs.constants.FilePath;
import com.atmecs.utils.ReadPropertiesFile;


public class TestBase {
	public static WebDriver driver;
	Properties baseClass;
	String url;
	String browser;
	int downloadFile;

	@BeforeSuite
	public void intitailizeBrowser() throws IOException {
		BasicConfigurator.configure();
		baseClass = ReadPropertiesFile.loadProperty(FilePath.CONFIG_FILE);
		url = baseClass.getProperty("URL");
		browser = baseClass.getProperty("browser");
		String[] brow = browser.split(",");

		for (String browserType : brow) {

			System.out.println("browser is " + browserType);

			if (browserType.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", FilePath.CHROME_PATH);

				driver = new ChromeDriver();

			} else if (browserType.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", FilePath.FIREFOX_PATH);
				driver = new FirefoxDriver();

			}

		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}


}
