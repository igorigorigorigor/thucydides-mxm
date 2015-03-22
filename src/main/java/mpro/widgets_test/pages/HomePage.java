package mpro.widgets_test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://m.megafonpro.ru")
public class HomePage extends PageObject {

	@FindBy(xpath="//a[contains(@href, '/widgets')]")
    private WebElement linkToListOfWidgets;
	
	@FindBy(xpath="//a[@href='http://m.megafonpro.ru/login/new']")
    private WebElement LoginLink;
	
    public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public void openListOfWidgets(){
		element(linkToListOfWidgets).click();
	}
	
	public void openLoginPage(){
		element(LoginLink).click();
	}
	
	public void gotoListOfWidgetsPage(){
		element(linkToListOfWidgets).click();
	}

}
