package com.End2End.Test_Regression;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class LoginPage extends BaseClass {
	@Test(testName = "Blank details", priority = 5, enabled = true)
	public void missing_loginDetails() {
		logger = rep.startTest("Login page scenario");
		System.out.println("//For blanked email and blanked password....//");
		logger.log(LogStatus.INFO, "Window Switched");
		driver.get("https://adventuresportswebdev.iworklab.com/login");
		login.clickLogin(driver);
		login.validateLogin(driver);
		logger.log(LogStatus.INFO, "Login Missing fields are validated successfully!");
	}

	@Test(testName = "Missing passwordinfo",priority = 6,enabled= true)
	public void missingEmail() {
		driver.navigate().refresh();
		System.out.println("//For valid email and blanked password....//");
		login.loginDetails(driver,"kapil.kumar@mail.vinove.com", "");
		login.clickLogin(driver);
		login.validateLogin(driver);
	}
	
	@Test(testName = "Missing emailinfo",priority = 7,enabled= true)
	public void missingpassword() {
		driver.navigate().refresh();
		System.out.println("//For valid password and blanked email....//");
		login.loginDetails(driver,"", "Test@123");
		login.clickLogin(driver);
		login.validateLogin(driver);
	}
}
