package practicasArreglos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverDemo {

	public static void main(String[] args) {
		
		//System.setProperty("webDriver.gecko.driver", "C:\\test_automation\\drivers\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://pluralsight.com");

	}

}
