package com.facebook_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.facebook_base.BaseTest;

public class DirectLocators extends BaseTest{
	@Test
	public void idLocator () {
		WebElement idLocator= driver.findElement(By.id("email"));
		idLocator.sendKeys("HalaTala");
		
		WebElement passIdLoc=driver.findElement(By.id("pass"));
		passIdLoc.sendKeys("Yerrrr");}
	
		@Test
		public void clickContinue () {
		WebElement clickContinue=driver.findElement(By.name("login"));
		clickContinue.click();}
		
		@Test
		public void linkLocator () {
		WebElement linkLocator=driver.findElement(By.linkText("Forgot password?"));
		linkLocator.click();}
		
		@Test
		public void partialLocators() {
		WebElement partialLocator=driver.findElement(By.partialLinkText("Sign Up"));
		partialLocator.click();}
	}


