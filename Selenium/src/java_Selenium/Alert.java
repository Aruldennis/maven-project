package java_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\silva\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );

	   WebDriver driver = new ChromeDriver();
	   
	   driver.get("https://www.google.co.in");
	   
	   driver.get("https://www.amazon.in");
	}

}
