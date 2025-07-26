package SeleniumExA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumExA_4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\automation\\drivers\\msedgedriver.exe");
		// Should be implemented with Chrome .1
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");

		// Add user to the user name text box .3
		driver.findElement(By.cssSelector("#username")).sendKeys("Osama@gmail.com");
		// Add password to the password text box .4
		driver.findElement(By.cssSelector("#password")).sendKeys("123456");
		// Checked the ‘remember me’ check box .5
		// Check if the checkbox is checked, if yes
		WebElement checkBox = driver.findElement(By.cssSelector("#rememberUn"));
		checkBox.click();
		if (checkBox.isSelected()) {
			;
			// Click the ‘Login’ .6
			driver.findElement(By.cssSelector("#Login")).click();
		}
		// button (you will get an error message).

		 driver.quit();
	}

}
