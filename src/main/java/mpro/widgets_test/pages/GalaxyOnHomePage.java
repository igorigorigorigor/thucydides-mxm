package mpro.widgets_test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GalaxyOnHomePage extends HomePage{

	@FindBy(xpath = "//a[contains(@href, '/galaxy/auth/login')]")
	private WebElement loginButton;
	
	public GalaxyOnHomePage(WebDriver driver) {
		super(driver);
	}

	public void gotoLivejournalLoginPage() {
		element(loginButton).click();
	}

	public boolean checkLoginButton(){
		return element(loginButton).isPresent();
	}


}
