package com.crm.qa.util;

import java.util.ArrayList;

public class GetDataFromExcelFreeCRMAutomation {
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> freeCRMAutomation() {
		
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		
		
		reader = new Xls_Reader("C:\\Selenium\\manishSelenium\\manishSelenium\\AutomtionCRMTestProject\\src\\main\\java\\com\\crm\\qa\\testdata\\CRMTestDataAutomation.xlsx");
		
		
	int rowNum=	reader.getRowCount("Sheet1");
		
		for(int rowcount=2;rowcount<=rowNum;rowNum++ ) {
			
		String firstname=	reader.getCellData("Sheet1", "firstname", rowNum);
		String lastname=	reader.getCellData("Sheet1", "lastname", rowNum);
		String middlename=	reader.getCellData("Sheet1", "middlename", rowNum);
		String company=		reader.getCellData("Sheet1", "company", rowNum);
			
			Object ob1[]= {firstname,lastname,middlename,company};
			mydata.add(ob1);
			
		}
		return mydata;
		
		
	}
	
	

}
