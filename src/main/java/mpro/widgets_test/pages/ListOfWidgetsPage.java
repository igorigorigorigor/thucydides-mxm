package mpro.widgets_test.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://m.megafonpro.ru/widgets")
public class ListOfWidgetsPage extends PageObject {

	@FindBy(css=".newsToday>tbody>tr>td")
	private List<WebElement> widgetList;
	
	@FindBy(css="input.searchButton")
	private WebElement submitButton;
	
	private boolean clean = false;
	
	public ListOfWidgetsPage(WebDriver driver) {
		super(driver);
	}
	
	public void enableWidget(String nameWidget)
	{
		this.cleanWidgetList();
		for (WebElement row: widgetList)
		{
			if (getRowName(row).equals(nameWidget))
			{
				if (!onCheched(row))	{
					element(getRowCheckbox(row)).click();
					}
				
				break;
			}
		}
	}
	
	public void disableWidget(String nameWidget) {
		this.cleanWidgetList();
		for (WebElement row: widgetList)
		{
			if (getRowName(row).equals(nameWidget))
			{
				if (onCheched(row))	{
					element(getRowCheckbox(row)).click();
					}
				
				break;
			}
		}
	}
	
	public boolean onVidgetCheched(String nameWidget){
		this.cleanWidgetList();
		for (WebElement row: widgetList)
		{
			if (getRowName(row).equals(nameWidget))
			{
				if (onCheched(row))	{
					return true;
					}
				
				break;
			}
		}
		return false;
}

	
	public void saveListOfWidgets(){
		element(submitButton).click();
	}
	
	private static String getRowName(WebElement row) {
		return row.findElement(By.cssSelector(".font_115")).getText();
	}
	
	private static WebElement getRowCheckbox(WebElement row) 
	{
		return row.findElement(By.cssSelector(".checkBox"));
	}
	
	private static boolean onCheched(WebElement row) {
		if (getRowCheckbox(row).getAttribute("checked") == null) return false;
		return getRowCheckbox(row).getAttribute("checked").equals("true");
	}
	
	

	private void cleanWidgetList(){
		if (!clean){
			widgetList.remove(widgetList.size()-1);
			widgetList.remove(widgetList.size()-1);
			widgetList.remove(widgetList.size()-1);
			clean = true;
		}
	}

}
