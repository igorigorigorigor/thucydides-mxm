package mpro.widgets_test.steps;

import mpro.widgets_test.pages.VkLoginPage;
import mpro.widgets_test.pages.VkNewsPage;
import mpro.widgets_test.pages.VkOnHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import static org.fest.assertions.Assertions.assertThat;

public class EndUserVkSteps extends EndUserBaseSteps {
	
	VkOnHomePage vkOnHomePage;
	VkLoginPage vkLoginPage;
	VkNewsPage vkNewsPage;

   public EndUserVkSteps(Pages pages) {
        super(pages);
    }
    
    @Step
    public void loginInVk(String login, String password) {
    	vkOnHomePage.gotoVKloginPage();
        vkLoginPage.inputLogin(login);
        vkLoginPage.inputPassword(password);
        vkLoginPage.login();
    }
    
    @Step
    public void logoutFromVk() {
    	vkOnHomePage.clickVKLogoutButton();
    }
    
    @Step
    public void sendVkStatus(String status){
    	vkOnHomePage.inputStatus(status);
    	vkOnHomePage.clickSubmitStatusButton();
    }
    
    @Step
    public void matchSentStatusAndReceivedStatus(String status) {
        assertThat(vkNewsPage.getNewNews().equals(status));
    }
    
    @Step
    public void checkLogoutFromVk() {
        assertThat(vkOnHomePage.checkLoginButton());
    }

    @Step
    public void gotoVkNewsPage() {
        vkOnHomePage.gotoNewsPage();
    }

}