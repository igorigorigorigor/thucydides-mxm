package mpro.widgets_test.steps;

import mpro.widgets_test.pages.FacebookLoginPage;
import mpro.widgets_test.pages.FacebookNewsPage;
import mpro.widgets_test.pages.FacebookOnHomePage;
import mpro.widgets_test.pages.VkLoginPage;
import mpro.widgets_test.pages.VkNewsPage;
import mpro.widgets_test.pages.VkOnHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import static org.fest.assertions.Assertions.assertThat;

public class EndUserFacebookSteps extends EndUserBaseSteps {
	
	FacebookOnHomePage facebookOnHomePage;
	FacebookLoginPage facebookLoginPage;
	FacebookNewsPage facebookNewsPage;
	
   public EndUserFacebookSteps(Pages pages) {
        super(pages);
    }
    
    @Step
    public void loginInFacebook(String login, String password) {
    	facebookOnHomePage.gotoFacebookLoginPage();
    	facebookLoginPage.inputLogin(login);
    	facebookLoginPage.inputPassword(password);
    	facebookLoginPage.login();
    }
    
    @Step
    public void logoutFromFacebook() {
    	facebookOnHomePage.clickFacebookLogoutButton();
    }
    
    @Step
    public void sendFacebookStatus(String status){
    	facebookOnHomePage.inputStatus(status);
    	facebookOnHomePage.clickSubmitStatusButton();
    }
    
    @Step
    public void matchSentStatusAndReceivedStatus(String status) {
        String newNews = facebookNewsPage.getNewNews();
		assertThat(newNews.equals(status));
    }
    
    @Step
    public void checkLogoutFromFacebook() {
        assertThat(facebookOnHomePage.checkLoginButton());
    }

    @Step
    public void gotoFacebookNewsPage() {
    	facebookOnHomePage.gotoNewsPage();
    }

}