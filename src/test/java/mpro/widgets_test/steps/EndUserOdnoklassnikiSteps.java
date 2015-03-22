package mpro.widgets_test.steps;

import mpro.widgets_test.pages.OdnoklassnikiLoginPage;
import mpro.widgets_test.pages.OdnoklassnikiMainPage;
import mpro.widgets_test.pages.OdnoklassnikiOnHomePage;
import mpro.widgets_test.pages.VkLoginPage;
import mpro.widgets_test.pages.VkNewsPage;
import mpro.widgets_test.pages.VkOnHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import static org.fest.assertions.Assertions.assertThat;

public class EndUserOdnoklassnikiSteps extends EndUserBaseSteps {
	
	
	OdnoklassnikiLoginPage odnoklassnikiLoginPage;
	OdnoklassnikiOnHomePage odnoklassnikiOnHomePage;
	OdnoklassnikiMainPage odnoklassnikiMainPage;
	VkOnHomePage vkOnHomePage;
	VkLoginPage vkLoginPage;
	VkNewsPage vkNewsPage;

   public EndUserOdnoklassnikiSteps(Pages pages) {
        super(pages);
    }
    
    @Step
    public void loginInOdnoklassniki(String login, String password) {
    	odnoklassnikiOnHomePage.gotoOdnoklassnikiLoginPage();
    	odnoklassnikiLoginPage.inputLogin(login);
    	odnoklassnikiLoginPage.inputPassword(password);
    	odnoklassnikiLoginPage.login();
    }
    
    @Step
    public void logoutFromOdnoklassniki() {
    	odnoklassnikiOnHomePage.clickOdnoklassnikiLogoutButton();
    }
    
    @Step
    public void sendOdnoklassnikiStatus(String status){
    	odnoklassnikiMainPage.inputStatus(status);
    	odnoklassnikiMainPage.clickSubmitStatusButton();
    }
    
    @Step
    public void matchSentStatusAndReceivedStatus(String status) {
        assertThat(odnoklassnikiOnHomePage.getStatus().equals(status));
    }
    
    @Step
    public void checkLogoutFromOdnoklassniki() {
        assertThat(odnoklassnikiOnHomePage.checkLoginButton());
    }

    @Step
    public void gotoOdnoklassnikiMainPage() {
    	odnoklassnikiOnHomePage.gotoMainPage();
    }

}