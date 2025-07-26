package SeleniumExA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumExA_5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\automation\\drivers\\msedgedriver.exe");
		// Should be implemented with Chrome .1
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mytinytodo.net/demo/#list/2");
		
		// Add 2 different tasks to the tasks list .2
		// Verify that the task viewer shows 2 tasks total .3
		// (using getText())
		// Delete the first task (you will have to use Action Class, .4
		// since the “Kebab” element doesn’t appear on the page
		// unless you hover it with the mouse.you can read more about
		// it in the internet and also in the link attached -
		// https://www.browserstack.com/guide/action-class-in-
		// selenium
		// Verify again that the task viewer was updated to 1 task. .5
		
		//		driver.quit();
	}

}
