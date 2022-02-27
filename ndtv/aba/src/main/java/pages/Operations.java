package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Operations {

	WebDriver driver = null;
	List<WebElement> elements; 
	public Operations(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	
	public void checkingCheckBoxes() {
		
        elements = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		int checkedCount = 0;
		int unCheckedCount = 0;
		for(int i=0;i<elements.size();i++) {
			if(elements.get(i).isSelected() == true) {
				checkedCount ++;
			}
			else {
				unCheckedCount ++;
			}
		}
		System.out.println("Number of checked boxes are : "+checkedCount);
		System.out.println("Number of un checked boxes are : "+unCheckedCount);
		
	
	}
	
	public void unCheck() {
		elements = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		int size = elements.size();
		System.out.println(size);
		for(int i=0;i<size;i++) {
			if(elements.get(i).isSelected()==true) 
			elements.get(i).click();
			
		}
	}
	
	public void selectCities(String city) {
		String xpath = "//*[@id=\"city\"]";
	WebElement web = driver.findElement(By.xpath(xpath.replace("city", city)));
	web.click();
	System.out.println("Temperature in celcius: "+driver.findElement(By.xpath("//*[@class=\"tempRedText\"]")).getText());
	
	System.out.println("Temperature in ferhniet: "+driver.findElement(By.xpath("//*[@class=\"tempWhiteText\"]")).getText());
	
	}
	
	/*public void sample(String city) {
		String xpath = "//*[@id=\"city\" and @onclick='javascript:dropCityMarker(this, \"{\\\"lat\\\":\\\"32.66999817\\\",\\\"lng\\\":\\\"74.83000183\\\",\\\"icon\\\":\\\"rain\\\",\\\"condition\\\":\\\"Possible Light Rain\\\",\\\"temp_c\\\":\\\"18\\\",\\\"temp_f\\\":\\\"64\\\",\\\"address\\\":\\\"Jammu, Jammu & Kashmir, India\\\",\\\"wind_condition\\\":\\\"Wind: 2.2 KPH Gusting to 2.33 KPH\\\",\\\"humidity\\\":\\\"Humidity: 72%\\\"}\")']";
		WebElement web1 = driver.findElement(By.xpath(xpath.replace("city", city)));
		web1.click();
		web1.getText();
		System.out.println(web1);
		
		//*[@class="leaflet-popup-content"]

	}*/
	
	
	
	
}
