package practicasArreglos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbrirCorreo {
	
	static WebDriver driver;
	static WebDriverWait wait;

	public static void main(String[] args) {
		
		configurarNavegador("https://login.live.com");
		userLogin("","");
		//abrirCarpetaPrincipal();
		
	}

	private static void configurarNavegador(String url) {
		
		driver = new ChromeDriver();
		
		//implicit and explicit waits are configured
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 15);
						
		//navigates to the required URL
		driver.get(url);
	}
	
	private static void userLogin(String usuario, String password) {
		
		WebElement campoCorreo;
		WebElement campoContrasena;
		WebElement botonNext;
		WebElement botonSignIn;
		
		
		String campoCorreoXpath = "//*[@id=\"i0116\"]";
		String botonNextXpath = "//*[@id=\"idSIButton9\"]";
		String campoContrasenaXpath ="//*[@id=\"i0118\"]";
		//String botonSignInXpath = "//*[@id=\"idSIButton9\"]";
		
		campoCorreo = driver.findElement(By.xpath(campoCorreoXpath));
		botonNext = driver.findElement(By.xpath(botonNextXpath));
	
		
		campoCorreo.clear();
		campoCorreo.sendKeys(usuario);
		botonNext.click();
		
		campoContrasena = driver.findElement(By.xpath(campoContrasenaXpath));
		botonSignIn = driver.findElement(By.id("idSIButton9"));
		
		campoContrasena.clear();
		campoContrasena.sendKeys(password);
		botonSignIn.click();
		
	}
	
	private static void abrirCarpetaPrincipal() {
		// TODO Auto-generated method stub
		
	}

}
