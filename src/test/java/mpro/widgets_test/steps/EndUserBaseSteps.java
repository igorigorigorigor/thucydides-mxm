package mpro.widgets_test.steps;

import static org.fest.assertions.Assertions.assertThat;
import mpro.widgets_test.pages.HomePage;
import mpro.widgets_test.pages.ListOfWidgetsPage;
import mpro.widgets_test.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class EndUserBaseSteps extends ScenarioSteps {

	HomePage homePage;
	LoginPage loginPage;
	ListOfWidgetsPage listOfWidgetsPage;

	public EndUserBaseSteps(Pages pages) {
		super(pages);
	}

	@Step
	public void loginInMpro(String login, String password) {
	    loginPage.inputLogin(login);
	    loginPage.inputPassword(password);
	    loginPage.login();
	}

	@Step
	public void enableWidget(String nameOfWidget) {
		homePage.gotoListOfWidgetsPage();
		listOfWidgetsPage.enableWidget(nameOfWidget);
	    listOfWidgetsPage.saveListOfWidgets();
	}

	@Step
	public void disableWidget(String nameOfWidget) {
		homePage.gotoListOfWidgetsPage();
		listOfWidgetsPage.disableWidget(nameOfWidget);
	    listOfWidgetsPage.saveListOfWidgets();
	}

	@Step
	public void checkDisableWidget(String nameOfWidget) {
		homePage.gotoListOfWidgetsPage();
		assertThat(listOfWidgetsPage.onVidgetCheched(nameOfWidget));
	}

	@Step
	public void openHomePage() {
	    homePage.open();
	}

	@Step
	public void openLoginPage() {
	    loginPage.open();
	}

	@Step
	public void openListOfWidgetsPage() {
	    listOfWidgetsPage.open();
	}

}
