package com.mycompany.pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {  // Constructor
		super(driver);		
	}
	
	public MyAccountPage clickMyAccount() {  // Tek bir method olusturduk, geri donus tipi/sayfasi MyAccounPage(Landing Page)
		
		clickMyAccount.click();
		
		return new MyAccountPage(driver);
		
		}
	
	
	

}
