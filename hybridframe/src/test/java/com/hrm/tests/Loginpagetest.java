package com.hrm.tests;


import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.hrm.pages.Adduser;
import com.hrm.pages.Loginpage;
import com.hrm.utility.Global;

public class Loginpagetest extends Global {

	@Test
	public void appopen() throws IOException, InterruptedException {
		
		logger=report.createTest("TC-01: Login to HRM");
		
		Loginpage login = PageFactory.initElements(driver, Loginpage.class);
		login.usname(input.getexceldata("inputdata", 1, 0));
		logger.info("Step 1:Username Entered");
		login.passwrd(input.getexceldata("inputdata", 1, 1));
		logger.info("Step 2:Password Entered");
		login.loginbutton();
		logger.info("Step 3:Clickedd on Login Button");
		Thread.sleep(2000);
		logger.pass("Login successful");
		
	}
	@Test

	public void useraddtest() throws Throwable {
		logger=report.createTest("TC-02: Add User to HRM");

			Adduser add=PageFactory.initElements(driver, Adduser.class);
				Thread.sleep(2000);
		/*	add.adminclick();
		Thread.sleep(5000);

		add.addclick();;
		Thread.sleep(5000);
		add.userroledropdown(input.getexceldata("inputdata", 1,2));
		Thread.sleep(5000);
		add.statusdropdown(input.getexceldata("inputdata", 1, 3));
		add.empname(input.getexceldata("inputdata", 2, 0));
		add.password(input.getexceldata("inputdata", 2, 1));
		add.confpassword(input.getexceldata("inputdata", 1, 5));
		add.clicksave();
	*/	
		
		add.useraddpimmenu();
		Thread.sleep(3000);
		add.pimaddbutton();
		Thread.sleep(2000);

		add.firstname(input.getexceldata("inputdata", 1, 6));
		add.lastname(input.getexceldata("inputdata", 1, 7));
		add.createlogindetails();
		Thread.sleep(2000);

		add.usernamenewemp(input.getexceldata("inputdata", 2, 0));
		add.passwordnewemp(input.getexceldata("inputdata", 2, 1));
		add.confpassnewemp(input.getexceldata("inputdata", 1, 5));
		Thread.sleep(2000);

		add.statuscheck();
		Thread.sleep(2000);

		add.empsave();
		Thread.sleep(10000);
		
		add.emplists();
		Thread.sleep(2000);

		add.empsearch(input.getexceldata("inputdata", 1, 6));
		Thread.sleep(2000);

		add.searchclicked();
		
		Thread.sleep(2000);

		add.searchedempclicked();
		Thread.sleep(2000);



		
	}
	
	}
	

