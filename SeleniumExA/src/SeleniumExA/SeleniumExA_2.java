package SeleniumExA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumExA_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\automation\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");


		//Click ‘Forgot Your Password?’ link
		driver.findElement(By.cssSelector("#forgot_password_link")).click();

		// Get the new page title
		String newPageTitle = driver.getTitle();
        System.out.println("New Page Title: " + newPageTitle);
        
     // Check if the new title contains 'Reset Your Password'.
        if (newPageTitle.contains("Reset Your Password")) { 
          System.out.println("Title contains 'Forgot Your Password'. Continuing...");
          driver.findElement(By.cssSelector("#un")).sendKeys("Osama@gmail.com");
       // Click 'continue' button
          driver.findElement(By.cssSelector("#continue")).click();
          
          String Msg = driver.findElement(By.cssSelector("#header")).getText();
          System.out.println(Msg);
        
      driver.quit();
	}

}
}
	
