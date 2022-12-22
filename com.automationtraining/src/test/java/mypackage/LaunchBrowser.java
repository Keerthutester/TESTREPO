package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();

        driver.get("https://www.flipkart.com/");
        System.out.println("title of the page"+driver.getTitle());
        System.out.println("URL of the page"+ driver.getCurrentUrl());
        driver.findElement(By.xpath("//button[text()='✕']")).click();
        driver.findElement(By.xpath("//img[@alt='Infinix' and @class='kJjFO0 _3DIhEh']")).click();
       
        //System.out.println("pagesource"+ driver.getPageSource());
        driver.close();
        
}
}
