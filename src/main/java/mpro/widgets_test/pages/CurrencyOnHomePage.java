package mpro.widgets_test.pages;

import java.math.BigDecimal;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CurrencyOnHomePage extends HomePage{

	@FindBy(css = ".widgets>tbody>tr>td>div")
	private List<WebElement> currencyFromPage;
	
	public CurrencyOnHomePage(WebDriver driver) {
		super(driver);
	}

	public BigDecimal getUsdCourse() {
		return new BigDecimal(currencyFromPage.get(0).getText().split(" ")[2]).setScale(2,BigDecimal.ROUND_HALF_DOWN);
	}

	public BigDecimal getEurCourse() {
		return new BigDecimal(currencyFromPage.get(1).getText().split(" ")[2]).setScale(2,BigDecimal.ROUND_HALF_DOWN);
	}

}
