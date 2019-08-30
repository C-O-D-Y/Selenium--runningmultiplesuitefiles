package com.atmecs.demo_aut.getdatafrompropertyfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.atmecs.demo_aut.constants.File_Path;

public class ReadFile {

	static String locater = null;
	File_Path path = new File_Path();

	public String getLocater(String element) {
		try (InputStream input = new FileInputStream(path.getFileName(2))) {

			Properties prop = new Properties();

			// load a properties file
			prop.load(input);

			// get the property value and return it to the calling method
			String[] arrOfStr = ((String) prop.getProperty(element)).split(":", 2);
			locater = arrOfStr[1];

		} catch (IOException ex) {
			ex.printStackTrace();
		}
		System.out.println(locater);
		return locater;
	}

	public String getLocater1(String element) {
		try (InputStream input = new FileInputStream(path.getFileName(1))) {

			Properties prop = new Properties();

			// load a properties file
			prop.load(input);

			// get the property value and return it to the calling method
			String[] arrOfStr = ((String) prop.getProperty(element)).split(":", 2);
			locater = arrOfStr[1];

		} catch (IOException ex) {
			ex.printStackTrace();
		}
		System.out.println(locater);
		return locater;
	}
	public String getLocater3(String element) {
		try (InputStream input = new FileInputStream(path.getFileName(4))) {

			Properties prop = new Properties();

			// load a properties file
			prop.load(input);

			// get the property value and return it to the calling method
			String[] arrOfStr = ((String) prop.getProperty(element)).split(":", 2);
			locater = arrOfStr[1];

		} catch (IOException ex) {
			ex.printStackTrace();
		}
		System.out.println(locater);
		return locater;
	}
	public String getLocater4(String element) {
		try (InputStream input = new FileInputStream(path.getFileName(5))) {

			Properties prop = new Properties();

			// load a properties file
			prop.load(input);

			// get the property value and return it to the calling method
			String[] arrOfStr = ((String) prop.getProperty(element)).split(":", 2);
			locater = arrOfStr[1];

		} catch (IOException ex) {
			ex.printStackTrace();
		}
		System.out.println(locater);
		return locater;
	}
}
