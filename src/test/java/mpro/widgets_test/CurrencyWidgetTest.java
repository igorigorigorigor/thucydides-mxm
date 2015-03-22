package mpro.widgets_test;


import java.math.BigDecimal;

import mpro.widgets_test.requirements.Application;
import mpro.widgets_test.steps.EndUserCurrencySteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@Story(Application.Widgets.CurrencyWidgetTest.class)
@RunWith(ThucydidesRunner.class)
public class CurrencyWidgetTest extends BaseTest{

	@Managed(uniqueSession = true)
    public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://m.megafonpro.ru")
	public Pages pages;

	@Steps
	public EndUserCurrencySteps endUser;
	 
    
    @Test
    public void CurrencyFullTest() {
    	String nameOfWidget = "Валюта";
		BigDecimal usdCourseFromWidget;
		BigDecimal eurCourseFromWidget;
		BigDecimal usdCourseFromCBR;
		BigDecimal eurCourseFromCBR;
		
		endUser.openLoginPage();
    	endUser.loginInMpro(getProperty("login"), getProperty("password"));
    	endUser.enableWidget(nameOfWidget);
    	usdCourseFromWidget = endUser.getUsdCourceFromWidget();
    	eurCourseFromWidget = endUser.getEurCourceFromWidget();
    	endUser.openCbrCoursePage();
    	usdCourseFromCBR = endUser.getCourceFromCbr("USD");
    	eurCourseFromCBR = endUser.getCourceFromCbr("EUR");
    	endUser.matchCourse(usdCourseFromWidget, usdCourseFromCBR);
    	endUser.matchCourse(eurCourseFromWidget, eurCourseFromCBR);
    	endUser.openHomePage();
    	endUser.disableWidget(nameOfWidget);
    	endUser.checkDisableWidget(nameOfWidget);

    }

 } 