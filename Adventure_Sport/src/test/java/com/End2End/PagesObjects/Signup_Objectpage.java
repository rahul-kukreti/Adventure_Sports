package com.End2End.PagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.End2End.Test_Regression.BaseClass;

public class Signup_Objectpage extends BaseClass {

	By Signup_button = By.xpath("//a[@href='/signup']");
	By email_placeholder = By.xpath("//input[@name='email']");
	By cemail_placeholder = By.xpath("//input[@name='confirmemail']");
	By fname = By.xpath("//input[@name='firstname']");
	By lname = By.xpath("//input[@name='lastname']");
	By password_placeholder = By.xpath("//input[@name='password']");
	By cpassword = By.xpath("//input[@name='confirmpassword']");
	By date_placeholder = By.xpath("//input[@type='date']");
	By phone_field = By.xpath("//input[@name='phone']");
	By dropdwon = By.xpath("//select[@class=' classNameic']");
	By next_button = By.xpath("//span[text()='Next']");

	public void clickRegisterbutton(WebDriver driver) {
		commFunc.Explicitywait(driver, Signup_button);
		commFunc.Click(driver, Signup_button);
	}
	
	public void clickNextbutton(WebDriver driver) {
		commFunc.Explicitywait(driver, next_button);
		commFunc.Click(driver, next_button);
	}

	public void validate_nextbutton(WebDriver driver) {
		
		if(driver.findElements(By.xpath("")).size()!=0) {
			System.out.println("Next page displayed!");
		}
		else {
			System.err.println("Data in fields are missing!");
		}
	}
		
		public void selectCountry(WebDriver driver, String country) {
			commFunc.Click(driver, dropdwon);
			commFunc.Click(driver,By.xpath(""));
		}
		public void selectState(WebDriver driver, String state) {
			commFunc.Click(driver, dropdwon);
			commFunc.Click(driver,By.xpath(""));
		}
		public void selectCity(WebDriver driver, String city) {
			commFunc.Click(driver, dropdwon);
			commFunc.Click(driver,By.xpath(""));
		}
		
		public void BasicInfo(WebDriver driver,String email,String cemail,String firstname,String lastname,String password,String cpasswords,String date,String phone) {
			commFunc.sendKeys(driver, email_placeholder, email);
			commFunc.sendKeys(driver, cemail_placeholder, cemail);
			commFunc.sendKeys(driver, fname, firstname);
			commFunc.sendKeys(driver, lname, lastname);
			commFunc.sendKeys(driver, password_placeholder, password);
			commFunc.sendKeys(driver, cpassword, cpasswords);
			commFunc.sendKeys(driver, date_placeholder, date);
			commFunc.sendKeys(driver, phone_field, phone);
		}
	} 

