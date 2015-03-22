package mpro.widgets_test.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("http://m.megafonpro.ru/login/new")
public class OdnoklassnikiMainPage extends PageObject{
	
	public OdnoklassnikiMainPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "field_status")
	private WebElement statusField;
	
	@FindBy(name = "button_submit")
	private WebElement submitStatusButton;

	public void inputStatus(String status){
		element(statusField).clear();
		element(statusField).type(status);
	}
	
	public void clickSubmitStatusButton(){
		element(submitStatusButton).click();
	}

	
}
