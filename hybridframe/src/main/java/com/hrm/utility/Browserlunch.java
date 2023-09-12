package com.hrm.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserlunch {

	WebDriver driver;

	public static WebDriver startbrowser(WebDriver driver, String browsername, String url) {

		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");

			driver = new FirefoxDriver();
		} else if (browsername.equals("edge")) {
			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");

			driver = new EdgeDriver();
		} else {
			System.out.println("browser is not opening");
		}
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		return driver;
	}

	public static void quitbrowser(WebDriver driver) {
		driver.quit();
	}

}
