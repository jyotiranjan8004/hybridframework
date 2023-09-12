package com.hrm.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Global {
	public WebDriver driver;
	public Testdataprovider input;
	public Configdataprovider configd;
	public ExtentReports report;
	public ExtentTest logger;

	@BeforeSuite
	public void globalobject() {

		input = new Testdataprovider();
		configd = new Configdataprovider();
		ExtentSparkReporter extent=new ExtentSparkReporter(new File(System.getProperty("user.dir")+"/reports/HRM-"+Commonmethods.currenttime()+".html"));
		report =new ExtentReports();
		report.attachReporter(extent);
		
	}

	@BeforeClass
	public void opensetup() {

		driver = Browserlunch.startbrowser(driver, configd.getbrowser(), configd.geturl());
	}

	@AfterMethod
	public void testcasseresult(ITestResult result) throws IOException   {
		
		if(result.getStatus()==ITestResult.FAILURE) {
			//Commonmethods.screenshot(driver);
			logger.fail("Test Faield",MediaEntityBuilder.createScreenCaptureFromPath(Commonmethods.screenshot(driver)).build());
			
		}
			else if(result.getStatus()==ITestResult.SUCCESS) {
				//Commonmethods.screenshot(driver);
				logger.pass("Test Passed",MediaEntityBuilder.createScreenCaptureFromPath(Commonmethods.screenshot(driver)).build());

			}
			else if (result.getStatus()==ITestResult.SKIP){
				//Commonmethods.screenshot(driver);
				logger.skip("Test Skiped",MediaEntityBuilder.createScreenCaptureFromPath(Commonmethods.screenshot(driver)).build());

			}
		report.flush();
		}
	

	@AfterClass
	public void closesetup() {
		Browserlunch.quitbrowser(driver);
	}
}
