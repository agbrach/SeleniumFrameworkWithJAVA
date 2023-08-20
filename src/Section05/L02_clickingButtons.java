package Section05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L02_clickingButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abrach\\Desktop\\resources\\driver_v1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk/buttons.html");
		
		//driver.findElement(By.cssSelector("button#btn_three")).clink();
	}

}
