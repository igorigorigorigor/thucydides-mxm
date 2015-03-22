package mpro.widgets_test.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("http://m.megafonpro.ru/login/new")
public class VkLoginPage extends PageObject{
	
	public VkLoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name="email")
	private WebElement loginField;
		
	@FindBy(name="pass")
	private WebElement passwordField;
		
	@FindBy(css="input.button")
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
