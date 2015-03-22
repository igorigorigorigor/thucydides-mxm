package mpro.widgets_test.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.thucydides.core.pages.PageObject;

public class WeatherMskMeteoNovostiPage extends PageObject {
	
	@FindBy(xpath = "//table/tbody/tr[2]/td[2]/div/div")
	private List<WebElement> weatherList;
	
	@FindBy(xpath = ".//tbody/tr[3]/td[2]")
	private WebElement weatherToday;
	
	@FindBy(xpath = ".//tbody/tr[3]/td[3]")
	private WebElement weatherTomorrow;

	public String getWeatherToday()
	{
		return weatherList.get(0).getText().trim();
	}
	
	public String getWeatherTomorrow()
	{
		return weatherList.get(1).getText().trim();
	}

	public WeatherMskMeteoNovostiPage(WebDriver driver) {
		super(driver);
	}
	
	public void OpenWeatherMskMeteoNovostiPage() {
		super.getDriver().navigate().to("http://www.hmn.ru/index.php?index=51&value=27612");
	}

}
