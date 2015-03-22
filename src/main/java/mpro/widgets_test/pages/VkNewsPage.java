package mpro.widgets_test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.pages.PageObject;

public class VkNewsPage extends PageObject{

	@FindBy(xpath=".//*[@id='mcont']/div/div[2]/div[1]")
	private WebElement lastNews;

	
	public VkNewsPage(WebDriver driver) {
		super(driver);
	}
	
	public String getNewNews() {
		return this.getNewsBody(lastNews);
	}

	public String getNewsBody(WebElement row){
		return row.findElement(By.cssSelector(".pi_text")).getText();
	}
	
	public String getNewsTime(WebElement row){
		return row.findElement(By.cssSelector(".pi_date")).getText();
	}


}
