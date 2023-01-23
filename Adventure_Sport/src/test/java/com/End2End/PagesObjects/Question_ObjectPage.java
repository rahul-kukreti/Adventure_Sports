package com.End2End.PagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.End2End.Test_Regression.BaseClass;

public class Question_ObjectPage extends BaseClass {

	// Xpath for add questions

	
	By question_module = By.xpath("//a[@href='/question']");
	By add_ques = By.xpath("//a[@href='/add']");
	By ques_text = By.xpath("//textarea[@id='exampleForm.ControlTextarea1']");
	By country_dropdown = By.xpath("//select[@aria-label='Default select example']");
	By country_select = By.xpath("//option[contains(text(),'Bermo,JH,IN')]");
	By post_ques = By.xpath("//button[text()='Post']");
	By return_question = By.xpath("//a[@href='/question']//*[local-name()='svg']");
	By edit_ques = By.xpath("(//*[local-name()='svg' and @data-testid='EditTwoToneIcon'])[1]");
	By filter = By.xpath("//span[@class='filter-logo']");
	By select_filter = By.xpath("//select[@aria-label='Select Status']");
	By select_open_status = By.xpath("//select[@aria-label='Select Status']//child::option[2]");
	By select_close_status = By.xpath("//select[@aria-label='Select Status']//child::option[3]");
	By location_status = By.xpath("//input[contains(@id,'react-select')]");
	By country_option = By.xpath("//div[contains(text(),'Bermo,JH,IN')]");
	By button_apply = By.xpath("//button[contains(text(),'Apply')]");
	By selector_page = By.xpath("//select[@class='select-page-number']");
	By selector_page_count = By.xpath("//select[@class='select-page-number']//child::option[4]");
	By reset_button = By.xpath("//button[text()='Reset All Filters']");
	
	public void click_question_module(WebDriver driver) {
		commFunc.Explicitywait(driver, question_module);
		commFunc.Click(driver, question_module);
	}

	public void click_add_question(WebDriver driver) {
		commFunc.Explicitywait(driver, add_ques);
		commFunc.Click(driver, add_ques);
	}

	public void ques_details(WebDriver driver, String question) {
		commFunc.sendKeys(driver, ques_text, question);
	}
	
	public void select_country(WebDriver dirver) {
		commFunc.Explicitywait(dirver, country_dropdown);
		commFunc.Click(dirver, country_dropdown);
		commFunc.Click(dirver, country_select);
		
	}
	
	public void click_post(WebDriver driver) {
		commFunc.Explicitywait(driver, post_ques);
		commFunc.Click(driver, post_ques);
	}
	
	public void validate_blanked_ques(WebDriver dirver) {
		if(driver.findElements(By.xpath("//label[contains(text(),'Please enter question you want to ask.')]")).size()!=0) {
			System.out.println("Question validation message is displayed!");
		}
		else {
			System.err.println("Blanked question field passed!");
		}
	}
	
	public void validate_blanked_country(WebDriver dirver) {
		if(driver.findElements(By.xpath("//label[contains(text(),'Please select country')]")).size()!=0) {
			System.out.println("Country validation message is displayed!");
		}
		else {
			System.err.println("Blanked country field passed!");
		}
	}
	
	public void validate_success_ques(WebDriver dirver) {
		if(driver.findElements(By.xpath("//label[contains(text(),'Question added successfully.')]")).size()!=0) {
			System.out.println("Question success message is displayed!");
		}
		else {
			System.err.println("Question success message is not displayed!");
		}
	}
	
	public void validate_updated_ques(WebDriver dirver) {
		if(driver.findElements(By.xpath("//label[contains(text(),'Question updated successfully.')]")).size()!=0) {
			System.out.println("Question updated successfully!");
		}
		else {
			System.err.println("Question is not updated successfully!");
		}
	}
	
	public void ques_list(WebDriver driver) {
		commFunc.Explicitywait(driver, return_question);
		commFunc.Click(driver, return_question);
	}
	
	public void validate_ques_list(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		if(driver.findElements(By.xpath("(//span[text()='Hello how are u?'])[1]")).size()!=0) {
			System.out.println("Question is displayed in list!");
		}
		else {
			System.err.println("Question is not displayed in list!");
		}
	}
	
	public void click_edit_ques(WebDriver driver) {
		commFunc.Explicitywait(driver, edit_ques);
		commFunc.Click(driver, edit_ques);
	}
	
	public void eidt_ques(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(ques_text).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		driver.findElement(ques_text).sendKeys(Keys.chord(Keys.CONTROL, "x"));
	}
	
	public void click_filter(WebDriver driver) {
		commFunc.Explicitywait(driver, filter);
		commFunc.Click(driver, filter);
	}
	
	public void click_status(WebDriver driver) {
		commFunc.Explicitywait(driver, select_filter);
		commFunc.Click(driver, select_filter);
	}
	
	
	public void click_status_open(WebDriver driver) {
		commFunc.Explicitywait(driver, select_open_status);
		commFunc.Click(driver, select_open_status);
	}
	
	public void click_status_close(WebDriver driver) {
		commFunc.Explicitywait(driver, select_close_status);
		commFunc.Click(driver, select_close_status);
	}
	
	public void click_location_status(WebDriver driver) {
		commFunc.Explicitywait(driver, location_status);
		commFunc.Click(driver, location_status);
		commFunc.Click(driver, country_option);
	}
	
	public void filter_apply(WebDriver driver) {
		commFunc.Explicitywait(driver, button_apply);
		commFunc.Click(driver, button_apply);
	}
	
	public void select_page(WebDriver driver) {
		commFunc.Explicitywait(driver, selector_page);
		commFunc.Click(driver, selector_page);
		commFunc.Click(driver, selector_page_count);
	}
	
	public void validate_open_filter(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		if(driver.findElements(By.xpath("//p[text()='Closed']")).size()!=0) {
			System.err.println("closed status is diplayed in open status filter!");
		}
		else {
			System.out.println("Open status filter applied successfully!");
		}
	}
	
	public void validate_close_filter(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		if(driver.findElements(By.xpath("//p[text()='Open']")).size()!=0) {
			System.err.println("open status is diplayed in close status filter!");
		}
		else {
			System.out.println("Close status filter applied successfully!");
		}
	}
	
	public void click_reset_button(WebDriver driver) {
		commFunc.Explicitywait(driver, reset_button);
		commFunc.Click(driver, reset_button);
	}
	
	
	public void validate_reset_filter(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		if(driver.findElements(By.xpath("//p[text()='Open']")).size()!=0) {
		System.out.println("List reset successfully!");
		
		}
		else {
			System.err.println("Reset button is not working!");
		}
		}
}
