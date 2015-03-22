package mpro.widgets_test.steps;

import java.math.BigDecimal;

import mpro.widgets_test.pages.WeatherMskMeteoNovostiPage;
import mpro.widgets_test.pages.WeatherOnHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import static org.fest.assertions.Assertions.assertThat;

public class EndUserWeatherSteps extends EndUserBaseSteps {
	
	WeatherOnHomePage weatherOnHomePage;
	WeatherMskMeteoNovostiPage weatherMskMeteoNovostiPage;
	
   public EndUserWeatherSteps(Pages pages) {
        super(pages);
    }
    
   @Step
   public void OpenWeatherMskMeteoNovostiPage() {
	   weatherMskMeteoNovostiPage.OpenWeatherMskMeteoNovostiPage();
   }
   
   @Step
   public String getWeatherTodayFromWidget() {
	   return weatherOnHomePage.getWeatherToday();
   }
   
   @Step
   public String getWeatherTomorrowFromWidget() {
	   return weatherOnHomePage.getWeatherTomorrow();
   }
   
   @Step
   public String getWeatherTodayFromMeteoNovosti() {
	   return weatherMskMeteoNovostiPage.getWeatherToday();
   }
   
   @Step
   public String getWeatherTomorrowFromMeteoNovosti() {
	   return weatherMskMeteoNovostiPage.getWeatherTomorrow();
   }
 
   
   @Step
   public void matchWeather(String weatherFromWidget, String weatherFromMeteoNovosti) {
	   assertThat(weatherFromWidget.equals(weatherFromMeteoNovosti));
   }
   
}