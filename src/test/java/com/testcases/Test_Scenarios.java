package com.testcases;

import java.io.IOException;
import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.browser.Driver;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.PrimaryApplicantPage;

public class Test_Scenarios extends BaseTest{
	
	
	HomePage homepage  =new HomePage();;
	

	@Test
	public void Scenario_1(Hashtable<String,String> data) throws InterruptedException, IOException {
		LoginPage loginpage = new LoginPage(data);
		loginpage.login(data);
		PrimaryApplicantPage applicationPage=new PrimaryApplicantPage(data);
        applicationPage.newApplicant(data);
        applicationPage.addApplicantDetails(data);
        applicationPage.amountInitial(data);
        applicationPage.details(data);
        applicationPage. primaryAddressDetails(data);
        applicationPage.employementType(data);
        applicationPage.reference(data);
        applicationPage.firstTerm(data);
        applicationPage.submit(data);
		}
}
