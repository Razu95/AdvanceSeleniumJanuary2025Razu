package com.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTest {
	WebDriver driver;
		@Test
		public void m1Test() {
			System.out.println("hello razu miah selenium tester ");
			//
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");			
		}
}
