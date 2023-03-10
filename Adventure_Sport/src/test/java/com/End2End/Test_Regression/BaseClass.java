package com.End2End.Test_Regression;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import com.End2End.PagesObjects.Login_ObjectPage;
import com.End2End.PagesObjects.Question_ObjectPage;
import com.End2End.PagesObjects.Signup_Objectpage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.utility.*;

public class BaseClass {
	public static WebDriver driver;
	
	//ExtentReport;
	public ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest logger;
	public static CommonFunctions commFunc = new CommonFunctions();;
	public static BrowserFactory browserSelect = new BrowserFactory();
	//public static SoftAssert softAssert = new SoftAssert();
	public static Signup_Objectpage sign = new Signup_Objectpage();
	public static Login_ObjectPage login = new Login_ObjectPage();
	public static Question_ObjectPage ques = new Question_ObjectPage();
	
	@Parameters({"enviroment"})
	@BeforeSuite(description = "initializing Driver", alwaysRun= true)
	public void initializeDriver(String enviroment) throws InterruptedException {
			driver = browserSelect.openChromeIncongnito();
			driver.manage().window().maximize();
			driver.get("https://adventuresportswebdev.iworklab.com");
			
	}

	}
