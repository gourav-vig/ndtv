package testNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.NDTV_HomePage;
import pages.Operations;
import util.TestBase;

public class Test_NDTV extends TestBase{


	@BeforeTest
	public void setUp() {
		TestBase.initialization();
	}
	
	@Test(priority = 0)
	public void google_SearchTest() {
		LoginPage LP = new LoginPage(driver);
		LP.google_searchBox("NDTV");
		LP.google_searchButton();
		LP.clickNdtvLink();
	}
	@Test(priority = 1)
	public void ndtv_HomePageTest() {
		NDTV_HomePage HP = new NDTV_HomePage(driver);
		HP.clickThreeDots();
		HP.clickWeather();
	}
	@Test(priority = 2)
	public void operation_Test() {
		Operations o = new Operations(driver);
		o.checkingCheckBoxes();
		o.unCheck();
		o.selectCities("Jammu");
	}
	
}
