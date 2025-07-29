package SeleniumExA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumExA_0 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\automation\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

//			login
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		Thread.sleep(500);
//			insert user name
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		Thread.sleep(500);
//			insert password
		driver.findElement(By.cssSelector("#login-button")).click();
//			click login
	}

}
