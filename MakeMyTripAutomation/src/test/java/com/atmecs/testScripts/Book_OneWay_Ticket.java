package com.atmecs.testScripts;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.atmecs.constants.OneWayTrip;
import com.atmecs.helpers.CommonUtility;
import com.atmecs.testBase.TestBase;

public class Book_OneWay_Ticket extends TestBase {
	OneWayTrip one_way_trip=new OneWayTrip();
	
	@Test(priority = 1)
	public void homePage() {
		
		CommonUtility.clickElement(driver, one_way_trip.getLoc_oneway_rbtn());
		CommonUtility.clickElement(driver, one_way_trip.getLoc_from_box());
		CommonUtility.clickAndSendText(driver, one_way_trip.getLoc_from_inputtext(), 2, "Hyderabad");
		CommonUtility.clickElement(driver, one_way_trip.getLoc_from_search());
		System.out.println("1st");
		CommonUtility.clickAndSendText(driver, one_way_trip.getLoc_to_box(),2,"Kolkata");
		System.out.println("2nd");
		//CommonUtility.clickAndSendText(driver, one_way_trip.getLoc_to_inputtext(), 2, "Kolkata");
		CommonUtility.clickElement(driver, one_way_trip.getLoc_to_search());
		System.out.println("3nd");
		CommonUtility.clickElement(driver, one_way_trip.getloc_departure_btn());
		CommonUtility.clickElement(driver, one_way_trip.getloc_calender_departure_date_btn());
		CommonUtility.clickElement(driver, one_way_trip.getLoc_traveller_class_btn());
		CommonUtility.clickElement(driver, one_way_trip.getLoc_traveller_adults_btn());
		CommonUtility.clickElement(driver, one_way_trip.getLoc_traveller_children_btn());
		CommonUtility.clickElement(driver, one_way_trip.getLoc_traveller_infants_btn());
		CommonUtility.clickElement(driver, one_way_trip.getLoc_traveller_choose_travel_class_btn());
		CommonUtility.clickElement(driver, one_way_trip.getLoc_traveller_apply_btn());
		CommonUtility.clickElement(driver, one_way_trip.getLoc_search_btn());
//		CommonUtility.clickElement(driver, one_way_trip.getLoc_sortby_departure_btn());
//		CommonUtility.clickElement(driver, one_way_trip.getLoc_book_now_btn());
	}
	
	@Test(priority = 2)
	public void selectFlightAndReview() {
		CommonUtility.clickElement(driver, one_way_trip.getLoc_sortby_departure_btn());
		CommonUtility.clickElement(driver, one_way_trip.getLoc_book_now_btn());
		Set<String> windowhandle=driver.getWindowHandles();
		Iterator<String> iterator=windowhandle.iterator();
		String mainwindow=iterator.next();
		String childwindow=iterator.next();
		driver.switchTo().window(childwindow);
		CommonUtility.scrollDownPage(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		CommonUtility.clickElement(driver, one_way_trip.getLoc_continue_btn());
		
	}
	

	

}
