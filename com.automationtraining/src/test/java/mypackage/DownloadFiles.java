package mypackage;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFiles {

	public static void main(String[] args) {
		String location=System.getProperty("üser.dir")+ "\\Downloads\\";
		
		HashMap<String, String> preferences=new HashMap<String, String>();
		preferences.put("download.default_directoryd",location);
		
		ChromeOptions option=new ChromeOptions();
		option.setExperimentalOption("prefs",preferences);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(option);
		
		
		
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		driver.findElement(By.xpath("(//table[@id='table-files']//tbody//td//a)[1]")).click();

	}

}
