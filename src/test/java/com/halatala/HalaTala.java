package com.halatala;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HalaTala {
	WebDriver hello;
	
	@Test
	public void myFirstTest() {
		System.out.println("Hello world");
		WebDriverManager.chromedriver().setup();
		hello= new ChromeDriver();
		hello.get("https://www.facebook.com/");
		
	}
	

}
