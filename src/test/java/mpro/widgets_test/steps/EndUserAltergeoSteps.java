package mpro.widgets_test.steps;

import mpro.widgets_test.pages.AltergeoLoginPage;
import mpro.widgets_test.pages.AltergeoOnHomePage;
import mpro.widgets_test.pages.VkNewsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import static org.fest.assertions.Assertions.assertThat;

public class EndUserAltergeoSteps extends EndUserBaseSteps {
	
	AltergeoOnHomePage altergeoOnHomePage;
	AltergeoLoginPage altergeoLoginPage;
	
	VkNewsPage vkNewsPage;

   public EndUserAltergeoSteps(Pages pages) {
        super(pages);
    }
    
    @Step
    public void loginInAltergeo(String login, String password) {
    	altergeoOnHomePage.gotoAltergeologinPage();
        altergeoLoginPage.inputLogin(login);
        altergeoLoginPage.inputPassword(password);
        altergeoLoginPage.login();
    }
    
    @Step
    public void logoutFromAltergeo() {
    	altergeoOnHomePage.clickAltergeoLogoutButton();
    }
    
    @Step
    public void sendVkStatus(String status){
    	altergeoOnHomePage.inputStatus(status);
    	altergeoOnHomePage.clickSubmitStatusButton();
    }
    
    @Step
    public void matchSentStatusAndReceivedStatus(String status) {
        assertThat(vkNewsPage.getNewNews().equals(status));
    }
    
    @Step
    public void checkLogoutFromAltergeo() {
        assertThat(altergeoOnHomePage.checkLoginButton());
    }

    @Step
    public void gotoVkNewsPage() {
        altergeoOnHomePage.gotoNewsPage();
    }

}