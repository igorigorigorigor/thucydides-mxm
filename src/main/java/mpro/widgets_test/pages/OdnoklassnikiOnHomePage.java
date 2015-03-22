package mpro.widgets_test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OdnoklassnikiOnHomePage extends HomePage{

	@FindBy(css = ".klwhite")
	private WebElement loginButton;
	
	@FindBy(css = "#klasstitle>table>tbody>tr>td>a>img")
	private WebElement logoutButton;
	
	@FindBy(css = ".kl-edit-status")
	private WebElement statusField;
	
	@FindBy(id = "odki_main_page")
	private WebElement odnoklassnikiMainPageLink;
	
	@FindBy(id = "submit_free")
	private WebElement freeZoneButton;



	public OdnoklassnikiOnHomePage(WebDriver driver) {
		super(driver);
	}

	public void gotoOdnoklassnikiLoginPage() {
		element(loginButton).click();
	}

	public void clickOdnoklassnikiLogoutButton() {
		element(logoutButton).click();
	}
	
	public String getStatus(){
		return element(statusField).toString();
	}
	
	public void gotoMainPage() {
		element(odnoklassnikiMainPageLink).click();
		element(freeZoneButton).click();
	}
	
	public boolean checkLoginButton(){
		return element(loginButton).isPresent();
	}


}
