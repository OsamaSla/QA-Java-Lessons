package com.saucedemo.automation;

import org.openqa.selenium.WebDriver;

/**
 * Contains all the login test cases based on the decision table. Uses a
 * data-driven approach to run multiple test cases with a single method.
 */
public class LoginTestCases {

	private WebDriver driver;
	private LoginPage loginPage;

	/**
	 * Inner class to hold test case data.
	 */
	public static class TestCaseData {
		String testCaseId;
		String username;
		String password;
		String expectedErrorMessage; // Null if success is expected
		boolean expectSuccess; // True if login is expected to succeed

		public TestCaseData(String testCaseId, String username, String password, String expectedErrorMessage,
				boolean expectSuccess) {
			this.testCaseId = testCaseId;
			this.username = username;
			this.password = password;
			this.expectedErrorMessage = expectedErrorMessage;
			this.expectSuccess = expectSuccess;
		}
	}

	/**
	 * Constructor for LoginTestCases.
	 *
	 * @param driver The WebDriver instance to be used across all test cases.
	 */
	public LoginTestCases(WebDriver driver) {
		this.driver = driver;
		this.loginPage = new LoginPage(driver);
	}

	/**
	 * Helper method to reset the browser to the login page before each test.
	 */
	private void resetBrowserToLoginPage() {
		driver.get("https://www.saucedemo.com/");
		// Optionally, add a small wait to ensure page loads fully
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt(); // Restore the interrupted status
		}
	}

	/**
	 * Runs a single login test case based on the provided data.
	 *
	 * @param testCaseId           The ID of the test case (e.g., "TC01").
	 * @param username             The username for the login attempt.
	 * @param password             The password for the login attempt.
	 * @param expectedErrorMessage The error message expected if login fails (null
	 *                             if success is expected).
	 * @param expectSuccess        True if a successful login is expected, false
	 *                             otherwise.
	 */
	public void runTestCase(String testCaseId, String username, String password, String expectedErrorMessage,
			boolean expectSuccess) {
		System.out.println("\n--- Running " + testCaseId + ": User: '" + username + "', Pass: '" + password + "' ---");
		resetBrowserToLoginPage();
		loginPage.login(username, password);

		if (expectSuccess) {
			// Expected: Successful login
			String expectedUrl = "https://www.saucedemo.com/inventory.html";
			String actualUrl = loginPage.getCurrentUrl();

			if (loginPage.isLoginSuccessful() && actualUrl.equals(expectedUrl)) {
				System.out.println(testCaseId + " - Pass: Login successful and redirected to products page.");
			} else {
				System.out.println(testCaseId + " - Fail: Login not successful or incorrect redirection.");
				System.out.println("Expected URL: " + expectedUrl + ", Actual URL: " + actualUrl);
				System.out.println("Is Login Successful (UI check): " + loginPage.isLoginSuccessful());
			}
		} else {
			// Expected: Failed login with a specific error message
			String actualErrorMessage = loginPage.getErrorMessage();

			if (expectedErrorMessage != null && expectedErrorMessage.equals(actualErrorMessage)) {
				System.out.println(testCaseId + " - Pass: Correct error message displayed.");
			} else {
				System.out.println(testCaseId + " - Fail: Incorrect or no error message displayed.");
				System.out.println("Expected: '" + expectedErrorMessage + "'");
				System.out.println("Actual: '"
						+ (actualErrorMessage != null ? actualErrorMessage : "No error message found") + "'");
			}
		}
	}
}