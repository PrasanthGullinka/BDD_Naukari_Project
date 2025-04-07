package Factory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class DriverFactory {
	
	 static WebDriver driver = null;
	 
	 
	public static void initializeBrowser(String Browsername) {
	
		
		if(Browsername.equals("Chrome")) {
			 driver = new ChromeDriver();
		}
		else if(Browsername.equals("Edge")) {
			 driver = new EdgeDriver();
		}
	
	}
	public static  WebDriver getDriver() {
		return driver;
	}
	
}
