package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SelTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\automation\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");	
	}

}
