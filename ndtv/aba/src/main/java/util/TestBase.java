package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		try {
		prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\eclipse-workspace1\\aba\\src\\main\\java\\config\\config.properties");
		prop.load(file);
		} catch(IOException e) {
			e.toString();
		}

	}
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace1\\aba\\drivers\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecho.driver", "C:\\Users\\HP\\eclipse-workspace1\\aba\\drivers\\chromedriver\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get(prop.getProperty("url"));
	}
	
}
