package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	String s ;
System.setProperty("webdriver.chrome.driver","C:/Users/chiranjivi.chintalwa/Downloads/edgedriver_win64/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/Brain/");
		
	driver.getTitle();
		
		
		
	
		
	}

}
