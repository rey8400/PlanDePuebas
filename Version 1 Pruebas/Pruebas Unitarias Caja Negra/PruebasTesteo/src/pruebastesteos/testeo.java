package pruebastesteos;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testeo {


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
		public void verificarLoginDeGuru99Application() {
			//para identificar elementos como el id, Selenium provee una interfaz llamada WebElement
			
			
			//ejecución con el método sendKeys
		
		
			
			
			WebElement email = driver.findElement(By.name("txtEmail"));
			WebElement password = driver.findElement(By.name("txtPassword"));
			WebElement btnInicio = driver.findElement(By.name("btnInicio"));
			
			email.sendKeys("rey@gmail.com");
			password.sendKeys("123456");
			btnInicio.click();
			System.out.println("Estado -->OK");
			System.out.println("Logueado Correctamente");
			
			
			
		}
	
		//para ejecutar todo creamos la case principal, escribir main ctrl + space bar para generarla
		public static void main(String[] args) {
			testeo wc = new testeo();
			//llamar a los métodos
			wc.invocarNavegador();
			wc.verificarLoginDeGuru99Application();
			
		}
		
}
