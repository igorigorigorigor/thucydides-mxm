package mpro.widgets_test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://m.megafonpro.ru/login/new")
public class LoginPage extends PageObject {

	@FindBy(name="msisdn")
    private WebElement loginField;
	
	@FindBy(name="password")
    private WebElement passwordField;
	
	@FindBy(name="enter")
    private WebElement loginButton;
	
	public void inputLogin(String login){
		element(loginField).clear();
		element(loginField).type(login);
	}
	
	public void inputPassword(String password){
		element(passwordField).clear();
		element(passwordField).type(password);
	}
	
	public void login(){
		element(loginButton).click();
	}

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	

}
