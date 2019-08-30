package com.atmecs.demo_aut.constants;

public class File_Path {
	public String getFileName(int index) {
		String sendFilePath = null;
		switch (index) {

		case 1:
			sendFilePath = "./src/test/resources/locater/login_page_locaters.properties";
			break;
		case 2:
			sendFilePath = "./src/test/resources/locater/flightdetails.properties";
			break;
		case 3:
			sendFilePath = "./src/test/java/com.atmecs.testdata/config.properties";
			break;
		case 4:
			sendFilePath = "./src/test/resources/locater/bookflight.properties";
			break;
		case 5:
			sendFilePath = "./src/test/resources/locater/flightselect.properties";
			break;
		default:
			System.out.println("No File Found");
		}
		return sendFilePath;
	}
}
