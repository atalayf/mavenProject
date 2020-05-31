package com.mycompany.util;

import java.security.InvalidParameterException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	public static WebDriver createDriver(String browser)  {
		
		WebDriver driver;		
	
	
	if(browser.equalsIgnoreCase("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "Util\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if (browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "Util\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	
	
	else {
		
		throw new InvalidParameterException(browser + "is not a valid browser");
	}

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	
	return driver;	
	
	}
	
	public static void quitDriver(WebDriver driver) {
		
		driver.quit();  // driver.close();
	}

}