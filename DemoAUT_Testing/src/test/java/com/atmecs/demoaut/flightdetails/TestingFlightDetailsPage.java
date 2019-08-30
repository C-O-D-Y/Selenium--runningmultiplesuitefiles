package com.atmecs.demoaut.flightdetails;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
		//driver.close();
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
		driver.findElement(By.xpath(read.getLocater("loc.serviceClass.firstClass.rbtn"))).click();
		driver.findElement(By.name(read.getLocater("loc.airline.dpdn"))).click();
		{
			WebElement dropdown = driver.findElement(By.name(read.getLocater("loc.airline.dpdn")));
			dropdown.findElement(By.xpath("//option[text() = 'Blue Skies Airlines']")).click();
		}
		driver.findElement(By.name(read.getLocater("loc.airline.dpdn"))).click();
		driver.findElement(By.name(read.getLocater("loc.continue.btn"))).click();
	}

	@Test(priority = 4)
	public void bookFlight() {
		// driver.get(prop.getProperty("url"));
		// driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name(read.getLocater3("loc.firstname.txt"))).click();
		driver.findElement(By.name(read.getLocater3("loc.firstname.txt"))).sendKeys("Saurabh");
		driver.findElement(By.name(read.getLocater3("loc.lastname.txt"))).sendKeys("Chauhan");
		driver.findElement(By.name(read.getLocater3("loc.mealdropdown.dpdn"))).click();
		{
			Select menuValues = new Select(driver.findElement(By.name(read.getLocater3("loc.mealdropdown.dpdn"))));
			menuValues.selectByIndex(2);
		}
		driver.findElement(By.name(read.getLocater3("loc.cardtype.dpdn"))).click();
		{
			Select cardType = new Select(driver.findElement(By.name(read.getLocater3("loc.cardtype.dpdn"))));
			cardType.selectByVisibleText("MasterCard");
		}
		driver.findElement(By.name(read.getLocater3("loc.cardnumber.txt"))).sendKeys("839373883736");
		driver.findElement(By.name(read.getLocater3("loc.Expirationdate.dpdn"))).click();
		{
			Select expirationDate = new Select(driver.findElement(By.name(read.getLocater3("loc.Expirationdate.dpdn"))));
			expirationDate.selectByVisibleText("05");
		}
		driver.findElement(By.name(read.getLocater3("loc.Expiration_year.dpdn"))).click();
		{
			Select expirationDate = new Select(
					driver.findElement(By.name(read.getLocater3("loc.Expiration_year.dpdn"))));
			expirationDate.selectByIndex(3);
		}
		driver.findElement(By.name(read.getLocater3("loc.creditcardfirstname.txt"))).sendKeys("Saurabh");
		driver.findElement(By.name(read.getLocater3("loc.creditcardmiddlename.txt"))).sendKeys("Singh");
		//driver.findElement(By.name(read.getLocater3("loc.creditcardlastname.txt"))).sendKeys("Chauhan");
		driver.findElement(By.name(read.getLocater3("loc.bAddress.txt1"))).sendKeys(" House no. 3, ");
		driver.findElement(By.name(read.getLocater3("loc.bAddress.txt2"))).sendKeys(" Lane no.9 Rajendra nagar");
		driver.findElement(By.name(read.getLocater3("loc.bcity.txt"))).sendKeys("Satna");
		driver.findElement(By.name(read.getLocater3("loc.bstate.txt"))).sendKeys("Madhya Pradesh");
		driver.findElement(By.name(read.getLocater3("loc.bpostalcode.txt"))).sendKeys("485001");
		driver.findElement(By.name(read.getLocater3("loc.bcountry.dpdn"))).click();
		{
			Select country = new Select(driver.findElement(By.name(read.getLocater3("loc.bcountry.dpdn"))));
			country.selectByIndex(14);
		}
		driver.findElement(By.name(read.getLocater3("loc.dAddress.txt1"))).sendKeys(" Room no. 302, ");
		driver.findElement(By.name(read.getLocater3("loc.dAddress.txt2"))).sendKeys(" Prashanth Hills");
		driver.findElement(By.name(read.getLocater3("loc.dcity.txt"))).sendKeys("Hyderabad");
		driver.findElement(By.name(read.getLocater3("loc.dstate.txt"))).sendKeys("Telangana");
		driver.findElement(By.name(read.getLocater3("loc.dpostalcode.txt"))).sendKeys("582552");
		driver.findElement(By.name(read.getLocater3("loc.dcountry.dpdn"))).click();
		{
			Select country = new Select(driver.findElement(By.name(read.getLocater3("loc.dcountry.dpdn"))));
			country.selectByIndex(14);
		}
		driver.findElement(By.name(read.getLocater3("loc.securepurchase.btn"))).click();
	}

	@Test(priority = 3)
	public void selectFlight() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(read.getLocater4("loc.blue_skies_airlines_361.rbtn"))).click();
		driver.findElement(By.xpath(read.getLocater4("loc.pangea_airlines_362.rbtn"))).click();
		driver.findElement(By.xpath(read.getLocater4("loc.unified_airlines_363.rbtn"))).click();
		driver.findElement(By.xpath(read.getLocater4("loc.pangea_airlines_632.rbtn"))).click();
		driver.findElement(By.xpath(read.getLocater4("loc.blue_skies_airlines_631.rbtn"))).click();
		driver.findElement(By.xpath(read.getLocater4("loc.unified_airlines_633.rbtn"))).click();
		driver.findElement(By.xpath(read.getLocater4("loc.continue.btn"))).click();
	}
}
