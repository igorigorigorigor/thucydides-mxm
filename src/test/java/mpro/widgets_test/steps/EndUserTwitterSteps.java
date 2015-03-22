package mpro.widgets_test.steps;

import mpro.widgets_test.pages.TwitterLoginPage;
import mpro.widgets_test.pages.TwitterNewsPage;
import mpro.widgets_test.pages.TwitterOnHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import static org.fest.assertions.Assertions.assertThat;

public class EndUserTwitterSteps extends EndUserBaseSteps {
	
	TwitterOnHomePage twitterOnHomePage;
	TwitterLoginPage twitterLoginPage;
	TwitterNewsPage twitterNewsPage;
	
   public EndUserTwitterSteps(Pages pages) {
        super(pages);
    }
    
    @Step
    public void loginInTwitter(String login, String password) {
    	twitterOnHomePage.gotoTwitterLoginPage();
    	twitterLoginPage.inputLogin(login);
    	twitterLoginPage.inputPassword(password);
    	twitterLoginPage.login();
    }
    
    @Step
    public void logoutFromTwitter() {
    	twitterOnHomePage.clickTwitterLogoutButton();
    }
    
    @Step
    public void sendTwitterStatus(String status){
    	twitterOnHomePage.inputStatus(status);
    	twitterOnHomePage.clickSubmitStatusButton();
    }
    
    @Step
    public void matchSentStatusAndReceivedStatus(String status) {
        assertThat(twitterNewsPage.getNewNews().equals(status));
    }
    
    @Step
    public void checkLogoutFromTwitter() {
        assertThat(twitterOnHomePage.checkLoginButton());
    }

    @Step
    public void gotoTwitterNewsPage() {
    	twitterOnHomePage.gotoNewsPage();
    }

}