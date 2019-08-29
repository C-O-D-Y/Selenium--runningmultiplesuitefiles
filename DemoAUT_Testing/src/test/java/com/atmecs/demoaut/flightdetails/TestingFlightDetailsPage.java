package com.atmecs.demoaut.flightdetails;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.atmecs.demo_aut.getdatafrompropertyfile.ReadFile;
import com.atmecs.testbase.ChooseWebDriver;

public class TestingFlightDetailsPage extends ChooseWebDriver {

	ReadFile read = new ReadFile();

	@BeforeSuite
	public void setUp() throws IOException {
		System.out.println("Test Started");
	}

	@AfterSuite
	public void tearDown() {
		driver.close();
		System.out.println("Test End");
	}

	@Test(priority = 1)
	public void loginPageTest() {
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		WebElement login_username = (driver.findElement(By.name(read.getLocater1("loc.login.username.txt"))));
		login_username.click();
		login_username.sendKeys("mercury");
		WebElement login_password = (driver.findElement(By.name(read.getLocater1("loc.login.password.txt"))));
		login_password.click();
		login_password.sendKeys("mercury");
		WebElement login_signin = (driver.findElement(By.name(read.getLocater1("loc.login.signin.btn"))));
		login_signin.click();
	}

	@Test(priority = 2)
	public void flightDetails() {
		// driver.get(prop.getProperty("url"));
		// driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.findElement(By.xpath(read.getLocater("loc.roundTrip.rbtn"))).click();
		driver.findElement(By.name(read.getLocater("loc.passengers.dpdn"))).click();
		{
			WebElement dropdown = driver.findElement(By.name(read.getLocater("loc.passengers.dpdn")));
			dropdown.findElement(By.xpath("//option[@value= '3']")).click();
		}
		driver.findElement(By.name(read.getLocater("loc.passengers.dpdn"))).click();
		driver.findElement(By.name(read.getLocater("loc.departingFrom.dpdn"))).click();
		{
			WebElement dropdown = driver.findElement(By.name(read.getLocater("loc.departingFrom.dpdn")));
			dropdown.findElement(By.xpath("//option[@value='Acapulco']")).click();
			System.out.println("HO Gaya");
		}
		driver.findElement(By.name(read.getLocater("loc.departingFrom.dpdn"))).click();
		driver.findElement(By.name(read.getLocater("loc.on.month.dpdn"))).click();
		{
			WebElement dropdown = driver.findElement(By.name(read.getLocater("loc.on.month.dpdn")));
			dropdown.findElement(By.xpath("//option[@value = '1']")).click();
		}
		driver.findElement(By.name(read.getLocater("loc.on.month.dpdn")));
		driver.findElement(By.name(read.getLocater("loc.on.day.dpdn"))).click();
		{
			WebElement dropdown = driver.findElement(By.name(read.getLocater("loc.on.day.dpdn")));
			dropdown.findElement(By.xpath("//option[@value = '21']")).click();
		}
		driver.findElement(By.name(read.getLocater("loc.on.day.dpdn"))).click();
		driver.findElement(By.name(read.getLocater("loc.arrivingIn.dpdn"))).click();
		{
			WebElement dropdown = driver.findElement(By.name(read.getLocater("loc.arrivingIn.dpdn")));
			dropdown.findElement(By.xpath("//option[@value = 'Paris']")).click();
		}
		driver.findElement(By.name(read.getLocater("loc.arrivingIn.dpdn"))).click();
		driver.findElement(By.name(read.getLocater("loc.returning.month.dpdn"))).click();// loc.returning.month.dpdn
		{
			WebElement dropdown = driver.findElement(By.name(read.getLocater("loc.returning.month.dpdn")));
			dropdown.findElement(By.xpath("//option[@value = '10']")).click();
		}
		driver.findElement(By.name(read.getLocater("loc.returning.month.dpdn"))).click();
		driver.findElement(By.name(read.getLocater("loc.returning.day.dpdn"))).click();
		{
			WebElement dropdown = driver.findElement(By.name(read.getLocater("loc.returning.day.dpdn")));
			dropdown.findElement(By.xpath("//option[@value = '10']")).click();
		}
		driver.findElement(By.name(read.getLocater("loc.returning.day.dpdn"))).click();
		driver.findElement(By.cssSelector(read.getLocater("loc.serviceClass.economy.rbtn"))).click();
		driver.findElement(By.cssSelector(read.getLocater("loc.serviceClass.business.rbtn"))).click();
		driver.findElement(By.cssSelector(read.getLocater("loc.serviceClass.firstClass.rbtn"))).click();
		driver.findElement(By.name(read.getLocater("loc.airline.dpdn"))).click();
		{
			WebElement dropdown = driver.findElement(By.name(read.getLocater("loc.airline.dpdn")));
			dropdown.findElement(By.xpath("//option[value = 'Blue Skies Airlines']")).click();
		}
		driver.findElement(By.name(read.getLocater("loc.airline.dpdn"))).click();
		driver.findElement(By.name(read.getLocater("loc.continue.btn"))).click();
	}
}
