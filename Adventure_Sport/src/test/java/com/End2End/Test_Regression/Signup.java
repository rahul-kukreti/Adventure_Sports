package com.End2End.Test_Regression;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class Signup extends BaseClass {

	@Test(testName = "Navigate to registerpage", priority = 1, enabled = true)
	public void Navigate_nextPage() {
		logger = rep.startTest("Signup-page scenarios.");
		sign.clickRegisterbutton(driver);
		logger.log(LogStatus.INFO, "Navigate to register page successfully!");
	}
	
	@Test(testName = "Missing field scenario", priority = 2, enabled = true)
	public void MissingField_validation() {
		sign.clickNextbutton(driver);
		sign.validate_nextbutton(driver);
		logger.log(LogStatus.INFO, "Missing fields are validated successfully!");
		
	}
	
	@Test(testName = "Password mismatch scenario", priority = 3, enabled = false)
	public void password_mismatch() {
		driver.navigate().refresh();
		sign.BasicInfo(driver,"jack_test@mailinator.com","jack_test@mailinator.com","Jack","test","Test@123","Test@12","22-04-1996","9876543215");
		sign.selectCountry(driver,"India");
		sign.selectState(driver,"Delhi");
		sign.selectCity(driver,"New Delhi");
		sign.clickNextbutton(driver);
		sign.validate_nextbutton(driver);
		logger.log(LogStatus.INFO, "Password mismatch validated successfully! ");
	}
	
	@Test(testName = "BasicInfo page scenario", priority = 4, enabled = false)
	public void BasicInfoPage() {
		driver.navigate().refresh();
		sign.BasicInfo(driver,"jack_test@mailinator.com","jack_test@mailinator.com","Jack","test","Test@123","Test@123","22-04-1996","9876543215");
		sign.selectCountry(driver,"India");
		sign.selectState(driver,"Delhi");
		sign.selectCity(driver,"New Delhi");
		sign.clickNextbutton(driver);
		sign.validate_nextbutton(driver);
		logger.log(LogStatus.INFO, "All fields are passed in BasicInfo page!");
	}
}