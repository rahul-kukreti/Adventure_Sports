package com.End2End.Test_Regression;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class Signup extends BaseClass {

	@Test(testName = "Navigate to registerpage", priority = 1, enabled = true)
	public void Navigate_nextPage() {
		logger = rep.startTest("Signup-page scenarios.");
		System.out.println("//To redirect on register page");
		sign.clickRegisterbutton(driver);
		logger.log(LogStatus.INFO, "Navigate to register page successfully!");
	}

	@Test(testName = "Missing field scenario", priority = 2, enabled = true)
	public void MissingField_validation() {
		sign.clickNextbutton(driver);
		System.out.println("//To directly clicked on next button!");
		sign.validate_nextbutton(driver, "Other details");
		logger.log(LogStatus.INFO, "BasicInfo page Missing fields are validated successfully!");

	}

	@Test(testName = "Password mismatch scenario", priority = 3, enabled = true)
	public void password_mismatch() {
		driver.navigate().refresh();
		System.out.println("//For password mismatch!");
		sign.generateRandomEmail(driver);
		sign.pasteEmail(driver);
		sign.BasicInfo(driver, "Jack", "test", "Test@123", "Test@12", "22-04-1996", "9876543215");
		sign.selectCountry(driver, "India");
		sign.selectState(driver, "Delhi");
		sign.selectCity(driver, "New Delhi");
		sign.clickNextbutton(driver);
		sign.validate_nextbutton(driver, "Other details");
		logger.log(LogStatus.INFO, "Password mismatch validated successfully! ");
	}

	@Test(testName = "BasicInfo page scenario", priority = 4, enabled = true)
	public void BasicInfoPage() {
		driver.navigate().refresh();
		sign.generateRandomEmail(driver);
		sign.pasteEmail(driver);
		System.out.println("//To redirect on other page success!!");
		sign.BasicInfo(driver, "Jack", "test", "Test@123", "Test@123", "22-04-1996", "9876543215");
		sign.selectCountry(driver, "India");
		sign.selectState(driver, "Delhi");
		sign.selectCity(driver, "New Delhi");
		sign.clickNextbutton(driver);
		sign.validate_nextbutton(driver, "Other details");
		logger.log(LogStatus.INFO, "All fields are passed in BasicInfo page!");
	}

	@Test(testName = "Other detail page blanked", priority = 5, enabled = true)
	public void validateOtherpage() {
		System.out.println("//To directly clicked on next button in Other page detail!");
		sign.clickNextbutton(driver);
		sign.validate_nextbutton(driver, "Personal details");
		logger.log(LogStatus.INFO, "Other detail page missing fields are validated successfully!");

	}

	@Test(testName = "Other page details scenario", priority = 6, enabled = true)
	public void OtherInfoPage() throws InterruptedException {
		// driver.navigate().refresh();
		System.out.println("//To redirect on personal details page!!");
		Thread.sleep(3000);
		sign.screen_name(driver);
		sign.selectTravelling(driver);
		sign.clickNextbutton(driver);
		sign.validate_nextbutton(driver, "Personal details");
		logger.log(LogStatus.INFO, "All fields are passed in OtherInfo page!");
	}

	@Test(testName = "PersonalInfo page blnaked", priority = 7, enabled = true)
	public void validateperosnalpage() {
		System.out.println("//To directly click on personal info page!");
		sign.clickSubmitbutton(driver);
		sign.validateAlert(driver);
		logger.log(LogStatus.INFO, "Personal detail page missing fields are validated successfully!");
	}

	@Test(testName = "Signup Successfully", priority = 8, enabled = true)
	public void signupSuccess() {
		System.out.println("//To signUp successfully!");
		sign.selectGender(driver,"Male");
		sign.selectStatus(driver,"Student");
        sign.clickChcekbox(driver);
        sign.clickSubmitbutton(driver);
        sign.validateAlert(driver);
        sign.acceptAlert(driver);
        logger.log(LogStatus.INFO, "Signup successfully done!");
	}
}