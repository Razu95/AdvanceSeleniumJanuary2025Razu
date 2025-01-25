package com.facebook_loginTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.facebook_base.BaseTest;

public class LoginTest extends BaseTest{
	
	@Test
	public void invalidLoginTest() {
		System.out.println("Valid login test");
		driver.findElement(By.id("email")).sendKeys("halatala@aol.com");
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.name("login")).click();
		
	}
	@Test
	public void validLoginTest() {
		System.out.println("Invalid login test");
		driver.findElement(By.id("email")).sendKeys("halatala@aol.com");
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.name("login")).click();

}
}
