package com.pages;

import java.io.IOException;
import java.util.Hashtable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

		
	@FindBy(xpath="//span[text()='EXCEPTION PER COUNTRY FOR']")
	WebElement txt_exceptionpercountryfor;
		
		
	public void test(Hashtable<String, String> data) throws InterruptedException, IOException {
		
		
	}
	
}
