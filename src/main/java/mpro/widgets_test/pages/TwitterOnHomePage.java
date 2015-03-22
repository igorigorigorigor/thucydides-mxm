package mpro.widgets_test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TwitterOnHomePage extends HomePage{

	@FindBy(id = "login_button")
	private WebElement loginButton;
	
	@FindBy(css = ".info>a>img")
	private WebElement logoutButton;
	
	@FindBy(name = "tweet_or_search")
	private WebElement statusField;
	
	@FindBy(id = "twit")
	private WebElement submitStatusButton;
	
	@FindBy(id = "main")
	private WebElement newsLink;
	
	@FindBy(id = "submit_free")
	private WebElement freeZoneButton;



	public TwitterOnHomePage(WebDriver driver) {
		super(driver);
	}

	public void gotoTwitterLoginPage() {
		element(loginButton).click();
	}

	public void clickTwitterLogoutButton() {
		element(logoutButton).click();
	}
	
	public void inputStatus(String status){
		element(statusField).clear();
		element(statusField).type(status);
	}
	
	public void clickSubmitStatusButton(){
		element(submitStatusButton).click();
	}

	public void gotoNewsPage() {
		element(newsLink).click();
		element(freeZoneButton).click();
	}
	
	public boolean checkLoginButton(){
		return element(loginButton).isPresent();
	}


}
