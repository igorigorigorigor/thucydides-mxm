package mpro.widgets_test.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("http://m.megafonpro.ru/login/new")
public class AltergeoLoginPage extends PageObject{
	
	public AltergeoLoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="altergeo_email")
	private WebElement loginField;
		
	@FindBy(id="altergeo_password")
	private WebElement passwordField;
		
	@FindBy(name="commit")
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
