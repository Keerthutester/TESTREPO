package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusofWebElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//conditionl statements
		//isEnabled() isDisplayed() for all webelements in a page
		
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen");
		WebElement getstart=driver.findElement(By.xpath("(//span[text()='English'])[1]"));
		System.out.println(getstart.isDisplayed());
		WebElement enabled=driver.findElement(By.id("FirstName"));
		System.out.println(enabled.isEnabled());
		
		//isSelected -radiobuttons checkbox dropdown
		
		WebElement selected=driver.findElement(By.className("custom-control-label"));
		selected.click();
		System.out.println(selected.isSelected());
		driver.close();
		
		
	}

}
