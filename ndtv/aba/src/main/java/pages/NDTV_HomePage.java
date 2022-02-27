package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NDTV_HomePage {
	
	WebDriver driver = null;
	public NDTV_HomePage(WebDriver driver) {
		this.driver=driver;
	}

	public void clickThreeDots() {
		WebElement btn1 =  driver.findElement(By.xpath("//*[@id=\"h_sub_menu\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", btn1);
	}
	
	public void clickWeather() {
		/*WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.dismiss();*/
		WebElement btn2 = driver.findElement(By.xpath("//*[text()=\"WEATHER\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", btn2);
	}
	
	
}
