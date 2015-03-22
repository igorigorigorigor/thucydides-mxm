package mpro.widgets_test;


import mpro.widgets_test.requirements.Application;
import mpro.widgets_test.steps.EndUserAltergeoSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@Story(Application.Widgets.AltergeoWidgetTest.class)
@RunWith(ThucydidesRunner.class)
public class AltergeoWidgetTest extends BaseTest{

	@Managed(uniqueSession = true)
    public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://m.megafonpro.ru")
	public Pages pages;

	@Steps
	public EndUserAltergeoSteps endUser;
	 
    
    @Test
    public void AltergeoFullTest() {
    	
    	String nameOfWidget = "Altergeo";
		endUser.openLoginPage();
		endUser.loginInMpro(getProperty("login"), getProperty("password"));
    	endUser.enableWidget(nameOfWidget);
    	endUser.loginInAltergeo("test07052013@gmail.com", "qwe123456");
    	endUser.logoutFromAltergeo();
    	endUser.checkLogoutFromAltergeo();
    	endUser.disableWidget(nameOfWidget);
    	endUser.checkDisableWidget(nameOfWidget);

    }

 } 