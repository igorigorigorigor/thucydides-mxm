package mpro.widgets_test.steps;

import mpro.widgets_test.pages.LivejournalOnHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import static org.fest.assertions.Assertions.assertThat;

public class EndUserLiveJournalSteps extends EndUserBaseSteps {
	
	LivejournalOnHomePage livejournalOnHomePage;
	
   public EndUserLiveJournalSteps(Pages pages) {
        super(pages);
    }
    
   @Step
    public void checkLogoutFromLivejournal() {
        assertThat(livejournalOnHomePage.checkLoginButton());
    }

   
}