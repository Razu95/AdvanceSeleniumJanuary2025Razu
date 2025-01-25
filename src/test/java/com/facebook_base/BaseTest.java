package com.facebook_base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BaseTest {
	public WebDriver driver ;
	public String browser="chrome";
	@BeforeMethod
	public void openApplication() {
		/* if else statement/conditional statement/ flow of statement 
		 * one or multiple if conditions with body of code
		 * one optional else block
		 * one of the condition will be true and only that block of code will run
		 */
		
		if (browser.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
			
		}else if (browser.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
			
		}else if (browser.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
		}else {
			System.out.println("Hello please use proper browser listed");
			driver= new ChromeDriver();
		}
		driver.get("https:www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void closeApplication() {
		if(driver!=null) {
			//driver.quit();
		}
	}
	
}



