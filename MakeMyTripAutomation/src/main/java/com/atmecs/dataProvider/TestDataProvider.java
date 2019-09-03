package com.atmecs.dataProvider;

import org.testng.annotations.DataProvider;

import com.atmecs.constants.FilePath;
import com.atmecs.utils.ReadExcelFile;

public class TestDataProvider {

	@DataProvider(name = "projectName")
	public Object[][] testData() {
		ReadExcelFile file = new ReadExcelFile(FilePath.TESTDATA_FILE);
		int sheetIndex = 0;
		int rowNo= 1;
		int rowCount = file.totalRowsinSheet(sheetIndex);
		int colCount = file.totalColsinSheet(sheetIndex,rowNo);

		System.out.println("In testData:: rowCount=" + rowCount);
		System.out.println("In testData:: colCount=" + colCount);

		Object[][] data = new Object[rowCount][colCount];

		for (int rowIndex = 0; rowIndex < rowCount; rowIndex++) {
			for (int colIndex = 0; colIndex < colCount; colIndex++) {

				data[rowIndex][colIndex] = file.getData(sheetIndex, rowIndex + 1, colIndex);
			}
		}
		return data;
	}

	public static void main(String[] args) {

		Object[][] data = new TestDataProvider().testData();
		for (Object[] objects : data) {
			String userName = (String) objects[0];
			String password = (String) objects[1];
			//String url = (String) objects[2];
			System.out.println(" " + userName + " -- " + password);
		}

	}
}
