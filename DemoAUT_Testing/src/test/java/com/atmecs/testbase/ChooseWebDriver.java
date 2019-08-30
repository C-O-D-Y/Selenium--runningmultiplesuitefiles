package com.atmecs.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

import com.atmecs.demo_aut.constants.File_Path;

public class ChooseWebDriver {
	String browserName;
	String url;
	public static Properties prop;
	static public WebDriver driver;
	File_Path path = new File_Path();

	@BeforeSuite
	public void chooseWebDriver() {
		InputStream input = null;

		try {
			input = new FileInputStream(path.getFileName(3));
		} catch (FileNotFoundException e) {

			System.out.println("File not found");
		}

		prop = new Properties();

		// load a properties file
		try {
			prop.load(input);
		} catch (IOException e) {
			System.out.println("Property file not loaded");
		}
		browserName = prop.getProperty("browserName");

		switch (browserName) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "./lib/geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		case "MicrosoftEdge":
			System.setProperty("webdriver.edge.driver", "./lib/msedgedriver.exe");
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("WebDriver not found");

		}

	}
}
