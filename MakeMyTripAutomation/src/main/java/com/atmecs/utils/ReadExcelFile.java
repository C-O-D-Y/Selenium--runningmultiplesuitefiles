package com.atmecs.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.atmecs.constants.FilePath;
public class ReadExcelFile {
	XSSFWorkbook workbook;
	XSSFSheet sheet1;

	/**
	 * 
	 * @param filePath The constructor takes file path as the parameter, reads the
	 *                 file and initializes the workbook
	 */

	public ReadExcelFile(String filePath) {
		try {
			File file = new File(filePath);
			FileInputStream fileInput = new FileInputStream(file);
			try {
				workbook = new XSSFWorkbook(fileInput);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getData(int index, int rowNum, int cellNum) {

		sheet1 = workbook.getSheetAt(index);
		String data = sheet1.getRow(rowNum).getCell(cellNum).getStringCellValue();
		
		return data;
	}
	public   int totalRowsinSheet(int sheet) {
		int rowCount = workbook.getSheetAt(sheet).getLastRowNum();
		//System.out.println("rowCount::"+rowCount);
		return rowCount;
	}
	
	public int totalColsinSheet(int sheetIndex,int rowCount) {
		int colCount = workbook.getSheetAt(sheetIndex).getRow(rowCount).getLastCellNum();
		
		return colCount;
	}
	public static void main(String[] args) {
		ReadExcelFile ref= new ReadExcelFile(FilePath.TESTDATA_FILE);
		
		ref.totalRowsinSheet(1);
		System.out.println("total cols in rows "+ref.totalColsinSheet(0,1));
         System.out.println("Data in row is"+ref.getData(0, 1, 0));
	}
}
