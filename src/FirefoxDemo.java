import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\abrach\\Desktop\\resources\\driver_v1\\geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();	
	
	driver.manage().window().maximize();
	
	driver.get("https://www.automationtesting.co.uk");
	
	}

}

