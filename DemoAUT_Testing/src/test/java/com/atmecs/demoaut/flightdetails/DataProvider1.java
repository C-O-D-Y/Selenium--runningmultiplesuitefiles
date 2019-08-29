package com.atmecs.demoaut.flightdetails;

import org.testng.annotations.DataProvider;

import com.atmecs.demo_aut.getdatafromexcelfile.ProvideData;

public class DataProvider1 {
	@DataProvider(name = "data-provider")
	public Object[][] getData() {
		ProvideData provideData = new ProvideData();
		Object[][] getData = provideData.provideData();
		return getData;
	}
}
