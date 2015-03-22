package mpro.widgets_test;


import java.util.Date;

import mpro.widgets_test.requirements.Application;
import mpro.widgets_test.steps.EndUserVkSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@Story(Application.Widgets.VkWidgetTest.class)
@RunWith(ThucydidesRunner.class)
public class VkWidgetTest extends BaseTest{

	@Managed(uniqueSession = true)
    public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://m.megafonpro.ru")
	public Pages pages;

	@Steps
	public EndUserVkSteps endUser;
	 
    
    @Test
    public void VkFullTest() {
    	
    	String status = new Date().toString();
    	String nameOfWidget = "ВКонтакте";
		endUser.openLoginPage();
    	endUser.loginInMpro(getProperty("login"), getProperty("password"));
    	endUser.enableWidget(nameOfWidget);
    	endUser.loginInVk("79288819334", "qwe123456");
    	endUser.sendVkStatus(status);
    	endUser.gotoVkNewsPage();
    	endUser.matchSentStatusAndReceivedStatus(status);
    	endUser.openHomePage();
    	endUser.logoutFromVk();
    	endUser.checkLogoutFromVk();
    	endUser.disableWidget(nameOfWidget);
    	endUser.checkDisableWidget(nameOfWidget);

    }

 } 