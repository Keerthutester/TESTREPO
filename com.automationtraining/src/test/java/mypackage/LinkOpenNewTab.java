package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkOpenNewTab {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		String tab=Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.xpath("(//a[text()='Gmail'])[1]")).sendKeys(tab);

	}

}
