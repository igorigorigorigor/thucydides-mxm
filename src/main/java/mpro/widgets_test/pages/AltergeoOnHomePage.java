package mpro.widgets_test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AltergeoOnHomePage extends HomePage{

	@FindBy(css = ".altergeo-widget>.widget-header>.submit")
	private WebElement loginButton;
	
	@FindBy(css = ".logout")
	private WebElement logoutButton;
	
	@FindBy(id = "vk_status")
	private WebElement statusField;
	
	@FindBy(xpath = "//form/table/tbody/tr/td[2]/input")
	private WebElement submitStatusButton;
	
	@FindBy(linkText = "Новости")
	private WebElement newsLink;
	
	@FindBy(id = "submit_free")
	private WebElement freeZoneButton;



	public AltergeoOnHomePage(WebDriver driver) {
		super(driver);
	}

	public void gotoAltergeologinPage() {
		element(loginButton).click();
	}

	public void clickAltergeoLogoutButton() {
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
