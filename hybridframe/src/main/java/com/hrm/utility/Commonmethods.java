package com.hrm.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Commonmethods {

	public static String screenshot(WebDriver driver) throws IOException {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String sccreenshotpath = System.getProperty("user.dir") + "/screenshort/HRM-" + currenttime() + ".png";

		FileHandler.copy(src, new File(sccreenshotpath));

		return sccreenshotpath;

	}

	public static String currenttime() {
		DateFormat date = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentdate = new Date();
		return date.format(currentdate);
	}

	public static void dropdownbyvisibletext(WebDriver driver, WebElement element, String value) {

		Select slt = new Select(element);
		slt.selectByVisibleText(value);
	}

}
