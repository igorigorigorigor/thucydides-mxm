package mpro.widgets_test.steps;

import java.math.BigDecimal;

import mpro.widgets_test.pages.CbrCoursePage;
import mpro.widgets_test.pages.CurrencyOnHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import static org.fest.assertions.Assertions.assertThat;

public class EndUserCurrencySteps extends EndUserBaseSteps {
	
	CurrencyOnHomePage currencyOnHomePage;
	CbrCoursePage cbrCoursePage;
	
   public EndUserCurrencySteps(Pages pages) {
        super(pages);
    }
    
   @Step
   public void openCbrCoursePage() {
	   cbrCoursePage.OpenCbrCoursePage();
   }
   
   @Step
   public BigDecimal getUsdCourceFromWidget() {
	   return currencyOnHomePage.getUsdCourse();
   }
   
   @Step
   public BigDecimal getEurCourceFromWidget() {
	   return currencyOnHomePage.getEurCourse();
   }
   
   @Step
   public BigDecimal getCourceFromCbr(String currency) {
	   return cbrCoursePage.getCourse(currency);
   }
   
   @Step
   public void matchCourse(BigDecimal courseFromWidget, BigDecimal courseFromCBR) {
	   assertThat(courseFromWidget.equals(courseFromCBR));
   }
   
}