package com.mycompany.tests;

import org.testng.annotations.Test;

public class LoginTest extends TestBase {

	@Test(dataProvider="login")
	public void successfulLogin(String uname, String pword) throws InterruptedException {

		homePage.clickMyAccount().asLogin(uname, pword).clickAboutUS().webTable();
	}

	
	@Test(dataProvider="login")
	public void successfulLog(String uname, String pword) throws InterruptedException {

		homePage.clickMyAccount().asLogin(uname, pword).clickAboutUS().webTable();
	}

	
	
	
}
