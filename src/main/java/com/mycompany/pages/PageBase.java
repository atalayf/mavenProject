package com.mycompany.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

	WebDriver driver;

	public PageBase(WebDriver driver) { // Constructor
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void getTitle() {

		System.out.println(driver.getTitle());

	}

// 		=============== PAGE FACTORY ==========================
	
	//About Us		
	@FindBy(id= "menu-item-72")
	WebElement clickAboutUs;

	// MyAccount
	@FindBy(xpath = "//a[@title='My account']")
	WebElement clickMyAccount;

	// Username
	@FindBy(name = "username")
	WebElement username;

	// Password
	@FindBy(id = "password")
	WebElement password;

	// Remember Me
	@FindBy(name = "rememberme")
	WebElement rememberme;

	// Login Button
	@FindBy(name = "login")
	WebElement login;
	
	// WebTable Button	
	@FindBy(id="menu-item-79")
	WebElement webTableClick;
	
	// Web Table 
	@FindBy(id="testaccounts")
	WebElement myTable;
	
	
	

}
