package mpro.widgets_test;


import java.util.Date;

import mpro.widgets_test.requirements.Application;
import mpro.widgets_test.steps.EndUserTwitterSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@Story(Application.Widgets.TwitterWidgetTest.class)
@RunWith(ThucydidesRunner.class)
public class TwitterWidgetTest extends BaseTest{

	@Managed(uniqueSession = true)
    public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://m.megafonpro.ru")
	public Pages pages;

	@Steps
	public EndUserTwitterSteps endUser;
	 
    
    @Test
    public void TwitterFullTest() {
    	
    	String status = new Date().toString();
    	String nameOfWidget = "Twitter";
		endUser.openLoginPage();
    	endUser.loginInMpro(getProperty("login"), getProperty("password"));
    	endUser.enableWidget(nameOfWidget);
    	endUser.loginInTwitter("test07052013@gmail.com", "qwe123456");
    	endUser.sendTwitterStatus(status);
    	endUser.gotoTwitterNewsPage();
    	endUser.matchSentStatusAndReceivedStatus(status);
    	endUser.openHomePage();
    	endUser.logoutFromTwitter();
    	endUser.checkLogoutFromTwitter();
    	endUser.disableWidget(nameOfWidget);
    	endUser.checkDisableWidget(nameOfWidget);

    }

 } 