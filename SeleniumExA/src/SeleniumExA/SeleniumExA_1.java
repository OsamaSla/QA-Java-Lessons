package SeleniumExA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumExA_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\automation\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://prd.canvusapps.com/signup");

//			Fill in all field
		driver.findElement(By.cssSelector("#user_name")).sendKeys("Osama Slaieh");
		driver.findElement(By.cssSelector("#user_email")).sendKeys("osama.sla1@gmail.com");
		driver.findElement(By.cssSelector("#user_password")).sendKeys("JeJk2$%D%9$c");
		driver.findElement(By.cssSelector("#user_password_confirmation")).sendKeys("JeJk2$%D%9$c");
		driver.findElement(By.cssSelector("#company_name")).sendKeys("Ecom");
		
//		Click ‘Sign Up’ button
		driver.findElement(By.cssSelector(".submit")).click();
//		Print the error message
		String errMsg = driver.findElement(By.cssSelector(".alert.alert-error")).getText();
		System.out.println(errMsg);
		
		driver.quit();
	}

}
