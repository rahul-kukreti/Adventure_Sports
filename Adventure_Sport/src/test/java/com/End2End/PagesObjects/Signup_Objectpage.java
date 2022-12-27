package com.End2End.PagesObjects;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.End2End.Test_Regression.BaseClass;

public class Signup_Objectpage extends BaseClass {
	
	//public static Random randomGenerator = null;

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

	// xpath for other details page

	By screen_name = By.xpath("//input[@name='screen_name']");
	
	// xpath for personal page
	
	By submit_btn = By.xpath("//span[contains(text(),'Submit')]");
	By checkbox_icon = By.xpath("//input[@type='checkbox']");

	public void clickRegisterbutton(WebDriver driver) {
		commFunc.Explicitywait(driver, Signup_button);
		commFunc.Click(driver, Signup_button);
	}

	public void clickNextbutton(WebDriver driver) {
		commFunc.Explicitywait(driver, next_button);
		commFunc.Click(driver, next_button);
	}

	public void validate_nextbutton(WebDriver driver, String button_text) {
		if (driver.findElements(By.xpath("//h2[text()='" + button_text + "']")).size() != 0) {
			System.out.println("Next page displayed!");
		} else {
			System.err.println("Data in fields are missing!");
		}
	}

	public void selectCountry(WebDriver driver, String country) {
		commFunc.Click(driver, dropdwon);
		commFunc.Click(driver, By.xpath("//option[text()='" + country + "']"));
	}

	public void selectState(WebDriver driver, String state) {
		commFunc.Click(driver, dropdwon);
		commFunc.Click(driver, By.xpath("//option[text()='" + state + "']"));
	}

	public void selectCity(WebDriver driver, String city) {
		commFunc.Click(driver, dropdwon);
		commFunc.Click(driver, By.xpath("//option[text()='" + city + "']"));
	}
	
	public void selectGender(WebDriver driver, String gender) {
		commFunc.Click(driver, dropdwon);
		commFunc.Click(driver, By.xpath("//option[text()='" + gender + "']"));
	}
	
	public void selectStatus(WebDriver driver, String statuss) {
		commFunc.Click(driver, dropdwon);
		commFunc.Click(driver, By.xpath("//option[text()='" + statuss + "']"));
	}

	public void selectTravelling(WebDriver driver) {
		commFunc.Click(driver, dropdwon);
		commFunc.Click(driver, By.xpath("//option[contains(text(),'No')]"));
	}

	
	public void generateRandomEmail(WebDriver driver) {
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000); 
		commFunc.sendKeys(driver,email_placeholder,"test"+ randomInt+"@mailinator.com");

	}
	
	public void pasteEmail(WebDriver driver) {
		driver.findElement(email_placeholder).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		driver.findElement(email_placeholder).sendKeys(Keys.chord(Keys.CONTROL, "c"));
		driver.findElement(cemail_placeholder).sendKeys(Keys.chord(Keys.CONTROL, "v"));
	}
	
	
	public void BasicInfo(WebDriver driver, String firstname, String lastname,
			String password, String cpasswords, String date, String phone) {
		commFunc.sendKeys(driver, fname, firstname);
		commFunc.sendKeys(driver, lname, lastname);
		commFunc.sendKeys(driver, password_placeholder, password);
		commFunc.sendKeys(driver, cpassword, cpasswords);
		commFunc.sendKeys(driver, date_placeholder, date);
		commFunc.sendKeys(driver, phone_field, phone);
	}

	public void screen_name(WebDriver driver) {
		
		Random randomGenerator = new Random(); 
		int randomInt = randomGenerator.nextInt(1000);
		commFunc.clicabilityWait(driver, screen_name);
		commFunc.sendKeys(driver, screen_name,"test"+randomInt);
	}

	
	public void validateAlert(WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		try {
		if(wait.until(ExpectedConditions.alertIsPresent())!=null)
		    System.out.println("alert was present");
	}
		catch(Exception e) {
			System.err.println("alert was not present");
			}
		}
	
	public void acceptAlert(WebDriver driver) {
		Alert simpleAlert = driver.switchTo().alert();
	    simpleAlert.accept();
	}
	
	public void clickChcekbox(WebDriver driver) {
		commFunc.Explicitywait(driver, checkbox_icon);
		commFunc.Click(driver, checkbox_icon);
	}
	
	public void clickSubmitbutton(WebDriver driver) {
		commFunc.Explicitywait(driver, submit_btn);
		commFunc.Click(driver, submit_btn);
	}
}
