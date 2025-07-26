package com.saucedemo.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	private WebDriver driver;
	private WebDriverWait wait;

	// Locators for elements on the login page
	private final By usernameField = By.cssSelector("#user-name");
	private final By passwordField = By.cssSelector("#password");
	private final By loginButton = By.cssSelector("#login-button");
	private final By errorMessage = By.cssSelector("h3[data-test='error']"); // More robust selector for error message
	private final By productsPageTitle = By.cssSelector(".title"); // Locator for products page title

	/**
	 * Constructor for LoginPage.
	 *
	 * @param driver The WebDriver instance.
	 */
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		// Initialize WebDriverWait with a timeout of 10 seconds
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	/**
	 * Enters the username into the username field.
	 *
	 * @param username The username to enter.
	 */
	public void enterUsername(String username) {
		// Wait until the username field is visible and enabled before sending keys
		WebElement userElement = wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField));
		userElement.sendKeys(username);
	}

	/**
	 * Enters the password into the password field.
	 *
	 * @param password The password to enter.
	 */
	public void enterPassword(String password) {
		// Wait until the password field is visible and enabled before sending keys
		WebElement passElement = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
		passElement.sendKeys(password);
	}

	/**
	 * Clicks the login button.
	 */
	public void clickLoginButton() {
		// Wait until the login button is clickable before clicking
		WebElement loginElement = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginElement.click();
	}

	/**
	 * Performs a login attempt with the given username and password.
	 *
	 * @param username The username to use.
	 * @param password The password to use.
	 */
	public void login(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		clickLoginButton();
	}

	/**
	 * Gets the text of the error message displayed on the login page.
	 *
	 * @return The error message text, or null if no error message is found.
	 */
	public String getErrorMessage() {
		try {
			// Wait for the error message to be visible
			WebElement errorElement = wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
			return errorElement.getText();
		} catch (Exception e) {
			// If the element is not found within the timeout, it means no error message is
			// displayed
			return null;
		}
	}

	/**
	 * Checks if the user is successfully logged in by verifying the presence of the
	 * products page title.
	 *
	 * @return true if the products page title is visible, false otherwise.
	 */
	public boolean isLoginSuccessful() {
		try {
			// Wait for the products page title to be visible
			return wait.until(ExpectedConditions.visibilityOfElementLocated(productsPageTitle)).isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Gets the current URL of the page.
	 *
	 * @return The current URL as a String.
	 */
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
}