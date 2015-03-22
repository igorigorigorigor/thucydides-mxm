package mpro.widgets_test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VkOnHomePage extends HomePage{

	@FindBy(id = "vk-enter")
	private WebElement loginButton;
	
	@FindBy(xpath = "//div[@id='vktitle']/table/tbody/tr/td[3]/a/img")
	private WebElement logoutButton;
	
	@FindBy(id = "vk_status")
	private WebElement statusField;
	
	@FindBy(xpath = "//form/table/tbody/tr/td[2]/input")
	private WebElement submitStatusButton;
	
	@FindBy(linkText = "Новости")
	private WebElement newsLink;
	
	@FindBy(id = "submit_free")
	private WebElement freeZoneButton;



	public VkOnHomePage(WebDriver driver) {
		super(driver);
	}

	public void gotoVKloginPage() {
		element(loginButton).click();
	}

	public void clickVKLogoutButton() {
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
