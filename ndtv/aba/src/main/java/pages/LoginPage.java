package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver = null;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void google_searchBox(String text) {
		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys(text);
	}
	
	public void google_searchButton() {
		driver.findElement(By.xpath("(//*[@value=\"Google Search\" and @type=\"submit\"])[2]")).sendKeys(Keys.RETURN);
		
	}
	
	public void clickNdtvLink() {
		driver.findElement(By.xpath("(//*[text()=\"https://www.ndtv.com\"])[1]")).click();
	}

	
}
