package com.facebook_webElementCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.facebook_base.BaseTest;

public class WebElementCommand extends BaseTest {
	
	//to run this test take away the **//**
	//@Test
	public void inputBox() {
		// how many ways can you manage input box/ send button/
		// make sure you have the clear button
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("jjj@email.com");

	}
	//to run this test take away the **//**
	//@Test
	public void inputBoxWithVariable() {
		// ****this is the more popular way****
		// how many ways can you manage input box/ send button/
		// make sure you have the clear button
		driver.findElement(By.id("email")).clear();
		WebElement userName = driver.findElement(By.id("email"));
		userName.clear();
		userName.sendKeys("jjj@email.com");
	}
	//to run this test take away the **//**
	//@Test
	public void button() {
		/*
		 * WebElement is the data type
		 * loginButton is the varible name
		 * **driver.findElement(By.name("login"));** is the value
		 */
		WebElement loginButton=driver.findElement(By.name("login"));
		loginButton.click();
		//Another way to click on button .submit();
		loginButton.submit();
		//this is another way to click on button .sendKeys(Keys.ENTER);
		loginButton.sendKeys(Keys.ENTER);
		
		
	}
	//to run this test take away the **//**
	//@Test
	public void linkButton () {
		//<a href="https://www.facebook.com/recover/initiate/
				//?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90a
				//W1lIjoxNzM3OTE2ODkyLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NT
				//c1OTQ2fQ%3D%3D&amp;ars=facebook_login&amp;next" id="u_0_6_R1">Forgot password?</a>
				
				//link starts with <a href /a>
				//link text= >Forget password?<
		
		WebElement linkText=driver.findElement(By.linkText("Forgot password?"));
		linkText.click();
	}
	
	@Test
	public void partialLinkText() {
		/*
		 * why do we use partial link text?
		 * partialLinkText: used to avoid compound values
		 * what is compound values? they are values that are to big, space in the middle, number in the middle.
		 */
		WebElement contact=driver.findElement(By.partialLinkText("Contact"));
		contact.click();
	}
	
}
