package com.mycompany.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class MyAccountPage extends PageBase {

	public MyAccountPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	public MyAccountPage asLogin(String uname, String pword) throws InterruptedException {
		
		username.sendKeys(uname);
		password.sendKeys(pword);
		rememberme.click();
		login.click();
		
		Thread.sleep(3000);
				
		return new MyAccountPage(driver);	
		
	}
	
	public MyAccountPage clickAboutUS() {
		
		clickAboutUs.click();
		
		return new MyAccountPage(driver);		
		
	}
	
	
	public MyAccountPage webTable() {
		
		webTableClick.click();
		
		WebTable wTable = new WebTable(myTable);
		
		System.out.println("Row Count is: " + wTable.getRowCount());
		System.out.println("Column Count: " + wTable.getColumnCount());
		System.out.println("Cell 4 X 1 is: " + wTable.getCellElement(3, 2).getText());
		
		System.out.println("Row With user1 Text is: " + wTable.getRowElement("user3").getText());
		System.out.println();

//  	=================================================================
		
		
		System.out.println("=Usernames    Passwords=");		
		String[][] tableData = wTable.getCellTextFromTable();
		for (String[] row : tableData) {  
			for (String cell:row) {			
				System.out.print(cell + "     "); 		}				
			System.out.println();	}			
		return new MyAccountPage(driver);			
	}
	

	
	

}
