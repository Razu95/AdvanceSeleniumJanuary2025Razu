package com.facebook_webElementCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.facebook_base.BaseTest;

public class RadioButton extends BaseTest {
	@Test
	public void radioButtonTest() {
		WebElement createAccount = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
		createAccount.click();
		WebElement female = driver.findElement(By.xpath("//input[@value='1']"));
		female.click();
		boolean femaleSelected = female.isSelected();
		System.out.println(femaleSelected);
		// same thing as the other sysout System.out.println(female.isSelected());

		if (femaleSelected) {
			System.out.print("user is female");
		} else {
			System.out.println("user is male");
		}
	}

}
