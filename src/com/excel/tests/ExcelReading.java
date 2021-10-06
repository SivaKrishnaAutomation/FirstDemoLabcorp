package com.excel.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {

	
	public static void main(String[] args) throws IOException {
		
		/*
		 * File file = new File("C:\\Users\\INDIAN\\Desktop\\JavaDocs\\Data.xlsx");
		 * FileInputStream fis = new FileInputStream(file);
		 * 
		 * Workbook wb = new XSSFWorkbook(fis); Sheet sheet = wb.getSheet("Training");
		 * System.out.println("no of rows is "+sheet.getLastRowNum());
		 * 
		 * for(int i=0;i<sheet.getLastRowNum();i++) {
		 * 
		 * Row row = sheet.getRow(i);
		 * System.out.println("column no is "+row.getLastCellNum()); for(int
		 * k=0;k<row.getLastCellNum();k++) {
		 * 
		 * System.out.println(row.getCell(k).getStringCellValue());
		 * 
		 * }
		 * 
		 * }
		 */
		
		
		Xls_Reader xl = new Xls_Reader("C:\\Users\\INDIAN\\Desktop\\JavaDocs\\Data.xlsx");
		
		File file = new File("C:\\Users\\INDIAN\\Desktop\\JavaDocs\\Data.xlsx");
		  FileInputStream fis = new FileInputStream(file);
		  
		  Workbook wb = new XSSFWorkbook(fis); Sheet sheet = wb.getSheet("Training");
		  int c = sheet.getLastRowNum()+1;
		  System.out.println("no of rows is "+c);
		
		//getLastRowNum() returns a number with the count starting from 0.
	}

}
