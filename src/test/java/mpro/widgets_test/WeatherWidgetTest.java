package mpro.widgets_test;


import mpro.widgets_test.requirements.Application;
import mpro.widgets_test.steps.EndUserWeatherSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@Story(Application.Widgets.WeatherWidgetTest.class)
@RunWith(ThucydidesRunner.class)
public class WeatherWidgetTest extends BaseTest{

	@Managed(uniqueSession = true)
    public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://m.megafonpro.ru")
	public Pages pages;

	@Steps
	public EndUserWeatherSteps endUser;
	 
    
    @Test
    public void WeatherFullTest() {
    	String nameOfWidget = "Погода";
    	String weatherTodayFromWidget;
    	String weatherTomorrowFromWidget;
    	String weatherTodayFromMeteoNovosti;
    	String weatherTomorrowFromMeteoNovosti;
		
    	endUser.openLoginPage();
    	endUser.loginInMpro(getProperty("login"), getProperty("password"));
    	endUser.enableWidget(nameOfWidget);
    	weatherTodayFromWidget = endUser.getWeatherTodayFromWidget();
    	weatherTomorrowFromWidget = endUser.getWeatherTomorrowFromWidget();
    	endUser.OpenWeatherMskMeteoNovostiPage();
    	weatherTodayFromMeteoNovosti = endUser.getWeatherTodayFromMeteoNovosti();
    	weatherTomorrowFromMeteoNovosti = endUser.getWeatherTomorrowFromMeteoNovosti();
    	endUser.matchWeather(weatherTodayFromWidget, weatherTodayFromMeteoNovosti);
    	endUser.matchWeather(weatherTomorrowFromWidget, weatherTomorrowFromMeteoNovosti);
    	endUser.openHomePage();
    	endUser.disableWidget(nameOfWidget);
    	endUser.checkDisableWidget(nameOfWidget);

    }

 } 