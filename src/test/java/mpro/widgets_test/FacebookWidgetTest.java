package mpro.widgets_test;


import java.util.Date;

import mpro.widgets_test.requirements.Application;
import mpro.widgets_test.steps.EndUserFacebookSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@Story(Application.Widgets.FacebookWidgetTest.class)
@RunWith(ThucydidesRunner.class)
public class FacebookWidgetTest extends BaseTest{

	@Managed(uniqueSession = true)
    public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://m.megafonpro.ru")
	public Pages pages;

	@Steps
	public EndUserFacebookSteps endUser;
	 
    @Test
    public void FacebookFullTest() {
    	
    	String status = new Date().toString();
    	String nameOfWidget = "Facebook";
		endUser.openLoginPage();
    	endUser.loginInMpro(getProperty("login"), getProperty("password"));
    	endUser.enableWidget(nameOfWidget);
    	endUser.loginInFacebook("fatum2040@yandex.ru", "qaz123456");
    	endUser.sendFacebookStatus(status);
    	endUser.gotoFacebookNewsPage();
    	endUser.matchSentStatusAndReceivedStatus(status);
    	endUser.openHomePage();
    	endUser.logoutFromFacebook();
    	endUser.checkLogoutFromFacebook();
    	endUser.disableWidget(nameOfWidget);
    	endUser.checkDisableWidget(nameOfWidget);
    }

 } 