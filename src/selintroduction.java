import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class selintroduction {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chiranjivi.chintalwa\\OneDrive - Cotiviti\\Desktop\\Selenium\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	//WebDriver driver = new EdgeDriver();
	
     driver.get("https://www.selenium.dev/downloads/");	
     System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		System.out.println("Application Closing...");
		
	}

}

