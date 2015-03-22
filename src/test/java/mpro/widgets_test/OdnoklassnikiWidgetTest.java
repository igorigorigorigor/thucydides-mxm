package mpro.widgets_test;


import java.util.Date;

import mpro.widgets_test.requirements.Application;
import mpro.widgets_test.steps.EndUserOdnoklassnikiSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@Story(Application.Widgets.OdnoklassnikiWidgetTest.class)
@RunWith(ThucydidesRunner.class)
public class OdnoklassnikiWidgetTest extends BaseTest{

	@Managed(uniqueSession = true)
    public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://m.megafonpro.ru")
	public Pages pages;

	@Steps
	public EndUserOdnoklassnikiSteps endUser;
	 
    
    @Test
    public void OdnoklassnikiFullTest() {
    	
    	String status = new Date().toString();
    	String nameOfWidget = "Одноклассники";
		endUser.openLoginPage();
    	endUser.loginInMpro(getProperty("login"), getProperty("password"));
    	endUser.enableWidget(nameOfWidget);
    	endUser.loginInOdnoklassniki("test07052013@gmail.com", "qwe123456");
    	endUser.gotoOdnoklassnikiMainPage();
    	endUser.sendOdnoklassnikiStatus(status);
    	endUser.openHomePage();
    	endUser.matchSentStatusAndReceivedStatus(status);
    	endUser.logoutFromOdnoklassniki();
    	endUser.checkLogoutFromOdnoklassniki();
    	endUser.disableWidget(nameOfWidget);
    	endUser.checkDisableWidget(nameOfWidget);

    }

 } 