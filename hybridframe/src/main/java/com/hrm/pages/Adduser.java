package com.hrm.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Adduser {

	WebDriver driver;

	public Adduser(WebDriver ldriver) {

		this.driver = ldriver;
	}

	// PIM
	@FindBy(xpath = "//a[@class='oxd-main-menu-item' and @href='/web/index.php/pim/viewPimModule']")
	WebElement pimmenu;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement pimadd;
	@FindBy(name = "firstName")
	WebElement name;
	@FindBy(name = "lastName")
	WebElement lname;

	@FindBy(xpath = "//label[normalize-space()='Disabled']")
	WebElement radio;

	@FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	WebElement createlog;
	@FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']/following::input[@class='oxd-input oxd-input--active'][1]")
	WebElement newunam;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement newunam1;

	@FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']/following::input[@class='oxd-input oxd-input--active'][2]")
	WebElement newpass;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[4]/div[1]/div[2]/div[1]/div[2]/input[1]")
	WebElement newconfpass;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	WebElement savebt;
	@FindBy(xpath = "//div[@class='oxd-table-header-cell oxd-padding-cell oxd-table-th' and @style='flex: 1 1 0%;'][8]/following::div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']")
	WebElement record;
	@FindBy(xpath="//label[contains(text(),'Employee Name')]/following::input[@placeholder='Type for hints...'][1]")WebElement empserch;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']") WebElement serchbutn;
	@FindBy(xpath="//a[contains(text(),'Employee List')]") WebElement emplist;

	// ADMIN
	@FindBy(xpath = "//a[@class='oxd-main-menu-item']")
	WebElement admin;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement addbutton;
	@FindBy(xpath = "//label[contains(text(),'User Role')]/following::div[@class='oxd-select-text-input'][1]")
	List<WebElement> userrrolldropdown;
	@FindBy(xpath = "//label[contains(text(),'User Role')]/following::div[@class='oxd-select-text-input'][2]")
	List<WebElement> userstatus;
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	WebElement empname;
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']")
	WebElement empuname;
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']")
	WebElement emppass;
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']")
	WebElement empconfpass;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement savebutton;

	public void useraddpimmenu() {
		pimmenu.click();
	}

	public void pimaddbutton() {
		pimadd.click();
	}

	public void firstname(String uname) {
		name.click();
		name.sendKeys(uname);
	}

	public void lastname(String lastname) {
		lname.click();
		lname.sendKeys(lastname);
	}

	public void createlogindetails() {
		createlog.click();
	}

	public void usernamenewemp(String username) {
		newunam1.click();
		newunam1.sendKeys(username);
	}

	public void passwordnewemp(String newpas) {
		newpass.click();
		newpass.sendKeys(newpas);

	}

	public void confpassnewemp(String confpass) {
		newconfpass.click();
		newconfpass.sendKeys(confpass);
	}

	public void statuscheck() {
		// List <WebElement> ep=
		// driver.findElements(By.xpath("//input[@type='radio']"));
		// for(WebElement e:ep) {
		// if(e.getAttribute("value").equalsIgnoreCase("2"));
		// e.click();
		Actions act = new Actions(driver);
		act.moveToElement(radio).click().perform();
	}

	public void empsave() {
		savebt.click();
	}
	
	public void emplists() {
emplist.click();
	}
	
	public void empsearch(String empname) {
		empserch.click();
		empserch.sendKeys(empname);
	}
	
	public void searchclicked() {
		serchbutn.click();
	}
	
	public void searchedempclicked()  {
		record.click();
		
		

	}
	


	/*
	 * public void adminclick() throws InterruptedException { admin.click();
	 * 
	 * }
	 * 
	 * public void addclick() throws InterruptedException {
	 * 
	 * addbutton.click();
	 * 
	 * }
	 * 
	 * public void userroledropdown(String roles) { for (WebElement element :
	 * userrrolldropdown) if (element.getText().equals(roles)) { element.click();
	 * System.out.println(element);
	 * 
	 * break; } }
	 * 
	 * public void statusdropdown(String status) { for (WebElement element :
	 * userstatus) if (element.getText().equals(status)) { element.click(); break; }
	 * }
	 * 
	 * public void empname(String empnam) { empname.click();
	 * empname.sendKeys(empnam); }
	 * 
	 * public void username(String uname) { empuname.click();
	 * empuname.sendKeys(uname); }
	 * 
	 * public void password(String pass) { emppass.click(); emppass.sendKeys(pass);
	 * 
	 * }
	 * 
	 * public void confpassword(String pass) { empconfpass.click();
	 * empconfpass.sendKeys(pass);
	 * 
	 * }
	 * 
	 * 
	 * public void clicksave() { savebutton.click(); }
	 */
}
