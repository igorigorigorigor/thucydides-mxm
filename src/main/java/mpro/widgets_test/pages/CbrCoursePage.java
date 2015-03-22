package mpro.widgets_test.pages;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.thucydides.core.pages.PageObject;

public class CbrCoursePage extends PageObject {
	
	@FindBy(xpath = "//table[2]/tbody/tr/td[2]")
	private List<WebElement> listOfCourse;

	public BigDecimal getCourse(String codeCurrency) {
		
		int countOfRow = super.getDriver().findElements(By.xpath("//table[2]/tbody/tr/td[2]")).size()-1;
		for (int i=2; i < countOfRow ; i++)
		{
			if (super.getDriver().findElement(By.xpath("//table[2]/tbody/tr["+i+"]/td[2]")).getText().trim().equals(codeCurrency)){
				return new BigDecimal(super.getDriver().findElement(By.xpath("//table[2]/tbody/tr["+i+"]/td[5]")).getText().replace(',', '.').trim()).setScale(2,BigDecimal.ROUND_HALF_DOWN);
			}
		}

		return null;
		
	}

	public CbrCoursePage(WebDriver driver) {
		super(driver);
	}
	
	public void OpenCbrCoursePage() {
		Calendar c=Calendar.getInstance();
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH)+1;
		int day=c.get(Calendar.DAY_OF_MONTH); 
		super.getDriver().navigate().to("http://www.cbr.ru/currency_base/daily.aspx?C_month="+month+"&C_year=" + year+ "&date_req=" + day+"." + month+"."+year);
	}

}
