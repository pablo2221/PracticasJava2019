package practicasArreglos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BomuploadDownloadBom {
	
	static WebDriver driver;
	static WebDriverWait wait;

	public static void main(String[] args) {
		
		//Here the URL for testing purposes is typed
		
		browserConfiguration("http://bistri:8080/BomUpload/web/init.do");
		
		//Here the information required for testing purposes is typed
		
		userLogin("6346","test");
		
		bomUploadDownloadFile ("VIZ0002");
		
		bomUploadDownloadFileVerificationPage("C:\\Users\\pquiros\\Downloads");
		
		bomUploadDownloadFileVerification ("VIZ0002");
		
		
	}

	private static void browserConfiguration(String url) {
		
		driver = new ChromeDriver();
				
		//implicit and explicit waits are configured
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 15);
				
		//navigates to the required URL
		driver.get(url);
				
	}
	
	private static void userLogin(String user, String password) {
		
		WebElement userField;
		WebElement passwordField;
		WebElement loginButton;
		
		String xpathUserField = "//*[@id=\"username\"]";
		String xpathPasswordField = "//*[@id=\"password\"]";
		String xpathLoginBoton = "//*[@id=\"loginBox\"]/tbody/tr[4]/td/input[3]";
		
		userField = driver.findElement(By.xpath(xpathUserField));
		passwordField = driver.findElement(By.xpath(xpathPasswordField));
		loginButton = driver.findElement(By.xpath(xpathLoginBoton));
	
		userField.clear();
		userField.sendKeys(user);
	    
		passwordField.clear();
		passwordField.sendKeys(password);
	    
	    loginButton.click();
		
	}
	
	private static void bomUploadDownloadFile(String bomNumber) {
		
		WebElement itemId;
		WebElement downloadFileButton;
		
		String xpathItemId = "//*[@id=\"invItemId\"]";
		String xpathDownloadFileButton = "//*[@id=\"downloadForm\"]/div/div[3]/div[1]/a";
		
		itemId = driver.findElement(By.xpath(xpathItemId));
		downloadFileButton = driver.findElement(By.xpath(xpathDownloadFileButton));
		
		itemId.clear();
		itemId.sendKeys(bomNumber);
		
		downloadFileButton.click();
		
	}
	
	private static void bomUploadDownloadFileVerificationPage(String page) {
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 15);
				
		driver.get(page);
		
	}
	
	private static void bomUploadDownloadFileVerification(String file) {
		
		if(driver.findElement(By.linkText("VIZ0002.xls")).isDisplayed()) {
			
		     System.out.println("Test PASSED - - BomUpload file was successfully downloaded");
		}else {
			
			System.out.println("Test FAILED - - Bomupload file was not downloaded ");
			System.exit(-1);
		}
		
	}

}
