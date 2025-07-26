package LogInTest;

import java.util.concurrent.locks.Condition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LogInTest_TC2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\automation\\drivers\\msedgedriver.exe");
		// Should be implemented with Chrome .1
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

		// TC2 - Failed login - user name - valid & password - invalid
		// Login:
		// insert user name:
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		// insert Password:
		driver.findElement(By.cssSelector("#password")).sendKeys("123456");
		// click login
		driver.findElement(By.cssSelector("#login-button")).click();
		// check errmsg
		String Expected = "Epic sadface: Username and password do not match any user in this service";
		String Actual = driver.findElement(By.cssSelector(" h3")).getText();
		if (Expected.equals(Actual)) {
			System.out.println("TC 02 -Pass");
		} else {
			System.out.println("TC 02 -Failed");
		}
		driver.quit();
	}

}
