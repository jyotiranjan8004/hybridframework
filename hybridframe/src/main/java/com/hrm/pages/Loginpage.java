package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {

	WebDriver driver;
	public Loginpage(WebDriver ldriver) {
		
		this.driver=ldriver;	
	}
	
	private @FindBy(name="username")WebElement uname;
	private @FindBy(name="password")WebElement pass;
	private @FindBy(xpath="//button[@type='submit']")WebElement button;
	
	
	
	public void usname(String username)
	{
		uname.sendKeys(username);
	}
	
	public void passwrd(String password)
	{
		pass.sendKeys(password);
	}
	
	public void loginbutton() {
		button.click();
	}
}
