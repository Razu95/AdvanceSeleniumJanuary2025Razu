package com.halatala;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.facebook_base.BaseTest;

public class ImJustCheckingSomething extends BaseTest {

	@Test
	public void tryingSomething () {
		WebElement Contact = driver.findElement(By.xpath("//a[text()='Contact Uploading & Non-Users']"));
		Contact.click();
	}
}
