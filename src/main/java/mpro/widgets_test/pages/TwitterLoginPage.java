package mpro.widgets_test.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("http://m.megafonpro.ru/login/new")
public class TwitterLoginPage extends PageObject{
	
	public TwitterLoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="username")
	private WebElement loginField;
		
	@FindBy(id="password")
	private WebElement passwordField;
		
	@FindBy(id="signupbutton")
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
		
	
}
