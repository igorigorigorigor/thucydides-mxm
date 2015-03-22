package mpro.widgets_test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WeatherOnHomePage extends HomePage{

	@FindBy(xpath = ".//*[@id='container']/div[7]/table/tbody/tr[2]/td[1]")
	private WebElement weatherToday;
	
	@FindBy(xpath = ".//*[@id='container']/div[7]/table/tbody/tr[3]/td[1]")
	private WebElement weatherTomorrow;
	
	public WeatherOnHomePage(WebDriver driver) {
		super(driver);
	}

	public String getWeatherToday() {
		return weatherToday.getText();
	}

	public String getWeatherTomorrow() {
		return weatherTomorrow.getText().split(" ")[2];
	}

}
