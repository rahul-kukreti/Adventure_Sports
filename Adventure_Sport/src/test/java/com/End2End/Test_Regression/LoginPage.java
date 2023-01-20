package com.End2End.Test_Regression;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class LoginPage extends BaseClass {
	@Test(testName = "Blank details", priority = 9, enabled = true)
	public void missing_loginDetails() {
		logger = rep.startTest("Login page scenario");
		System.out.println("//For blanked email and blanked password....");
		logger.log(LogStatus.INFO, "Window Switched");
		driver.get("https://adventuresportswebdev.iworklab.com/login");
		login.clickLogin(driver);
		login.validateLogin(driver);
		logger.log(LogStatus.INFO, "Login Missing fields are validated successfully!");
	}

	@Test(testName = "Missing passwordinfo",priority = 10,enabled= false)
	
	public void missingEmail() {
		driver.navigate().refresh();
		System.out.println("//For valid email and blanked password....");
		login.loginDetails(driver,"kapil.kumar@mail.vinove.com", "");
		login.clickLogin(driver);
		login.validateLogin(driver);
		logger.log(LogStatus.INFO, "Password Missing fields are validated successfully!");
	}
	
	@Test(testName = "Missing emailinfo",priority = 11,enabled= false)
	public void missingpassword() {
		driver.navigate().refresh();
		System.out.println("//For valid password and blanked email....");
		login.loginDetails(driver,"", "Test@123");
		login.clickLogin(driver);
		login.validateLogin(driver);
		logger.log(LogStatus.INFO, "Email Missing fields are validated successfully!");
	}
	
	@Test(testName = "Login success",priority = 12,enabled= true)
	public void LoginSuccess() throws InterruptedException {
		driver.navigate().refresh();
		System.out.println("//For valid password and email....");
		login.loginDetails(driver,"kapil.kumar@mail.vinove.com", "Test@123");
		login.clickLogin(driver);
		login.LoginSucess(driver);
		logger.log(LogStatus.INFO, "Login page are validated successfully!");
	}
}
