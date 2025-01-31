package com.facebook_webElementCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.facebook_base.BaseTest;

public class DropDown extends BaseTest {
// How do you manage drop down in selenium== select method = Select select= new Select(nested WebElement);
	//@Test
	public void selectByVisableText() {
		WebElement createAccount = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
		createAccount.click();
		// this is the WebElement
		WebElement month = driver.findElement(By.id("month"));

		// Select(month); is what the nested WebElement is, You took the WebElement you
		// created and nested
		// with in the Select method
		Select select = new Select(month);

		select.selectByVisibleText("Mar");
		System.out.println(select.getFirstSelectedOption());

	}

	//@Test
	public void selectByVisibleIndex() {
		WebElement createAccount = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
		createAccount.click();
		WebElement day = driver.findElement(By.id("day"));
		Select daySelect = new Select(day);
		//for selectByIndex remember that the values start from 0, for example you want to chose the 20th of the 
		//month you would put 19 in the selectByIndex(19)
		daySelect.selectByIndex(9);
		
		
	}
	
	//@Test
	public void selectByVisibleValue() {
		WebElement createAccount = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
		createAccount.click();
		WebElement year = driver.findElement(By.id("year"));
		Select yearSelect= new Select(year);
		yearSelect.selectByValue("2018");
	}
	
	@Test
	public void testItAll() {
		WebElement createAccount = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
		createAccount.click();
		// this is the WebElement
		WebElement month = driver.findElement(By.id("month"));

		// Select(month); is what the nested WebElement is, You took the WebElement you
		// created and nested
		// with in the Select method
		Select select = new Select(month);

		select.selectByVisibleText("Mar");
		System.out.println(select.getFirstSelectedOption());
		
		WebElement day = driver.findElement(By.id("day"));
		Select daySelect = new Select(day);
		//for selectByIndex remember that the values start from 0, for example you want to chose the 20th of the 
		//month you would put 19 in the selectByIndex(19)
		daySelect.selectByIndex(9);
		
		
		WebElement year = driver.findElement(By.id("year"));
		Select yearSelect= new Select(year);
		yearSelect.selectByValue("2018");
		

		
		
	}

}

