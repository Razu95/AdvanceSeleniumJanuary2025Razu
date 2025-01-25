package com.facebook_browserCommand;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToOpenAndCloseAppMethod {
	WebDriver driver;
	//openApp
	@BeforeMethod
	public void openApplication() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https:www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	//test
	@Test
	public void validLoginTest() {
		System.out.println("this is valid login");
		driver.findElement(By.id("email")).sendKeys("Razu");
		driver.findElement(By.id("pass")).sendKeys("HalaTala");
		driver.findElement(By.name("login")).click();
	}
	@Test
	public void invalidLoginTest() {
		System.out.println("this is invalid login");
		driver.findElement(By.id("email")).sendKeys("Razu");
		driver.findElement(By.id("pass")).sendKeys("HalaTala");
		driver.findElement(By.name("login")).click();
		
	}
	//closeApp
	@AfterMethod
	public void closeApplication() {
		//driver.quit();
		//driver.close();
	
	}
}
