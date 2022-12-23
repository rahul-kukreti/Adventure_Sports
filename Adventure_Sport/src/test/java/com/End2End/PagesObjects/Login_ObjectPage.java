package com.End2End.PagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.End2End.Test_Regression.BaseClass;

public class Login_ObjectPage extends BaseClass {
	
	//xpath-----
	
	By login_button = By.xpath("//button[text()='Login']");
	By email_login = By.xpath("//input[@type='email']");
	By Password_login = By.xpath("//input[@type='password']");
	
	public void clickLogin(WebDriver driver) {
		commFunc.Explicitywait(driver, login_button);
		commFunc.Click(driver, login_button);
	}
	
	public void validateLogin(WebDriver driver) {
		if(driver.findElements(By.xpath("//label[contains(text(),'Email should not empty')]")).size()!=0){
			System.err.println("Email must be entered!");
		}
		else {
			System.out.println("Email Passed!");
		}
		
		if(driver.findElements(By.xpath("//label[contains(text(),'Password should not empty')]")).size()!=0) {
			System.err.println("Password must be entered!");
		}
		else {
			System.out.println("Password passed!");
		}
	}
	
	public void loginDetails(WebDriver driver,String emailogin,String password) {
		commFunc.sendKeys(driver, email_login, emailogin);
		commFunc.sendKeys(driver, Password_login, password);
	}

}
