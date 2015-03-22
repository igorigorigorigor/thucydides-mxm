package mpro.widgets_test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.pages.PageObject;

public class FacebookNewsPage extends PageObject{

	@FindBy(xpath=".//*[@id='m_newsfeed_stream']/div/div[1]")
	private WebElement lastNews;

	
	public FacebookNewsPage(WebDriver driver) {
		super(driver);
	}
	
	public String getNewNews() {
		return this.getNewsBody(lastNews);
	}

	public String getNewsBody(WebElement row){
		return row.findElement(By.xpath("//span")).getText();
	}
	
}
