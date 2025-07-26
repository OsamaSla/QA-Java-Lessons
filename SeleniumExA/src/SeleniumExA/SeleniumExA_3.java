package SeleniumExA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumExA_3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\automation\\drivers\\msedgedriver.exe");
		// Should be implemented with Chrome .1
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		// Open http://www.ebay.com/sch/ebayadvsearch .2
		driver.get("http://www.ebay.com/sch/ebayadvsearch");

		// Add ‘tent’ to the ‘Enter keywords or item number’ text box .3
		driver.findElement(By.cssSelector("#_nkw")).sendKeys("tent");
		// Add some words to the ‘Exclude words from your search’ .4
		// text box
		driver.findElement(By.cssSelector("#_ex_kw")).sendKeys("Black");
		// Checked the ‘Buy It Now’ check box .5
		// driver.findElement(By.cssSelector("#s0-1-17-6\[3\]-\[2\]-LH_BIN")).click("");
		// from id
		driver.findElement(By.cssSelector(".adv-fieldset__format>div:nth-child(4) input")).click();
		// Press the Search button on the bottom of the page .6
		driver.findElement(By.cssSelector(".adv-form__actions> button")).click();
		// Navigate back .7
		driver.navigate().back();
		// Press on the search button on the top of the page (*can you .8
		// do it?)
		driver.findElement(By.cssSelector(".field.adv-keywords__btn-help> button")).click();

		driver.quit();
	}

}
