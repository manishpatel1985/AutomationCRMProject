package com.crm.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	
	public static String TestData_Sheet_Path = "C:\\Selenium\\manishSelenium\\manishSelenium\\AutomtionCRMTestProject\\src\\main\\java\\com"
			+ "\\crm\\qa\\testdata\\CRMTestDataAutomation.xlsx";
	
	static Workbook book;
	static org.apache.poi.ss.usermodel.Sheet sheet;
	
	public static Object[][] getTestData(String sheetname) {
		
		FileInputStream file=null;
		try {
		file = new FileInputStream(TestData_Sheet_Path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
		book = WorkbookFactory.create(file);
		}catch (InvalidFormatException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
			
		}
		sheet=book.getSheet(sheetname);
		Object[][]data= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		//System.out.println(sheet.getLastRowNum()+"---------");
		//System.out.println(sheet.getRow(0).getLastCellNum());
		for(int i=0;i<sheet.getLastRowNum();i++) {
			for (int k=0;k<sheet.getRow(0).getLastCellNum();k++) {
				data[i][k]=sheet.getRow(i+1).getCell(k).toString();
				//System.out.println(data[i][k]);
			}
			
		}
		return data;
		
	}
	
	

	public static void takeScreenshotAtEndOfTest() throws IOException {
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentDir=System.getProperty("use.dir");
		FileUtils.copyFile(srcFile, new File(currentDir+"/screenshots/"+System.currentTimeMillis()+".png"));
	
	}

	
	
	
	
	
	

}
