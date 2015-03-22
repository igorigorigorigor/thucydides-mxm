package mpro.widgets_test;


import mpro.widgets_test.requirements.Application;
import mpro.widgets_test.steps.EndUserLiveJournalSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@Story(Application.Widgets.LivejournalWidgetTest.class)
@RunWith(ThucydidesRunner.class)
public class LivejournalWidgetTest extends BaseTest{

	@Managed(uniqueSession = true)
    public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://m.megafonpro.ru")
	public Pages pages;

	@Steps
	public EndUserLiveJournalSteps endUser;
	 
    
    @Test
    public void LivejournalFullTest() {
    	
    	String nameOfWidget = "LiveJournal";
		endUser.openLoginPage();
    	endUser.loginInMpro(getProperty("login"), getProperty("password"));
    	endUser.enableWidget(nameOfWidget);
    	endUser.checkLogoutFromLivejournal();
    	endUser.disableWidget(nameOfWidget);
    	endUser.checkDisableWidget(nameOfWidget);

    }

 } 