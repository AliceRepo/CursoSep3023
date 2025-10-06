package practicaSel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PruebaSelenium {

	public static void main(String[] args) {
		//Abrir explorador
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

}

