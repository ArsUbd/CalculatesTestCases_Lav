package com.pages;

import java.util.Hashtable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.browser.Driver;
import com.browser.DriverManager;
import com.listener.ListenerClass;
import com.reports.ExtentReport;
import com.utils.ReadPropertyFile;

import com.utils.TestUtils;


public class LoginPage extends BasePage{
	public LoginPage(Hashtable<String, String> data) {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}
	

@FindBy(id="companyid")
WebElement cmpnyid;
public WebElement getCmpnyID() {
	return cmpnyid;
}

@FindBy(id="username")
WebElement txtuserName;


@FindBy(id="password")
WebElement txtpassword;


@FindBy(xpath="//strong[text()='Log In']")
WebElement login;

@FindBy(xpath="//div[text()='Authenticating...']") 
WebElement authenticatingMessage;

		
	public void login(Hashtable<String, String> data) {
		String userName=data.get("User_Name");
		String password=data.get("Password");
		String companyID=data.get("Company_ID");
		sendkeys(cmpnyid,companyID);
		sendkeys(txtuserName,userName);
		sendkeys(txtpassword,password);
		click(login);
		
		for(int i=0;i<5;i++) {
			if(authenticatingMessage.isDisplayed()) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				break;
			}
		}
	}
}
