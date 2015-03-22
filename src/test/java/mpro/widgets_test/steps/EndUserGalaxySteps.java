package mpro.widgets_test.steps;

import mpro.widgets_test.pages.GalaxyOnHomePage;
import mpro.widgets_test.pages.LivejournalOnHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import static org.fest.assertions.Assertions.assertThat;

public class EndUserGalaxySteps extends EndUserBaseSteps {
	
	GalaxyOnHomePage galaxyOnHomePage;
	
   public EndUserGalaxySteps(Pages pages) {
        super(pages);
    }
    
   @Step
    public void checkLogoutFromGalaxy() {
        assertThat(galaxyOnHomePage.checkLoginButton());
    }

   
}