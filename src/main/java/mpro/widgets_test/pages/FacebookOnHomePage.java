package mpro.widgets_test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookOnHomePage extends HomePage{

	@FindBy(id = "fb-enter")
	private WebElement loginButton;
	
	@FindBy(css = ".fb-exit>a>img")
	private WebElement logoutButton;
	
	@FindBy(id = "fb-input")
	private WebElement statusField;
	
	@FindBy(css = ".fb-send")
	private WebElement submitStatusButton;
	
	@FindBy(css = ".fb-all_news")
	private WebElement newsLink;
	
	@FindBy(id = "submit_free")
	private WebElement freeZoneButton;



	public FacebookOnHomePage(WebDriver driver) {
		super(driver);
	}

	public void gotoFacebookLoginPage() {
		element(loginButton).click();
	}

	public void clickFacebookLogoutButton() {
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
