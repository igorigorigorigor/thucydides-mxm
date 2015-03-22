package mpro.widgets_test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.pages.PageObject;

public class TwitterNewsPage extends PageObject{

	@FindBy(xpath=".//*[@id='main_content']/div[3]/table[1]/tbody/tr[2]/td/div/div")
	private WebElement lastNews;

	
	public TwitterNewsPage(WebDriver driver) {
		super(driver);
	}
	
	public String getNewNews() {
		return element(lastNews).toString();
	}

}
