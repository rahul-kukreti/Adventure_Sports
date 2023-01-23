package com.End2End.Test_Regression;

import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

public class QuestionPage extends BaseClass {

	@Test(testName = "Blank question validation", priority = 13, enabled = true)
	public void missing_ques_Details() {
		logger = rep.startTest("Question module");
		System.out.println("//For blanked question");
		ques.click_question_module(driver);
		ques.click_add_question(driver);
		ques.ques_details(driver, "");
		
		ques.select_country(driver);
		ques.click_post(driver);
		ques.validate_blanked_ques(driver);
		ques.ques_list(driver);
		logger.log(LogStatus.INFO, "Validate blank question field successfully!");

	}

	@Test(testName = "Blank question validation", priority = 14, enabled = false)
	public void missing_country() {
		System.out.println("//For blanked country");
		ques.click_question_module(driver);
		ques.click_add_question(driver);
		ques.ques_details(driver, "How are you?");
		ques.click_post(driver);
		ques.validate_blanked_country(driver);
		ques.ques_list(driver);
		logger.log(LogStatus.INFO, "Validate blank country field successfully!");
	}

	@Test(testName = "Question added validation", priority = 15, enabled = false)
	public void question_add() throws InterruptedException {
		System.out.println("//For success question addition");
		ques.click_question_module(driver);
		ques.click_add_question(driver);
		ques.ques_details(driver, "How are you?");
		ques.select_country(driver);
		ques.click_post(driver);
		Thread.sleep(5000);
		ques.validate_success_ques(driver);
		ques.ques_list(driver);
		ques.validate_ques_list(driver);
		logger.log(LogStatus.INFO, "Validate added question successfully!");
	}

	@Test(testName = "Edit question validation", priority = 16, enabled = false)
	public void edit_question() throws InterruptedException {
		System.out.println("//For edit questions");
		ques.click_edit_ques(driver);
		ques.eidt_ques(driver);
		ques.ques_details(driver, "what you like?");
		ques.click_post(driver);
		Thread.sleep(5000);
		ques.validate_updated_ques(driver);
		ques.ques_list(driver);
		logger.log(LogStatus.INFO, "Validate updated question successfully!");
	}

	@Test(testName = "open filter", priority = 17, enabled = true)
	public void validate_open_filter() throws InterruptedException {
		System.out.println("//For open filter validation");
		ques.click_filter(driver);
		ques.click_status(driver);
		ques.click_status_open(driver);
		ques.click_location_status(driver);
		ques.filter_apply(driver);
		ques.select_page(driver);
		ques.validate_open_filter(driver);
		logger.log(LogStatus.INFO, "Validate open filter status successfully!");
	}

	@Test(testName = "Close filter", priority = 18, enabled = true)
	public void validate_close_filter() throws InterruptedException {
		System.out.println("//For close filter validation");
		ques.click_filter(driver);
		ques.click_status(driver);
		ques.click_status_close(driver);
		ques.filter_apply(driver);
		ques.select_page(driver);
		ques.validate_close_filter(driver);
		logger.log(LogStatus.INFO, "Validate close filter status successfully!");
	}
	
	@Test(testName = "validate reset filter", priority = 19, enabled = true)
	public void validate_reset_filter() throws InterruptedException {
		System.out.println("//For reset filter validation");
		ques.click_filter(driver);
		ques.click_reset_button(driver);
		ques.filter_apply(driver);
		ques.validate_reset_filter(driver);
		logger.log(LogStatus.INFO, "Validate reset filter status successfully!");
	}
}
