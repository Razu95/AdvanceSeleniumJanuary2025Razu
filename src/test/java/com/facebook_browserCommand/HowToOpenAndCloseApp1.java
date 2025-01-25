package com.facebook_browserCommand;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToOpenAndCloseApp1 {
	WebDriver driver;
	//openApp
	@BeforeTest
	public void openApplication() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https:www.facebook.com/");
		//how do you maximize	
		driver.manage().window().maximize();
		//what is implicit wait? wait until find elements
		//(Duration.ofSeconds(10)== wait maximum 10 seconds
		//if you find before 10 seconds than do not wait anymore goto next line
		//if you can not find it in 10 seconds then fail the application==Not found exception
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	//test
	@Test
	public void userNameTest() {
		System.out.println("this is user name");
		driver.findElement(By.id("email")).sendKeys("Razu");
	}
	@Test
	public void passWordTest() {
		System.out.println("this is password");
		driver.findElement(By.id("pass")).sendKeys("HalaTala");
	}
	@Test
	public void loginButtonTest() {
		System.out.println("this is login button");
		driver.findElement(By.name("login")).click();
	}
	//closeApp
	@AfterTest
	public void closeApplication() {
		driver.quit();
		//driver.close();
	
	}
}
