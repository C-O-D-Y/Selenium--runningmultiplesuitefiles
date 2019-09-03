package com.atmecs.constants;

import java.io.File;

public class FilePath {
	
	public final static String USER_HOME= System.getProperty("user.dir")+File.separator;
	public final static String RESOURCES_HOME= USER_HOME+"src"+File.separator+"test"+File.separator+"resources"+File.separator;
	public final static String LOCATOR_HOME= RESOURCES_HOME+"locators"+File.separator;
	public final static String LIB_HOME =USER_HOME+"lib"+File.separator;
	
	
	public final static String CONFIG_FILE = RESOURCES_HOME+"testData"+File.separator+"config.properties";
	public final static String CHROME_PATH= LIB_HOME+"chromedriver.exe";
	public final static String FIREFOX_PATH= LIB_HOME+"geckodriver.exe";
	public final static String IE_PATH= LIB_HOME+"IEDriver.exe";
	
	public final static String ONEWAY_FILE= LOCATOR_HOME+"oneWay.properties";
	public final static String TESTDATA_FILE= RESOURCES_HOME+"testData"+File.separator+"TestData.xlsx";
    
	public static void main(String[] args) {
		System.out.println(USER_HOME);
	}
}
