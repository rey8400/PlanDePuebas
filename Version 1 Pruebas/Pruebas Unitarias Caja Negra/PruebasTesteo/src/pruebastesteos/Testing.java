package pruebastesteos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Testing {
	ChromeDriver driver;
	String url = "http://localhost/tienda_virtual6/dashboard";
	@BeforeMethod
	public void invocarNavegador() {
		//le damos la ruta 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\carlo\\Desktop\\chrome\\chromedriver.exe");
		//instancia
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	//Para cada caso se puede agregar una prioridad de ejecución
	//Importando la clase para escribir el test case para verificar el title

	@Test(priority = 0)
	public void verificarAgregarCliente() {
		//ejecución del login
				WebElement email = driver.findElement(By.name("txtEmail"));
				WebElement password = driver.findElement(By.name("txtPassword"));
				WebElement btnInicio = driver.findElement(By.name("btnInicio"));
				
				email.sendKeys("rey@gmail.com");
				password.sendKeys("123456");
				btnInicio.click();
		
		
		
	
		
	}
	
	

}
