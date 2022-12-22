package com.automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFiles {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();

        driver.get("https://www.foundit.in/?spl=IN_paid_search_brand_paidsearch_Google_Search_Monster_keyword_Any&utm_source=Google&utm_medium=paidsearch&utm_campaign=IN_paid_search_brand_paidsearch_Google_Search_Monster_keyword_Any&gclid=Cj0KCQiA1ZGcBhCoARIsAGQ0kkpxUP83M4_ebi22Y9ur97hd6g6mgSkx1yC5lTB43idnnROMD05_zGoaAhpQEALw_wcB");
        driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn secondaryBtn']")).click();
        driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("/Users/meganathan/Desktop/keerthu/keerthitestengineer/KeerthigaResume.pdf");
        //driver.findElement(By.xpath("//span[@class='action-cta']")).submit();
	

}
}
