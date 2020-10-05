package com.qa.TestNGRunner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestNGRunnerClass {

	public static void main(String[] args) {
		TestNG runner = new  TestNG();
		
		List<String> list= new ArrayList<String>();
		
		list.add("C:\\Selenium\\manishSelenium\\manishSelenium\\AutomtionCRMTestProject\\test-output\\testng-failed.xml");
		
		runner.setTestSuites(list);
		
		runner.run();
	}

}
