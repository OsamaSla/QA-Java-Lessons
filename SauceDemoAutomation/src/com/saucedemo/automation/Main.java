package com.saucedemo.automation;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\automation\\drivers\\msedgedriver.exe");
		// Should be implemented with Chrome .1
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

            // Create an instance of LoginTestCases, passing the WebDriver
            LoginTestCases testCases = new LoginTestCases(driver);

            System.out.println("--- Running All Login Test Cases ---");

            // Define all test case data
            List<LoginTestCases.TestCaseData> allTestCases = List.of(
                new LoginTestCases.TestCaseData("TC01", "standard_user", "secret_sauce", null, true),
                new LoginTestCases.TestCaseData("TC02", "standard_user", "invalid_password", "Epic sadface: Username and password do not match any user in this service", false),
                new LoginTestCases.TestCaseData("TC03", "standard_user", "", "Epic sadface: Password is required", false),
                new LoginTestCases.TestCaseData("TC04", "non_existent_user", "secret_sauce", "Epic sadface: Username and password do not match any user in this service", false),
                new LoginTestCases.TestCaseData("TC05", "non_existent_user", "wrong_password", "Epic sadface: Username and password do not match any user in this service", false),
                new LoginTestCases.TestCaseData("TC06", "non_existent_user", "", "Epic sadface: Password is required", false),
                new LoginTestCases.TestCaseData("TC07", "", "secret_sauce", "Epic sadface: Username is required", false),
                new LoginTestCases.TestCaseData("TC08", "", "invalid_password", "Epic sadface: Username is required", false),
                new LoginTestCases.TestCaseData("TC09", "", "", "Epic sadface: Username is required", false)
            );

            // Run all test cases using the consolidated method
            for (LoginTestCases.TestCaseData testCase : allTestCases) {
                testCases.runTestCase(
                    testCase.testCaseId,
                    testCase.username,
                    testCase.password,
                    testCase.expectedErrorMessage,
                    testCase.expectSuccess
                );
            }

            System.out.println("--- All Test Cases Finished ---");

//        } catch (Exception e) {
//            System.err.println("An error occurred during test execution: " + e.getMessage());
//            e.printStackTrace();
//        } finally {
//            // Ensure the browser is closed even if an error occurs
//            if (driver != null) {
                driver.quit();
                System.out.println("Browser closed.");
            }
        }
